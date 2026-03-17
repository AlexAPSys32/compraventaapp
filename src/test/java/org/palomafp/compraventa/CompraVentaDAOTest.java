package org.palomafp.compraventa;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase ComprasDAO.
 * Verifica el correcto funcionamiento de los métodos de acceso a datos de compras.
 */
public class CompraVentaDAOTest {

	ComprasDAO comprasDAO = new ComprasDAO();

	/**
	 * Prueba que verifica que la lista de todas las compras no esté vacía.
	 */
	@Test
	public void testGetAllCompras() {
		boolean vacio = false;
		if(comprasDAO.getAllCompras() == null || comprasDAO.getAllCompras().isEmpty() ||comprasDAO.getAllCompras().isBlank()) {
			vacio = true;
		}

		assertFalse(vacio, "La lista no debe estar vacia");
	}

	/**
	 * Prueba que verifica que se puede obtener una compra aleatoria y no es nula.
	 */
	@Test
	public void testGetRandomCompra() {
		String mostrar = comprasDAO.getRandomCompra();

		assertNotNull(mostrar);
	}

	/**
	 * Prueba que verifica que se puede buscar una compra existente por ID.
	 */
	@Test
	public void testGetByidCompraTrue() {
		String mostrar = comprasDAO.getByidCompra(101);
		boolean mostrado = true;
		if(mostrar == null) {
			mostrado = false;
		}

		assertTrue(mostrado, "La compra se ha mostrado");
	}

	/**
	 * Prueba que verifica que buscar una compra inexistente por ID devuelve null.
	 */
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
