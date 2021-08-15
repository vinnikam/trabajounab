
package directoriocontac;

import java.io.Serializable;

/**
 *
 * @author Vinni
 */
public class Contacto implements Serializable{
    private Integer idenficador;
    private String nombre;
    private String apellido;
    private int telefono;
    private String correo;
    private String empresa;
    private boolean favorito;

    public Contacto(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.favorito = false;
    }

    public Integer getIdenficador() {
        return idenficador;
    }

    public void setIdenficador(Integer idenficador) {
        this.idenficador = idenficador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return "Contacto{" +idenficador+ "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", correo=" + correo + ", empresa=" + empresa + ", favorito=" + favorito + '}';
    }

    
}
