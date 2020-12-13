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
public class huespedDao {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    huesped hues = new huesped();
    int r;

   
//********************Operaciones del CRUD*********************//////////
    public List listar() {
        ArrayList<huesped> list = new ArrayList<>();
        String sql = "select * from huesped";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                huesped per = new huesped();
                per.setId(rs.getInt("id"));
                per.setNombre(rs.getString("Nombre"));
                per.setApellido(rs.getString("Apellido"));
                per.setDireccion(rs.getString("Direccion"));
                list.add(per);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return list;
    }

    public int agregar(huesped em) {
        String sql = "insert into huesped(Nombre,Apellido,Direccion)values(?,?,?)";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getDireccion());
            ps.executeUpdate();
        } catch (Exception e) {
 System.err.println("Error" + e);
        }
        return r;
    }

    
    public huesped list(int id) {
    huesped hues =new huesped();
    String sql="select * from huesped where Id="+id;
    
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){  
                hues.setId(rs.getInt("Id"));
                hues.setNombre(rs.getString("Nombre"));
                hues.setApellido(rs.getString("Apellido"));
                hues.setDireccion(rs.getString("Direccion"));
                
            }
        } catch (Exception e) {
             System.err.println("Error" + e);
        }
  
    return hues;
    }
    
    
    public int actualizar(huesped em) {
        String sql="update huesped set Nombre=?,Apellido=?,Direccion=? where Id=?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, em.getNombre());
            ps.setString(2, em.getApellido());
            ps.setString(3, em.getDireccion());
            ps.setInt(4, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
             System.err.println("Error" + e);
         
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from huesped where Id="+id;
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
             System.err.println("Error" + e);
        }

    }
}
