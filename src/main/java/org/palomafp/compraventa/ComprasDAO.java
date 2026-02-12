package org.palomafp.compraventa;

import java.util.ArrayList;
import java.util.Date;

import org.palomafp.compraventa.modelo.*;
/**
 * Hello world!
 *
 */
public class ComprasDAO 
{

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
        Compra compra1 = new Compra(new Date(), 59, tienda1, videojuego, 1);
        compras.add(compra1);

        // 2. Producto Merchandising
        Merchandising merchandising = new Merchandising(19, "Nuevo", "Figura de acción de un personaje popular", tienda2, "Figura de acción de Spiderman", 2, new ArrayList<HistorialPrecios>(), "Figuras", false);
        //Crear compra y añadir a la lista
        Compra compra2 = new Compra(new Date(), 19, tienda2, merchandising, 1);
        compras.add(compra2);
    }

    public String[] mostrarCompras() {
        String[] resultado = new String[compras.size()];
        for (int i = 0; i < compras.size(); i++) {
            Compra compra = compras.get(i);
            resultado[i] = "Compra{" +
                    "fecha=" + compra.getFecha() +
                    ", precio=" + compra.getPrecio() +
                    ", tienda=" + compra.getTienda().getNombre() +
                    ", producto=" + compra.getProducto().getNombre() +
                    ", cantidad=" + compra.getUnidades() +
                    '}';
        }
        return resultado;
    }

    
    
}