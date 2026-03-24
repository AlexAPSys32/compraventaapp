package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa el el producto como tal que un usuario puede comprar. De esta clase heredan Videojuego y Merchandising, puesto que ambos son productos.
 * @author Miguel
 * @author Alejandro
 */
public class Producto {
    private int precio;
    private String estado;
    private String descripcion;
    private Tienda tienda;
    private String nombre;
    private int idProducto;
    private ArrayList<HistorialPrecios> historialPrecios;

    /**
     * Constructor con parámetros para crear un producto.
     * @param precio el precio del producto
     * @param estado el estado del producto
     * @param descripcion la descripción del producto
     * @param tienda la tienda del producto
     * @param nombre el nombre del producto
     * @param idProducto el ID del producto
     * @param historialPrecios el historial de precios
     */
    public Producto(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios) {
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.tienda = tienda;
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.historialPrecios = historialPrecios;
    }

    /**
     * Constructor por defecto.
     */
    public Producto() {
    }

    /**
     * Obtiene el precio del producto.
     * @return el precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * @param precio el precio a establecer
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el estado del producto.
     * @return el estado del producto
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del producto.
     * @param estado el estado a establecer
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la descripción del producto.
     * @return la descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     * @param descripcion la descripción a establecer
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la tienda del producto.
     * @return la tienda del producto
     */
    public Tienda getTienda() {
        return tienda;
    }

    /**
     * Establece la tienda del producto.
     * @param tienda la tienda a establecer
     */
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    /**
     * Obtiene el nombre del producto.
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del producto.
     * @return el ID del producto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Establece el ID del producto.
     * @param idProducto el ID del producto a establecer
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene el historial de precios.
     * @return el historial de precios
     */
    public ArrayList<HistorialPrecios> getHistorialPrecios() {
        return historialPrecios;
    }

    /**
     * Establece el historial de precios.
     * @param historialPrecios el historial de precios a establecer
     */
    public void setHistorialPrecios(ArrayList<HistorialPrecios> historialPrecios) {
        this.historialPrecios = historialPrecios;
    }

    /**
     * @return representación en cadena del producto
     */
    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tienda=" + tienda +
                ", nombre='" + nombre + '\'' +
                ", idProducto=" + idProducto +
                ", historialPrecios=" + historialPrecios +
                '}';
    }
}