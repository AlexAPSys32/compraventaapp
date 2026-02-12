package org.palomafp.compraventa.modelo;
import java.util.Date;

public class Compra {
    private int idCompra;
    private Date fecha;
    private int precio;
    private Tienda tienda;
    private Producto producto;
    private int unidades;

    public Compra(int idCompra, Date fecha, int precio, Tienda tienda, Producto producto, int unidades) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.precio = precio;
        this.tienda = tienda;
        this.producto = producto;
        this.unidades = unidades;
    }

    public Compra() {
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra=" + idCompra +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", tienda=" + tienda +
                ", producto=" + producto +
                ", unidades=" + unidades +
                '}';
    }
}
