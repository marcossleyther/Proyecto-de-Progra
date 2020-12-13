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
public class HabitacionDao {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Habitacion ha = new Habitacion();
    int r;

    public List listar() {
        ArrayList<Habitacion> listh = new ArrayList<>();
        String sql = "select * from habitacion";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion hab = new Habitacion();
                hab.setId(rs.getInt("IdHabitacion"));
                hab.setIdtipo(rs.getInt("IdTipo"));
                hab.setNivel(rs.getString("Nivel"));
                hab.setComentario(rs.getString("Comentario"));
                hab.setPrecio(rs.getInt("Precio"));
                hab.setStatus(rs.getString("STATUS"));
                listh.add(hab);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return listh;
    }

    public int reservar(Habitacion ha) {
        String status="RESERVADO";
        String sql = "update habitacion set STATUS=? where IdHabitacion=?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2, ha.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error" + e);

        }
        return r;
    }

    public int liberar(Habitacion ha) {
        String status="DISPONIBLE";
        String sql = "update habitacion set STATUS=? where IdHabitacion=?";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, status);
            ps.setInt(2, ha.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error" + e);

        }
        return r;
    }
    public Habitacion list(int id) {
        Habitacion hab = new Habitacion();
        String sql = "select * from habitacion where IdHabitacion="+id;

        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                hab.setId(rs.getInt(1));
                hab.setIdtipo(rs.getInt(2));
                hab.setNivel(rs.getString(3));
                hab.setComentario(rs.getString(4));
                hab.setPrecio(rs.getInt(5));
                hab.setStatus(rs.getString(6));

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }

        return hab;
    }
}
