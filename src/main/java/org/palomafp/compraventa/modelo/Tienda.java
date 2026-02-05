package org.palomafp.compraventa.modelo;

import java.util.Date;

public class Tienda {
    private String ubicacion;
    private Date horario;
    private String nombre;

    public Tienda(String ubicacion, Date horario, String nombre) {
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.nombre = nombre;
    }

    public Tienda() {
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "ubicacion='" + ubicacion + '\'' +
                ", horario=" + horario +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
