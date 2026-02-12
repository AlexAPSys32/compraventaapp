package org.palomafp.compraventa;

import java.util.ArrayList;
import java.util.Date;

import org.palomafp.compraventa.modelo.HistorialPrecios;
import org.palomafp.compraventa.modelo.Merchandising;
import org.palomafp.compraventa.modelo.Producto;
import org.palomafp.compraventa.modelo.Tienda;
import org.palomafp.compraventa.modelo.Usuario;
import org.palomafp.compraventa.modelo.Videojuego;

/**
 * Hello world!
 *
 */
public class CompraventaDAO 
{

    private ArrayList <Producto> productos = null;

    public CompraventaDAO() {
        this.productos = new ArrayList<Producto>();

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
        productos.add(videojuego);

        // 2. Producto con HistorialPrecios
        Producto productoHistorial = new Producto(120, "Excelente", "Consola de última generación", tienda1, "PlayStation 5", 2, historialP2);
        productos.add(productoHistorial);

        // 3. Producto Merchandising
        Merchandising merchandising = new Merchandising(15, "Disponible", "Camiseta con logo del juego", tienda2, "Camiseta Gaming", 3, new ArrayList<HistorialPrecios>(), "Ropa", false);
        productos.add(merchandising);

        // 4. Producto asociado a Tienda 2
        ArrayList<HistorialPrecios> historialP3 = new ArrayList<HistorialPrecios>();
        historialP3.add(new HistorialPrecios(new Date(), 40));
        Producto productoTienda2 = new Producto(35, "Disponible", "Teclado mecánico para gaming", tienda2, "Teclado RGB", 4, historialP3);
        productos.add(productoTienda2);

        // 5. Producto normal
        ArrayList<HistorialPrecios> historialP4 = new ArrayList<HistorialPrecios>();
        historialP4.add(new HistorialPrecios(new Date(), 30));
        Producto producto5 = new Producto(28, "Disponible", "Ratón inalámbrico de precisión", tienda2, "Ratón Gaming", 5, historialP4);
        productos.add(producto5);
    }

    
}