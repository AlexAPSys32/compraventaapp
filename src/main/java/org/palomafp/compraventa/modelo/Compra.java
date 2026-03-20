package org.palomafp.compraventa.modelo;
import java.util.Date;
/**
 * Esta clase representa la compra que realiza un usuario, indicando todos los detalles.
 */
public class Compra {
    private int idCompra;
    private Date fecha;
    private int precio;
    private Tienda tienda;
    private Producto producto;
    private int unidades;

    /**
     * Constructor completo para crear una compra con todos sus datos.
     * 
     * @param idCompra El identificador único de la compra
     * @param fecha La fecha en que se realizó la compra
     * @param precio El precio total de la compra
     * @param tienda La tienda donde se realizó la compra
     * @param producto El producto comprado
     * @param unidades La cantidad de unidades compradas
     */
    public Compra(int idCompra, Date fecha, int precio, Tienda tienda, Producto producto, int unidades) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.precio = precio;
        this.tienda = tienda;
        this.producto = producto;
        this.unidades = unidades;
    }

    /**
     * Constructor vacío para crear una compra sin datos iniciales.
     */
    public Compra() {
    }

    /**
     * Obtiene el identificador único de la compra.
     * 
     * @return El ID de la compra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * Establece el identificador único de la compra.
     * 
     * @param idCompra El nuevo ID de la compra
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * Obtiene el producto comprado.
     * 
     * @return El producto de la compra
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto comprado.
     * 
     * @param producto El nuevo producto de la compra
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad de unidades compradas.
     * 
     * @return El número de unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Establece la cantidad de unidades compradas.
     * 
     * @param unidades El nuevo número de unidades
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Obtiene la fecha de la compra.
     * 
     * @return La fecha de la compra
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la compra.
     * 
     * @param fecha La nueva fecha de la compra
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el precio total de la compra.
     * 
     * @return El precio de la compra
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio total de la compra.
     * 
     * @param precio El nuevo precio de la compra
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la tienda donde se realizó la compra.
     * 
     * @return La tienda de la compra
     */
    public Tienda getTienda() {
        return tienda;
    }

    /**
     * Establece la tienda donde se realizó la compra.
     * 
     * @param tienda La nueva tienda de la compra
     */
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    /**
     * Devuelve una representación en cadena de la compra.
     * 
     * @return Cadena con todos los datos de la compra
     */
    @Override
    public String toString() {
        return "Compra{" +
                "idCompra=" + idCompra +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", tienda=" + tienda +
                ", producto=" + producto +
                ", unidades=" + unidades +
                '}' + "\n";
    }
}
