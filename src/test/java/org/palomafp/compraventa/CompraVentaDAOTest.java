package org.palomafp.compraventa;

import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.palomafp.compraventa.modelo.Compra;
import org.palomafp.compraventa.modelo.HistorialPrecios;
import org.palomafp.compraventa.modelo.Tienda;
import org.palomafp.compraventa.modelo.Videojuego;

import static org.junit.jupiter.api.Assertions.*;

public class CompraVentaDAOTest {

	ComprasDAO comprasDAO = new ComprasDAO();

	@Test
	public void testGetAllCompras() {
		boolean vacio = false;
		if(comprasDAO.getAllCompras() == null || comprasDAO.getAllCompras().isEmpty() ||comprasDAO.getAllCompras().isBlank()) {
			vacio = true;
		}

		assertFalse(vacio, "La lista no debe estar vacia");
	}

	@Test
	public void testGetRandomCompra() {
		String mostrar = comprasDAO.getRandomCompra();

		assertNotNull(mostrar);
	}

	@Test
	public void testGetByidCompraTrue() {
		String mostrar = comprasDAO.getByidCompra(101);
		boolean mostrado = true;
		if(mostrar == null) {
			mostrado = false;
		}

		assertTrue(mostrado, "La compra se ha mostrado");
	}

		@Test
	public void testGetByidCompraFalse() {
		String mostrar = comprasDAO.getByidCompra(99);
		boolean mostrado = true;
		if(mostrar == null) {
			mostrado = false;
		}

		assertFalse(mostrado, "La compra no se ha mostrado");
	}

}
