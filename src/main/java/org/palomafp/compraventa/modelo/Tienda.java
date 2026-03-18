package org.palomafp.compraventa.modelo;

import java.util.Date;
/**
 * Esta clase representa la tienda donde se van a adquirir todos los productos.
 */
public class Tienda {
    private String ubicacion;
    private Date horario;
    private String nombre;

    /**
     * Constructor completo para crear una tienda con todos sus datos.
     * 
     * @param ubicacion La ubicación de la tienda
     * @param horario El horario de apertura de la tienda
     * @param nombre El nombre de la tienda
     */
    public Tienda(String ubicacion, Date horario, String nombre) {
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.nombre = nombre;
    }

    /**
     * Constructor vacío para crear una tienda sin datos iniciales.
     */
    public Tienda() {
    }

    /**
     * Obtiene la ubicación de la tienda.
     * 
     * @return La ubicación de la tienda
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación de la tienda.
     * 
     * @param ubicacion La nueva ubicación de la tienda
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el horario de apertura de la tienda.
     * 
     * @return El horario de la tienda
     */
    public Date getHorario() {
        return horario;
    }

    /**
     * Establece el horario de apertura de la tienda.
     * 
     * @param horario El nuevo horario de la tienda
     */
    public void setHorario(Date horario) {
        this.horario = horario;
    }

    /**
     * Obtiene el nombre de la tienda.
     * 
     * @return El nombre de la tienda
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la tienda.
     * 
     * @param nombre El nuevo nombre de la tienda
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en cadena de la tienda.
     * 
     * @return Cadena con todos los datos de la tienda
     */
    @Override
    public String toString() {
        return "Tienda{" +
                "ubicacion='" + ubicacion + '\'' +
                ", horario=" + horario +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
