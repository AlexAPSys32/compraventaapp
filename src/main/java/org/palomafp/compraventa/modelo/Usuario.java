package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa al usuario que esta usando la app.
 * @author Miguel
 * @author Alejandro
 */
public class Usuario {
    private String biblioteca;
    private String idUsuario;
    private String correo;
    private int cartera;
    private ArrayList<Compra> compras;

    /**
     * Constructor con parámetros para crear un usuario.
     * @param biblioteca la biblioteca del usuario
     * @param idUsuario el ID del usuario
     * @param correo el correo del usuario
     * @param cartera la cartera del usuario
     * @param compras las compras del usuario
     */
    public Usuario(String biblioteca, String idUsuario, String correo, int cartera, ArrayList<Compra> compras) {
        this.biblioteca = biblioteca;
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.cartera = cartera;
        this.compras = compras;
    }

    /**
     * Constructor por defecto.
     */
    public Usuario() {
    }

    /**
     * Obtiene la biblioteca del usuario.
     * @return la biblioteca del usuario
     */
    public String getBiblioteca() {
        return biblioteca;
    }

    /**
     * Establece la biblioteca del usuario.
     * @param biblioteca la biblioteca a establecer
     */
    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }

    /**
     * Obtiene el ID del usuario.
     * @return el ID del usuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el ID del usuario.
     * @param idUsuario el ID del usuario a establecer
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el correo del usuario.
     * @return el correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del usuario.
     * @param correo el correo a establecer
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la cartera del usuario.
     * @return la cartera del usuario
     */
    public int getCartera() {
        return cartera;
    }

    /**
     * Establece la cartera del usuario.
     * @param cartera la cartera a establecer
     */
    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    /**
     * Obtiene las compras del usuario.
     * @return las compras del usuario
     */
    public ArrayList<Compra> getCompras() {
        return compras;
    }

    /**
     * Establece las compras del usuario.
     * @param compras las compras a establecer
     */
    public void setCompras(ArrayList<Compra> compras) {
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
