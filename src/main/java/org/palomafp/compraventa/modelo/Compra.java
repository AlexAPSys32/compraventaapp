package org.palomafp.compraventa.modelo;
import java.util.Date;
/**
 * Esta clase representa la compra que realiza un usuario, indicando todos los detalles.
 * @author Miguel
 * @author Alejandro
 */
public class Compra {
    private int idCompra;
    private Date fecha;
    private int precio;
    private Tienda tienda;
    private Producto producto;
    private int unidades;

    /**
     * Constructor con parámetros para crear una compra.
     * @param idCompra el ID de la compra
     * @param fecha la fecha de la compra
     * @param precio el precio de la compra
     * @param tienda la tienda donde se realizó la compra
     * @param producto el producto comprado
     * @param unidades el número de unidades
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
     * Constructor por defecto.
     */
    public Compra() {
    }

    /**
     * Obtiene el ID de la compra.
     * @return el ID de la compra
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * Establece el ID de la compra.
     * @param idCompra el ID de la compra a establecer
     */
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * Obtiene el producto de la compra.
     * @return el producto de la compra
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto de la compra.
     * @param producto el producto a establecer
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene el número de unidades.
     * @return el número de unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Establece el número de unidades.
     * @param unidades el número de unidades a establecer
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Obtiene la fecha de la compra.
     * @return la fecha de la compra
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la compra.
     * @param fecha la fecha a establecer
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el precio de la compra.
     * @return el precio de la compra
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la compra.
     * @param precio el precio a establecer
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la tienda de la compra.
     * @return la tienda de la compra
     */
    public Tienda getTienda() {
        return tienda;
    }

    /**
     * Establece la tienda de la compra.
     * @param tienda la tienda a establecer
     */
    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    /**
     * @return representación en cadena de la compra
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
