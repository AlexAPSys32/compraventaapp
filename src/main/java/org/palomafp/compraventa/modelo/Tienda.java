package org.palomafp.compraventa.modelo;

import java.util.Date;
/**
 * Esta clase representa la tienda donde se van a adquirir todos los productos.
 * @author Miguel
 * @author Alejandro
 */
public class Tienda {
    private String ubicacion;
    private Date horario;
    private String nombre;

    /**
     * Constructor con parámetros para crear una tienda.
     * @param ubicacion la ubicación de la tienda
     * @param horario el horario de la tienda
     * @param nombre el nombre de la tienda
     */
    public Tienda(String ubicacion, Date horario, String nombre) {
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.nombre = nombre;
    }

    /**
     * Constructor por defecto.
     */
    public Tienda() {
    }

    /**
     * Obtiene la ubicación de la tienda.
     * @return la ubicación de la tienda
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación de la tienda.
     * @param ubicacion la ubicación a establecer
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Obtiene el horario de la tienda.
     * @return el horario de la tienda
     */
    public Date getHorario() {
        return horario;
    }

    /**
     * Establece el horario de la tienda.
     * @param horario el horario a establecer
     */
    public void setHorario(Date horario) {
        this.horario = horario;
    }

    /**
     * Obtiene el nombre de la tienda.
     * @return el nombre de la tienda
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la tienda.
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return representación en cadena de la tienda
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
