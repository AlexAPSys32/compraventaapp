package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa el objeto videojuego que hereda de producto. Tiene la funcion de mostrar todos los detalles del videojuego que adquiere el usuario.
 * @author Miguel
 * @author Alejandro
 */
public class Videojuego extends Producto {
    private String genero;
    private int calificacion;
    private String creadores;
    private String plataforma;

    /**
     * Constructor con parámetros para crear un videojuego.
     * @param precio el precio del videojuego
     * @param estado el estado del videojuego
     * @param descripcion la descripción del videojuego
     * @param tienda la tienda del videojuego
     * @param nombre el nombre del videojuego
     * @param idProducto el ID del producto
     * @param historialPrecios el historial de precios
     * @param genero el género del videojuego
     * @param calificacion la calificación del videojuego
     * @param creadores los creadores del videojuego
     * @param plataforma la plataforma del videojuego
     */
    public Videojuego(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios, String genero, int calificacion, String creadores, String plataforma) {
        super(precio, estado, descripcion, tienda, nombre, idProducto, historialPrecios);
        this.genero = genero;
        this.calificacion = calificacion;
        this.creadores = creadores;
        this.plataforma = plataforma;
    }

    /**
     * Constructor por defecto.
     */
    public Videojuego() {
        super();
    }

    /**
     * Obtiene el género del videojuego.
     * @return el género del videojuego
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del videojuego.
     * @param genero el género a establecer
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la calificación del videojuego.
     * @return la calificación del videojuego
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación del videojuego.
     * @param calificacion la calificación a establecer
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene los creadores del videojuego.
     * @return los creadores del videojuego
     */
    public String getCreadores() {
        return creadores;
    }

    /**
     * Establece los creadores del videojuego.
     * @param creadores los creadores a establecer
     */
    public void setCreadores(String creadores) {
        this.creadores = creadores;
    }

    /**
     * Obtiene la plataforma del videojuego.
     * @return la plataforma del videojuego
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Establece la plataforma del videojuego.
     * @param plataforma la plataforma a establecer
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "genero='" + genero + '\'' +
                ", calificacion=" + calificacion +
                ", creadores='" + creadores + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
