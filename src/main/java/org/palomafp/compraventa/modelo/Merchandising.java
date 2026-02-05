package org.palomafp.compraventa.modelo;

public class Merchandising extends Producto {
    private String categoria;
    private boolean requiereEnvioEspecial;

    public Merchandising(String categoria, boolean requiereEnvioEspecial) {
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
