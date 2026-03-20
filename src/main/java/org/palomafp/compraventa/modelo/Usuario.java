package org.palomafp.compraventa.modelo;

import java.util.ArrayList;
/**
 * Esta clase representa al usuario que esta usando la app.
 */
public class Usuario {
    private String biblioteca;
    private String idUsuario;
    private String correo;
    private int cartera;
    private ArrayList<Compra> compras;

    /**
     * Constructor completo para crear un usuario con todos sus datos.
     * 
     * @param biblioteca La biblioteca del usuario
     * @param idUsuario El identificador único del usuario
     * @param correo El correo electrónico del usuario
     * @param cartera El saldo disponible en la cartera del usuario
     * @param compras Lista de compras realizadas por el usuario
     */
    public Usuario(String biblioteca, String idUsuario, String correo, int cartera, ArrayList<Compra> compras) {
        this.biblioteca = biblioteca;
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.cartera = cartera;
        this.compras = compras;
    }

    /**
     * Constructor vacío para crear un usuario sin datos iniciales.
     */
    public Usuario() {
    }

    /**
     * Obtiene la biblioteca del usuario.
     * 
     * @return La biblioteca del usuario
     */
    public String getBiblioteca() {
        return biblioteca;
    }

    /**
     * Establece la biblioteca del usuario.
     * 
     * @param biblioteca La nueva biblioteca del usuario
     */
    public void setBiblioteca(String biblioteca) {
        this.biblioteca = biblioteca;
    }

    /**
     * Obtiene el identificador único del usuario.
     * 
     * @return El ID del usuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el identificador único del usuario.
     * 
     * @param idUsuario El nuevo ID del usuario
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * 
     * @return El correo del usuario
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     * 
     * @param correo El nuevo correo del usuario
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el saldo disponible en la cartera del usuario.
     * 
     * @return El saldo de la cartera
     */
    public int getCartera() {
        return cartera;
    }

    /**
     * Establece el saldo de la cartera del usuario.
     * 
     * @param cartera El nuevo saldo de la cartera
     */
    public void setCartera(int cartera) {
        this.cartera = cartera;
    }

    /**
     * Obtiene la lista de compras realizadas por el usuario.
     * 
     * @return Lista de compras del usuario
     */
    public ArrayList<Compra> getCompras() {
        return compras;
    }

    /**
     * Establece la lista de compras del usuario.
     * 
     * @param compras La nueva lista de compras
     */
    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    /**
     * Devuelve una representación en cadena del usuario.
     * 
     * @return Cadena con todos los datos del usuario
     */
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
