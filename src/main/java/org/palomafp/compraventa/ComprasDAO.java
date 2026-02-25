package org.palomafp.compraventa;

import java.util.ArrayList;
import java.util.Date;

import org.palomafp.compraventa.modelo.*;

public class ComprasDAO {

    private ArrayList <Compra> compras = null;

    public ComprasDAO() {
        //Crear lista compras vacía
        this.compras = new ArrayList<Compra>();

        // Crear tiendas
        Tienda tienda1 = new Tienda("Madrid Centro", new Date(), "GameStore Plus");
        Tienda tienda2 = new Tienda("Barcelona Mall", new Date(), "Electronics Hub");

        // Crear historial de precios
        ArrayList<HistorialPrecios> historialP1 = new ArrayList<HistorialPrecios>();
        historialP1.add(new HistorialPrecios(new Date(), 60));
        historialP1.add(new HistorialPrecios(new Date(), 50));

        ArrayList<HistorialPrecios> historialP2 = new ArrayList<HistorialPrecios>();
        historialP2.add(new HistorialPrecios(new Date(), 25));

        // 1. Producto Videojuego
        Videojuego videojuego = new Videojuego(59, "Nuevo", "Un juego de acción futurista", tienda1, "Cyberpunk 2077", 1, historialP1, "Ciencia Ficción", 18, "CD Projekt Red", "PC/PS5/Xbox");
        //Crear compra y añadir a la lista
        Compra compra1 = new Compra(101, new Date(), 59, tienda1, videojuego, 1);
        compras.add(compra1);

        // 2. Producto Merchandising
        Merchandising merchandising = new Merchandising(19, "Nuevo", "Figura de acción de un personaje popular", tienda2, "Figura de acción de Spiderman", 2, new ArrayList<HistorialPrecios>(), "Figuras", false);
        //Crear compra y añadir a la lista
        Compra compra2 = new Compra(102, new Date(), 19, tienda2, merchandising, 1);
        compras.add(compra2);
    }

    public Compra getByidCompra(int idCompra) {
        for (Compra compra : compras) {
            if (compra.getIdCompra() == idCompra) {
                return compra;
            }
        }
        return null;
    }

    public Compra getRandomCompra() {
        if (!compras.isEmpty()) {
            int randomIndex = (int) (Math.random() * compras.size());
            return compras.get(randomIndex);
        }
        return null;
    }

    public ArrayList<Compra> getAllCompras() {
        return compras;
    }

    public void mostrarMerchandising() {
        System.out.println("\n=== MERCHANDISING ===");
        boolean encontrado = false;
        for (Compra compra : compras) {
            if (compra.getProducto() instanceof Merchandising) {
                encontrado = true;
                Merchandising merch = (Merchandising) compra.getProducto();
                System.out.println("Merchandising{" +
                        "nombre=" + merch.getNombre() +
                        ", precio=" + merch.getPrecio() +
                        ", categoria=" + merch.getCategoria() +
                        ", descripción=" + merch.getDescripcion() +
                        ", estado=" + merch.getEstado() +
                        '}');
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos Merchandising disponibles.");
        }
    }

    
}