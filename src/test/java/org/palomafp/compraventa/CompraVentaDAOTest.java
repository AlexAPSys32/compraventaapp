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
		String all = comprasDAO.getAllCompras();
		boolean vacio = false;
		if(all == null || all.isEmpty() || all.isBlank()) {
			vacio = true;
		}

		assertFalse(vacio, "La lista no debe estar vacia");
		assertNotNull(all, "La lista no debe ser nula");
		assertTrue(all.contains("Compra"), "Debe contener compras");
		assertTrue(all.contains("idCompra="), "Debe contener IDs de compra");
	}

	/**
	 * Prueba que verifica que se puede obtener una compra aleatoria y no es nula.
	 */
	@Test
	public void testGetRandomCompra() {
		String mostrar = comprasDAO.getRandomCompra();

		assertNotNull(mostrar);
		assertFalse(mostrar.isEmpty(), "La compra aleatoria no debe estar vacía");
		assertTrue(mostrar.contains("Compra"), "Debe contener 'Compra'");
		assertTrue(mostrar.contains("idCompra="), "Debe tener el campo idCompra");
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
		assertNotNull(mostrar, "La compra no debe ser nula");
		assertFalse(mostrar.isEmpty(), "La compra no debe estar vacía");
		assertTrue(mostrar.contains("101"), "Debe contener el ID 101");
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
		assertNull(mostrar, "La compra debe ser nula");
		assertEquals(null, mostrar, "Debe devolver null");
	}

}
