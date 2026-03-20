package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa el objeto videojuego que hereda de producto. Tiene la funcion de mostrar todos los detalles del videojuego que adquiere el usuario.
 */
public class Videojuego extends Producto {
    private String genero;
    private int calificacion;
    private String creadores;
    private String plataforma;

    /**
     * Constructor completo para crear un videojuego con todos sus datos.
     * 
     * @param precio El precio del videojuego
     * @param estado El estado del videojuego (nuevo, usado, etc.)
     * @param descripcion La descripción del videojuego
     * @param tienda La tienda donde se vende el videojuego
     * @param nombre El nombre del videojuego
     * @param idProducto El identificador único del videojuego
     * @param historialPrecios Lista del historial de precios del videojuego
     * @param genero El género del videojuego (acción, aventura, etc.)
     * @param calificacion La calificación del videojuego
     * @param creadores Los creadores o desarrolladores del videojuego
     * @param plataforma La plataforma del videojuego (PC, PlayStation, Xbox, etc.)
     */
    public Videojuego(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios, String genero, int calificacion, String creadores, String plataforma) {
        super(precio, estado, descripcion, tienda, nombre, idProducto, historialPrecios);
        this.genero = genero;
        this.calificacion = calificacion;
        this.creadores = creadores;
        this.plataforma = plataforma;
    }

    /**
     * Constructor vacío para crear un videojuego sin datos iniciales.
     */
    public Videojuego() {
        super();
    }

    /**
     * Obtiene el género del videojuego.
     * 
     * @return El género del videojuego
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del videojuego.
     * 
     * @param genero El nuevo género del videojuego
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la calificación del videojuego.
     * 
     * @return La calificación del videojuego
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * Establece la calificación del videojuego.
     * 
     * @param calificacion La nueva calificación del videojuego
     */
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Obtiene los creadores del videojuego.
     * 
     * @return Los creadores del videojuego
     */
    public String getCreadores() {
        return creadores;
    }

    /**
     * Establece los creadores del videojuego.
     * 
     * @param creadores Los nuevos creadores del videojuego
     */
    public void setCreadores(String creadores) {
        this.creadores = creadores;
    }

    /**
     * Obtiene la plataforma del videojuego.
     * 
     * @return La plataforma del videojuego
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Establece la plataforma del videojuego.
     * 
     * @param plataforma La nueva plataforma del videojuego
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * Devuelve una representación en cadena del videojuego.
     * 
     * @return Cadena con todos los datos específicos del videojuego
     */
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
