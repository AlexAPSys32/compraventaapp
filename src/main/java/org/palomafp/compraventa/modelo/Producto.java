package org.palomafp.compraventa.modelo;

public class Producto {
    private int precio;
    private String estado;
    private String descripcion;
    private Tienda tienda;
    private String nombre;
    private int idProducto;

    public Producto(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto) {
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.tienda = tienda;
        this.nombre = nombre;
        this.idProducto = idProducto;
    }

    public Producto() {
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", estado='" + estado + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tienda=" + tienda +
                ", nombre='" + nombre + '\'' +
                ", idProducto=" + idProducto +
                '}';
    }
}