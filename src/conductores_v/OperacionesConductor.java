/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conductores_v;

import bd.ManejadorConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author Vinni
 */
public class OperacionesConductor {
    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(OperacionesConductor.class);
    private final String SQL_INSERT = "insert into conductores (nombre, licencia, identificacion, id_vehiculo)"
            + "values (?,?,?,?)";
    
    public boolean guardar(Conductor dato){
        ManejadorConexion mconexion = new ManejadorConexion();
        Connection cActiva =  mconexion.conectarse();
        if (cActiva != null){
            
            try {
                PreparedStatement ps  = cActiva.prepareStatement(SQL_INSERT);
                ps.setString(1, dato.getNombre());
                ps.setString(2, dato.getLicencia());
                ps.setLong(3, dato.getIdentificacion());
                ps.setLong(4, dato.getVehiculo().getId());
                
                if (ps.executeUpdate()>0){
                    return true;
                }
            } catch (SQLException  | NullPointerException ex) {
                LOG.error("No inserto conductor",ex);
            }finally{
                mconexion.cerrarConexAct(cActiva);
            }
        }
        
        return false;
    }
    public boolean eliminar(Conductor vehiculo){
        return false;
    }
    public boolean modificar(Conductor vehiculo){
        return false;
    }
    public Conductor buscar(int pk){
        return null;
    }
    public ArrayList<Conductor> buscar(){
        return new ArrayList<>();
    }
}
