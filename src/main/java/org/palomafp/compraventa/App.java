package org.palomafp.compraventa;

import org.palomafp.compraventa.modelo.Compras;
import org.palomafp.compraventa.modelo.Videojuego;
import org.palomafp.compraventa.modelo.HistorialPrecios;
import org.palomafp.compraventa.modelo.Merchandising;
import org.palomafp.compraventa.modelo.Tienda;
import org.palomafp.compraventa.modelo.Usuario;
import org.palomafp.compraventa.modelo.Producto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Compras compra = new Compras("The Legend of Zelda: Breath of the Wild", new java.util.Date(), 59, null);
        HistorialPrecios historial = new HistorialPrecios(new java.util.Date(), 59);
        Tienda tienda = new Tienda("Calle Mayor, 123", new java.util.Date(), "Tienda de Videojuegos");
        Producto producto = new Producto(59, "Nuevo", "Juego de aventura y acción", tienda, "The Legend of Zelda: Breath of the Wild", 1);
        Usuario usuario = new Usuario("Biblioteca Central", "user123", "user123@example.com", 100);
        Merchandising merchandising = new Merchandising("Camiseta", false, 1);  
        Videojuego videojuego = new Videojuego("Aventura", 10, "Nintendo", "Nintendo Switch");

        System.out.println(compra);
        System.out.println(historial);  
        System.out.println(tienda);
        System.out.println(producto);
        System.out.println(usuario);
        System.out.println(merchandising);
        System.out.println(videojuego);



    }
}
