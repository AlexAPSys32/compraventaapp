package org.palomafp.compraventa.modelo;

public class Merchandising extends Producto {
    private String categoria;
    private boolean requiereEnvioEspecial;
    private int idProducto;

    public Merchandising(String categoria, boolean requiereEnvioEspecial, int idProducto) {
        this.categoria = categoria;
        this.requiereEnvioEspecial = requiereEnvioEspecial;
        this.idProducto = idProducto;
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

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {  
        return "Merchandising{" +
                "categoria='" + categoria + '\'' +
                ", requiereEnvioEspecial=" + requiereEnvioEspecial +
                ", idProducto=" + idProducto +
                '}';
    }
}
