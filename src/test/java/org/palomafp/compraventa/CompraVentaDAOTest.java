package org.palomafp.compraventa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompraVentaDAOTest {

	@Test
	public void testMostrarInfo_notNullAndNotEmpty() {
		String info = CompraventaDAO.mostrarInfo();
		assertNotNull(info, "mostrarInfo no debe ser nulo");
		assertFalse(info.isBlank(), "mostrarInfo no debe ser una cadena vacía");
	}

	@Test
	public void testMostrarInfo_containsVideojuegoAndUsuario() {
		String info = CompraventaDAO.mostrarInfo();
		assertTrue(info.contains("Videojuego"), "Se esperaba que la salida contuviera 'Videojuego'");
		assertTrue(info.contains("Usuario"), "Se esperaba que la salida contuviera 'Usuario'");
	}

	@Test
	public void testMostrarInfo_containsExpectedFields() {
		String info = CompraventaDAO.mostrarInfo();
		// Desde la creación en el DAO: genero=Acción, creadores=Naughty Dog, idUsuario=user123 y cartera=100
		assertTrue(info.contains("Acción"), "Se esperaba que la salida contuviera el género 'Acción'");
		assertTrue(info.contains("Naughty Dog"), "Se esperaba que la salida contuviera 'Naughty Dog'");
		assertTrue(info.contains("user123"), "Se esperaba que la salida contuviera el id de usuario 'user123'");
		assertTrue(info.contains("100"), "Se esperaba que la salida contuviera la cartera '100'");
	}

	@Test
	public void testMostrarInfo_hasNewlineSeparator() {
		String info = CompraventaDAO.mostrarInfo();
		// El DAO concatena dos toString() separados por '\n'
		assertTrue(info.contains("\n"), "Se esperaba un separador de nueva línea entre los objetos");
		String[] parts = info.split("\\n");
		assertEquals(2, parts.length, "Se esperaban exactamente dos líneas (videojuego + usuario)");
	}
}
