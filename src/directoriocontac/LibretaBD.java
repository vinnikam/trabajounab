/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directoriocontac;

import bd.ManejadorConexion;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinni
 */
public class LibretaBD implements Serializable {

    private ArrayList<Contacto> contactos;
    
    public LibretaBD() {
        
        this.contactos = listar();
        if (this.contactos == null) {
            this.contactos = new ArrayList<>();
        }

    }

    public Contacto buscarContacto(String nombre, String apellido, int telefono) {
        
        return null;
    }

    public Contacto buscarContacto(Integer id) {
        String sql = "select * from contactos where identificador = ?";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                
                pst.setInt(1, id);
                
                ResultSet rta = pst.executeQuery();
                
                if(rta.next()){
                    String nombre =  rta.getString("nombre");
                    String apellido =  rta.getString("apellido");
                    String empresa =  rta.getString("empresa");
                    int telefono =  rta.getInt("telefono");
                    String correo =  rta.getString("correo");
                    boolean favorito =  rta.getBoolean("favorito");
                    Integer identificador =  rta.getInt("identificador");
                    
                    Contacto conBD = new Contacto(nombre, apellido, telefono);
                    conBD.setCorreo(correo);
                    conBD.setEmpresa(empresa);
                    conBD.setFavorito(favorito);
                    conBD.setIdenficador(identificador);
                    
                   return conBD;
                }
                
                        
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }
        
        return null;
    }

    public boolean adicionContacto(Contacto contacto) {
        if (contacto == null){
            return false;
        }
        String sql = "insert into contactos (nombre, apellido, correo, empresa, telefono, favorito) \n" +
                    "                     values (?,    ?,      ?,       ?,      ?,         ?)";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                
                pst.setLong(5, contacto.getTelefono());
                pst.setString(1, contacto.getNombre());
                pst.setString(2, contacto.getApellido());
                pst.setString(4, contacto.getEmpresa());
                pst.setString(3, contacto.getCorreo());
                pst.setBoolean(6, contacto.isFavorito());
                
                int rta = pst.executeUpdate();  //AFECTAR LA BASE DE DATOS DESDE EL LENGUAJE
                if (rta >0){
                    this.contactos = listar();
                    return true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }

       
        return false;
    }

    public boolean borrarContacto(Contacto elcontacto) {
        if (elcontacto == null){
            return false;
        }
        String sql = "delete from contactos\n" +
                    "where identificador = ?";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                
                pst.setLong(1, elcontacto.getIdenficador());
                
                int rta = pst.executeUpdate();  //AFECTAR LA BASE DE DATOS DESDE EL LENGUAJE
                if (rta >0){
                    this.contactos = listar();
                    return true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }

        return false;
    }

    public boolean editarContacto(Contacto elcontacto) {
        if (elcontacto == null){
            return false;
        }
        String sql = "update contactos set nombre = ?, apellido = ?, correo = ?, empresa = ?, telefono = ?, favorito = ? " +
            "where identificador = ?";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                pst.setString(1, elcontacto.getNombre());
                pst.setString(2, elcontacto.getApellido());
                pst.setString(3, elcontacto.getCorreo());
                pst.setString(4, elcontacto.getEmpresa());
                pst.setLong(5, elcontacto.getTelefono());
                pst.setBoolean(6, elcontacto.isFavorito());
                pst.setLong(7, elcontacto.getIdenficador());
                
                int rta = pst.executeUpdate();  //AFECTAR LA BASE DE DATOS DESDE EL LENGUAJE
                if (rta >0){
                    this.contactos = listar();
                    return true;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }
        
        return false;
    }

    public ArrayList<Contacto> listar() {
        ArrayList<Contacto> contactosBD = new ArrayList<>();
        String sql = "select * from contactos ";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                
                ResultSet rta = pst.executeQuery();
                
                while(rta.next()){
                    String nombre =  rta.getString("nombre");
                    String apellido =  rta.getString("apellido");
                    String empresa =  rta.getString("empresa");
                    int telefono =  rta.getInt("telefono");
                    String correo =  rta.getString("correo");
                    boolean favorito =  rta.getBoolean("favorito");
                    Integer identificador =  rta.getInt("identificador");
                    
                    Contacto conBD = new Contacto(nombre, apellido, telefono);
                    conBD.setCorreo(correo);
                    conBD.setEmpresa(empresa);
                    conBD.setFavorito(favorito);
                    conBD.setIdenficador(identificador);
                    
                    contactosBD.add(conBD);
                }
                
                return contactosBD;
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }
        
        
        return contactosBD;
    }

    public ArrayList<Contacto> buscarXCelular(int celular) {
        
        
        ArrayList<Contacto> contactosBD = new ArrayList<>();
        if (celular<= 0){
            return contactosBD;
        }
        String sql = "select * from contactos where telefono = ?";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                
                pst.setInt(1, celular);
                
                ResultSet rta = pst.executeQuery();
                
                while(rta.next()){
                    String nombre =  rta.getString("nombre");
                    String apellido =  rta.getString("apellido");
                    String empresa =  rta.getString("empresa");
                    int telefono =  rta.getInt("telefono");
                    String correo =  rta.getString("correo");
                    boolean favorito =  rta.getBoolean("favorito");
                    Integer identificador =  rta.getInt("identificador");
                    
                    Contacto conBD = new Contacto(nombre, apellido, telefono);
                    conBD.setCorreo(correo);
                    conBD.setEmpresa(empresa);
                    conBD.setFavorito(favorito);
                    conBD.setIdenficador(identificador);
                    
                    contactosBD.add(conBD);
                }
                
                return contactosBD;
                        
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }
        
        return contactosBD;
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
    public ArrayList<Contacto> buscarOrdenadoNombre() {
        
        Collections.sort(contactos, new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                    return c1.getNombre().compareTo(c2.getNombre());
            }
        });
        
        return this.contactos;
    }
    
    
    public ArrayList<Contacto> buscarFavoritos() {
        
         ArrayList<Contacto> contactosBD = new ArrayList<>();
        String sql = "select * from contactos where favorito = true";
        ManejadorConexion mcon = new ManejadorConexion();
        Connection cActivo = mcon.conectarse();
        if (cActivo != null){
            try {
                PreparedStatement pst = cActivo.prepareStatement(sql);
                
             
                
                ResultSet rta = pst.executeQuery();
                
                while(rta.next()){
                    String nombre =  rta.getString("nombre");
                    String apellido =  rta.getString("apellido");
                    String empresa =  rta.getString("empresa");
                    int telefono =  rta.getInt("telefono");
                    String correo =  rta.getString("correo");
                    boolean favorito =  rta.getBoolean("favorito");
                    Integer identificador =  rta.getInt("identificador");
                    
                    Contacto conBD = new Contacto(nombre, apellido, telefono);
                    conBD.setCorreo(correo);
                    conBD.setEmpresa(empresa);
                    conBD.setFavorito(favorito);
                    conBD.setIdenficador(identificador);
                    
                    contactosBD.add(conBD);
                }
                
                return contactosBD;
                        
            } catch (SQLException ex) {
                Logger.getLogger(LibretaBD.class.getName()).log(Level.SEVERE, null, ex);
            } finally{
                mcon.cerrarConexAct(cActivo);
            }
            
        }
        
        return contactosBD;
      
    }

}
