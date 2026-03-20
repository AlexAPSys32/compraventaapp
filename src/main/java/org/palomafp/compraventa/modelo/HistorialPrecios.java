package org.palomafp.compraventa.modelo;

import java.util.Date;
/**
 * Esta clase representa todos los precios que ha tenido un producto a lo largo de su historia.
 */
public class HistorialPrecios {
    private Date fecha;
    private int precio;

    /**
     * Constructor completo para crear un registro de historial de precios.
     * 
     * @param fecha La fecha del registro de precio
     * @param precio El precio del producto en esa fecha
     */
    public HistorialPrecios(Date fecha, int precio) {
        this.fecha = fecha;
        this.precio = precio;
    }

    /**
     * Constructor vacío para crear un historial de precios sin datos iniciales.
     */
    public HistorialPrecios() {
    }

    /**
     * Obtiene la fecha del registro de precio.
     * 
     * @return La fecha del registro
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del registro de precio.
     * 
     * @param fecha La nueva fecha del registro
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el precio registrado.
     * 
     * @return El precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio registrado.
     * 
     * @param precio El nuevo precio del producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Devuelve una representación en cadena del historial de precios.
     * 
     * @return Cadena con la fecha y precio del registro
     */
    @Override
    public String toString() {
        return "HistorialPrecios{" +
                "fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }
}
