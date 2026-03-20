package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa el el producto como tal que un usuario puede comprar. De esta clase heredan Videojuego y Merchandising, puesto que ambos son productos.
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
     * Constructor completo para crear un producto con todos sus datos.
     * 
     * @param precio El precio del producto
     * @param estado El estado del producto (nuevo, usado, etc.)
     * @param descripcion La descripción del producto
     * @param tienda La tienda donde se vende el producto
     * @param nombre El nombre del producto
     * @param idProducto El identificador único del producto
     * @param historialPrecios Lista del historial de precios del producto
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
     * Constructor vacío para crear un producto sin datos iniciales.
     */
    public Producto() {
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return El precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio El nuevo precio del producto
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el estado del producto.
     * 
     * @return El estado del producto
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del producto.
     * 
     * @param estado El nuevo estado del producto
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la descripción del producto.
     * 
     * @return La descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     * 
     * @param descripcion La nueva descripción del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la tienda donde se vende el producto.
     * 
     * @return La tienda del producto
     */
    public Tienda getTienda() {
        return tienda;
    }

    /**
     * Establece la tienda donde se vende el producto.
     * 
     * @param tienda La nueva tienda del producto
     */
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return El nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre El nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador único del producto.
     * 
     * @return El ID del producto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Establece el identificador único del producto.
     * 
     * @param idProducto El nuevo ID del producto
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Obtiene el historial de precios del producto.
     * 
     * @return Lista del historial de precios
     */
    public ArrayList<HistorialPrecios> getHistorialPrecios() {
        return historialPrecios;
    }

    /**
     * Establece el historial de precios del producto.
     * 
     * @param historialPrecios La nueva lista del historial de precios
     */
    public void setHistorialPrecios(ArrayList<HistorialPrecios> historialPrecios) {
        this.historialPrecios = historialPrecios;
    }

    /**
     * Devuelve una representación en cadena del producto.
     * 
     * @return Cadena con todos los datos del producto
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
