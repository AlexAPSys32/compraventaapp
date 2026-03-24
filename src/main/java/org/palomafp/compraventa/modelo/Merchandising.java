package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa el objeto merchandising que hereda de producto. Tiene la funcion de mostrar todos los detalles del merchandising que adquiere el usuario.
 * @author Miguel
 * @author Alejandro
 */
public class Merchandising extends Producto {
    private String categoria;
    private boolean requiereEnvioEspecial;

    /**
     * Constructor con parámetros para crear un merchandising.
     * @param precio el precio del merchandising
     * @param estado el estado del merchandising
     * @param descripcion la descripción del merchandising
     * @param tienda la tienda del merchandising
     * @param nombre el nombre del merchandising
     * @param idProducto el ID del producto
     * @param historialPrecios el historial de precios
     * @param categoria la categoría del merchandising
     * @param requiereEnvioEspecial si requiere envío especial
     */
    public Merchandising(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios, String categoria, boolean requiereEnvioEspecial) {
        super(precio, estado, descripcion, tienda, nombre, idProducto, historialPrecios);
        this.categoria = categoria;
        this.requiereEnvioEspecial = requiereEnvioEspecial;
    }

    /**
     * Constructor por defecto.
     */
    public Merchandising() {
        super();
    }

    /**
     * Obtiene la categoría del merchandising.
     * @return la categoría del merchandising
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del merchandising.
     * @param categoria la categoría a establecer
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene si requiere envío especial.
     * @return si requiere envío especial
     */
    public boolean isRequiereEnvioEspecial() {
        return requiereEnvioEspecial;
    }

    /**
     * Establece si requiere envío especial.
     * @param requiereEnvioEspecial si requiere envío especial
     */
    public void setRequiereEnvioEspecial(boolean requiereEnvioEspecial) {
        this.requiereEnvioEspecial = requiereEnvioEspecial;
    }

    /**
     * @return representación en cadena del merchandising
     */
    @Override
    public String toString() {  
        return "Merchandising{" +
                "categoria='" + categoria + '\'' +
                ", requiereEnvioEspecial=" + requiereEnvioEspecial +
                '}';
    }
}
