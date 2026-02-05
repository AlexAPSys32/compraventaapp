package org.palomafp.compraventa;

import org.palomafp.compraventa.modelo.Usuario;
import org.palomafp.compraventa.modelo.Videojuego;

/**
 * Hello world!
 *
 */
public class CompraventaDAO 
{

    
    public static String mostrarInfo()
    {

        //Un par de ejemplos de objetos para mostrar su información
        Videojuego videojuego = new Videojuego("Acción", 9, "Naughty Dog", "PlayStation");
        Usuario usuario = new Usuario("Biblioteca Central", "user123", "@correo.com", 100, null);


        return videojuego.toString() + "\n" + usuario.toString();


    }
}