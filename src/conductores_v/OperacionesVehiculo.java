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
public class OperacionesVehiculo {
    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(OperacionesVehiculo.class);
    private final String SQL_INSERT = "insert into vehiculos (marca, modelo, trasmision, placa)"
            + "values (?,?,?,?)";
    public boolean guardar(Vehiculo dato){
        ManejadorConexion mconexion = new ManejadorConexion();
        Connection cActiva =  mconexion.conectarse();
        if (cActiva != null){
            
            try {
                PreparedStatement ps  = cActiva.prepareStatement(SQL_INSERT);
                ps.setString(1, dato.getMarca().toUpperCase());
                ps.setString(2, dato.getModelo());
                ps.setString(3, dato.getTrasmision().toUpperCase());
                ps.setString(4, dato.getPlaca().toUpperCase());
                
                if (ps.executeUpdate()>0){
                    return true;
                }
            } catch (SQLException  | NullPointerException ex) {
                LOG.error("No inserto Vehiculo",ex);
            }finally{
                mconexion.cerrarConexAct(cActiva);
            }
        }
        return false;
    }
    public boolean eliminar(Vehiculo vehiculo){
        return false;
    }
    public boolean modificar(Vehiculo vehiculo){
        return false;
    }
    public Vehiculo buscar(int pk){
        return null;
    }
    public ArrayList<Vehiculo> buscar(){
        return new ArrayList<>();
    }
}
