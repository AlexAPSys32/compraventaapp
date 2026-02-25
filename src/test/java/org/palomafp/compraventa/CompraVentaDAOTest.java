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

	@Test
	public void testGetAllCompras() {
		ComprasDAO comprasDAO = new ComprasDAO();
		ArrayList<Compra> compras = comprasDAO.getAllCompras();
		assertEquals(2, compras.size());
	}

	@Test
	public void testGetAllComprasisNull() {
		ComprasDAO comprasDAO = new ComprasDAO();
		ArrayList<Compra> compras = comprasDAO.getAllCompras();
		assertEquals(null, compras);
	}

	@Test
	public void testGetRandomCompra() {
		Compra compraRandom = getRandomCompra();
	}

	@Test
	public void testMostrarInfo_contieneInformacionCorrecta() {
		String info = ComprasDAO.mostrarInfo();
		// Desde la creación en el DAO: genero=Acción, creadores=Naughty Dog, idUsuario=user123 y cartera=100
		assertTrue(info.contains("Acción"), "Se esperaba que la salida contuviera el género 'Acción'");
		assertTrue(info.contains("Naughty Dog"), "Se esperaba que la salida contuviera 'Naughty Dog'");
		assertTrue(info.contains("user123"), "Se esperaba que la salida contuviera el id de usuario 'user123'");
		assertTrue(info.contains("100"), "Se esperaba que la salida contuviera la cartera '100'");
	}

}
