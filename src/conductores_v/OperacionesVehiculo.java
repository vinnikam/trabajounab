/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conductores_v;

import bd.ManejadorConexion;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author Vinni
 */
public class OperacionesVehiculo {
    private static final org.apache.logging.log4j.Logger LOG = LogManager.getLogger(OperacionesVehiculo.class);
    public boolean guardar(Vehiculo vehiculo){
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
