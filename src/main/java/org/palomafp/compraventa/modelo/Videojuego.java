package org.palomafp.compraventa.modelo;

import java.util.ArrayList;

public class Videojuego extends Producto {
    private String genero;
    private int calificacion;
    private String creadores;
    private String plataforma;

    public Videojuego(int precio, String estado, String descripcion, Tienda tienda, String nombre, int idProducto, ArrayList<HistorialPrecios> historialPrecios, String genero, int calificacion, String creadores, String plataforma) {
        super(precio, estado, descripcion, tienda, nombre, idProducto, historialPrecios);
        this.genero = genero;
        this.calificacion = calificacion;
        this.creadores = creadores;
        this.plataforma = plataforma;
    }

    public Videojuego() {
        super();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getCreadores() {
        return creadores;
    }

    public void setCreadores(String creadores) {
        this.creadores = creadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "genero='" + genero + '\'' +
                ", calificacion=" + calificacion +
                ", creadores='" + creadores + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
