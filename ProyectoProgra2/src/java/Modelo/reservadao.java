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
public class reservadao {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    reserva r = new reserva();
    int a;

    public int agregar(reserva r) {
        String sql = "insert into reserva1(InicioR,FinR,idHuesped,idHabitacion)values(?,?,?,?)";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getInicior());
            ps.setString(2, r.getFinr());
            ps.setInt(3, r.getIdHuesped());
            ps.setInt(4, r.getIdHabitacion());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return a;
    }

    public List listar() {
        ArrayList<reserva> list = new ArrayList<>();
        String sql = "select * from  reserva1";

        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                reserva reser = new reserva();
                reser.setIdreserva(rs.getInt("IdReserva"));
                reser.setInicior(rs.getString("InicioR"));
                reser.setFinr(rs.getString("FinR"));
                reser.setIdHuesped(rs.getInt("idHuesped"));
                reser.setIdHabitacion(rs.getInt("idHabitacion"));
                list.add(reser);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }

        return list;
    }

}
