package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa el objeto merchandising que hereda de producto. Tiene la funcion de mostrar todos los detalles del merchandising que adquiere el usuario.
 */
public class Merchandising extends Producto {
    private String categoria;
    private boolean requiereEnvioEspecial;

    /**
     * Constructor completo para crear un merchandising con todos sus datos.
     * 
     * @param precio El precio del merchandising
     * @param estado El estado del merchandising (nuevo, usado, etc.)
     * @param descripcion La descripción del merchandising
     * @param tienda La tienda donde se vende el merchandising
     * @param nombre El nombre del merchandising
     * @param idProducto El identificador único del merchandising
     * @param historialPrecios Lista del historial de precios del merchandising
     * @param categoria La categoría del merchandising (ropa, accesorios, etc.)
     * @param requiereEnvioEspecial Indica si el merchandising requiere envío especial
     */
    public Merchandising(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios, String categoria, boolean requiereEnvioEspecial) {
        super(precio, estado, descripcion, tienda, nombre, idProducto, historialPrecios);
        this.categoria = categoria;
        this.requiereEnvioEspecial = requiereEnvioEspecial;
    }

    /**
     * Constructor vacío para crear un merchandising sin datos iniciales.
     */
    public Merchandising() {
        super();
    }

    /**
     * Obtiene la categoría del merchandising.
     * 
     * @return La categoría del merchandising
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del merchandising.
     * 
     * @param categoria La nueva categoría del merchandising
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Verifica si el merchandising requiere envío especial.
     * 
     * @return true si requiere envío especial, false en caso contrario
     */
    public boolean isRequiereEnvioEspecial() {
        return requiereEnvioEspecial;
    }

    /**
     * Establece si el merchandising requiere envío especial.
     * 
     * @param requiereEnvioEspecial true si requiere envío especial, false en caso contrario
     */
    public void setRequiereEnvioEspecial(boolean requiereEnvioEspecial) {
        this.requiereEnvioEspecial = requiereEnvioEspecial;
    }

    /**
     * Devuelve una representación en cadena del merchandising.
     * 
     * @return Cadena con todos los datos específicos del merchandising
     */
    @Override
    public String toString() {  
        return "Merchandising{" +
                "categoria='" + categoria + '\'' +
                ", requiereEnvioEspecial=" + requiereEnvioEspecial +
                '}';
    }
}
