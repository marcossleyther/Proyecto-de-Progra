/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class servicioDao {
    
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Habitacion ha = new Habitacion();
    
    
    public servicio list(int id) {
    servicio ser =new servicio();
    String sql = "select * from servicio where IdServicio="+id; 
      try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                ser.setId(rs.getInt(1));
                ser.setDescipcion(rs.getString(2));
                ser.setPrecio(rs.getInt(3));

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return ser;
    
    
    
    
    }
    
    
     public List listar() {
        ArrayList<servicio> serviciol = new ArrayList<>();
        String sql = "select * from servicio";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                servicio ser = new servicio();
                ser.setId(rs.getInt(1));
                ser.setDescipcion(rs.getString(2));
                ser.setPrecio(rs.getInt(3));
                serviciol.add(ser);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return serviciol;
    }
    
}
