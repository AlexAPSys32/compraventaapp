package org.palomafp.compraventa.modelo;
import java.util.Date;

public class Compras {
    private String producto;
    private Date fecha;
    private int precio;
    private Tienda tienda;

    public Compras(String producto, Date fecha, int precio, Tienda tienda) {
        this.producto = producto;
        this.fecha = fecha;
        this.precio = precio;
        this.tienda = tienda;
    }

    public Compras() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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
        return "Compras{" +
                "producto='" + producto + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", tienda=" + tienda +
                '}';
    }
}
