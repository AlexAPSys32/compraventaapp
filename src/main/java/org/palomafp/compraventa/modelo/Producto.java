package org.palomafp.compraventa.modelo;

import java.util.List;

public class Producto {
    private int precio;
    private String estado;
    private String descripcion;
    private Tienda tienda;
    private String nombre;
    private int idProducto;
    private List<HistorialPrecios> historialPrecios;

    public Producto(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, List<HistorialPrecios> historialPrecios) {
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.tienda = tienda;
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.historialPrecios = historialPrecios;
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

    public List<HistorialPrecios> getHistorialPrecios() {
        return historialPrecios;
    }

    public void setHistorialPrecios(List<HistorialPrecios> historialPrecios) {
        this.historialPrecios = historialPrecios;
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
                ", historialPrecios=" + historialPrecios +
                '}';
    }
}