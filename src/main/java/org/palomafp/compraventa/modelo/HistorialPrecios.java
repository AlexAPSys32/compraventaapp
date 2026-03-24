package org.palomafp.compraventa.modelo;

import java.util.Date;
/**
 * Esta clase representa todos los precios que ha tenido un producto a lo largo de su historia.
 * @author Miguel
 * @author Alejandro
 */
public class HistorialPrecios {
    private Date fecha;
    private int precio;

    /**
     * Constructor con parámetros para crear un historial de precios.
     * @param fecha la fecha del precio
     * @param precio el precio
     */
    public HistorialPrecios(Date fecha, int precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    /**
     * Constructor por defecto.
     */
    public HistorialPrecios() {
    }

    /**
     * Obtiene la fecha del historial de precios.
     * @return la fecha del historial de precios
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del historial de precios.
     * @param fecha la fecha a establecer
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el precio del historial.
     * @return el precio del historial
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del historial.
     * @param precio el precio a establecer
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return representación en cadena del historial de precios
     */
    @Override
    public String toString() {
        return "HistorialPrecios{" +
                "fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }
}
