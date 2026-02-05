package org.palomafp.compraventa.modelo;

import java.util.Date;

public class HistorialPrecios {
    private Date fecha;
    private int precio;

    public HistorialPrecios() {
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
}
