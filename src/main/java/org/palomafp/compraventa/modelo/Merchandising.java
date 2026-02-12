package org.palomafp.compraventa.modelo;

import java.util.ArrayList;

public class Merchandising extends Producto {
    private String categoria;
    private boolean requiereEnvioEspecial;

    public Merchandising(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios, String categoria, boolean requiereEnvioEspecial) {
        super(precio, estado, descripcion, tienda, nombre, idProducto, historialPrecios);
        this.categoria = categoria;
        this.requiereEnvioEspecial = requiereEnvioEspecial;
    }

    public Merchandising() {
        super();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isRequiereEnvioEspecial() {
        return requiereEnvioEspecial;
    }

    public void setRequiereEnvioEspecial(boolean requiereEnvioEspecial) {
        this.requiereEnvioEspecial = requiereEnvioEspecial;
    }

    @Override
    public String toString() {  
        return "Merchandising{" +
                "categoria='" + categoria + '\'' +
                ", requiereEnvioEspecial=" + requiereEnvioEspecial +
                '}';
    }
}
