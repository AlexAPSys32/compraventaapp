package org.palomafp.compraventa.modelo;

import java.util.List;

public class Usuario {
    private String biblioteca;
    private String idUsuario;
    private String correo;
    private int cartera;
    private List<Compra> compras;

    public Usuario(String biblioteca, String idUsuario, String correo, int cartera, List<Compra> compras) {
        this.biblioteca = biblioteca;
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.cartera = cartera;
        this.compras = compras;
    }

    public Usuario() {
    }

    public String getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCartera() {
        return cartera;
    }

    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "biblioteca='" + biblioteca + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", correo='" + correo + '\'' +
                ", cartera=" + cartera +
                ", compras=" + compras +
                '}';
    }
}
