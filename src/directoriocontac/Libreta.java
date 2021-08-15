/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriocontac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Vinni
 */
public class Libreta implements Serializable {

    private ArrayList<Contacto> contactos;
    
    public Libreta() {
        UtilidadPersistencia util = new UtilidadPersistencia();
        this.contactos = util.abrirArchivo();
        if (this.contactos == null) {
            this.contactos = new ArrayList<>();
        }

    }

    public Contacto buscarContacto(String nombre, String apellido, int telefono) {
        for (Contacto elcontacto : contactos) {
            if (elcontacto.getNombre().equals(nombre)
                    && elcontacto.getApellido().equals(apellido)
                    && elcontacto.getTelefono() == telefono) {
                return elcontacto;
            }
        }
        return null;
    }

    public Contacto buscarContacto(Integer id) {
        if (id == null) {
            return null;
        }
        for (Contacto elcontacto : contactos) {
            if (Objects.equals(elcontacto.getIdenficador(), id)) {
                return elcontacto;
            }

        }
        return null;
    }

    public boolean adicionContacto(Contacto contacto) {

        if (this.buscarContacto(contacto.getIdenficador()) != null) {
            this.editarContacto(contacto);
        } else {
            contacto.setIdenficador(secuenciaNext());
            this.contactos.add(contacto);
            UtilidadPersistencia util = new UtilidadPersistencia();
            if (util.guardarArchivo(contactos)) {
                return true;
            }
        }
        return false;
    }

    public boolean borrarContacto(Contacto elcontacto) {
        for (Contacto contacto : contactos) {
            if (Objects.equals(contacto.getIdenficador(), elcontacto.getIdenficador())) {
                this.contactos.remove(contacto);
                return true;
            }
        }
        UtilidadPersistencia util = new UtilidadPersistencia();
        if (util.guardarArchivo(contactos)) {
            return true;
        }
        return false;
    }

    public boolean editarContacto(Contacto elcontacto) {
        for (Contacto contacto : contactos) {
            if (Objects.equals(contacto.getIdenficador(), elcontacto.getIdenficador())) {
                contacto.setEmpresa(elcontacto.getEmpresa());
                contacto.setCorreo(elcontacto.getCorreo());
                contacto.setFavorito(elcontacto.isFavorito());
                contacto.setNombre(elcontacto.getNombre());
                contacto.setApellido(elcontacto.getApellido());
            }
        }
        UtilidadPersistencia util = new UtilidadPersistencia();
        if (util.guardarArchivo(contactos)) {
            return true;
        }
        return false;
    }

    public ArrayList<Contacto> listar() {
        return this.contactos;
    }

    public ArrayList<Contacto> buscarXCelular(int celular) {
        ArrayList<Contacto> contactosC = new ArrayList<>();

        for (Contacto contacto : contactos) {
            if (contacto.getTelefono() == celular) {
                contactosC.add(contacto);
            }

        }

        return contactosC;
    }

    public ArrayList<Contacto> buscarOrdenado() {
        
        Collections.sort(contactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                    return c1.getIdenficador().compareTo(c2.getIdenficador());
            }
        });
        
        return this.contactos;
    }

    
    private int secuenciaNext(){
        if (this.contactos.isEmpty()){
            return 1;
        }
        ArrayList<Contacto> loscontact = this.buscarOrdenado();
        int secuencia = loscontact.get(loscontact.size()-1).getIdenficador()+1;
        return secuencia;
    }

}
