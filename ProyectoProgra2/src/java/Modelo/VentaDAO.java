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
public class VentaDAO {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    int dato;
    String cnumero;
    
    public String NumeroSerie(int inc){
        this.dato=inc+1;
        if((this.dato>=10000)&(this.dato<=100000)){
            cnumero=""+dato;
        }
        if((this.dato>=1000)&(this.dato<=10000)){
            cnumero="0"+dato;
        }if((this.dato>=100)&(this.dato<=1000)){
            cnumero="00"+dato;
        }if((this.dato>=10)&(this.dato<=100)){
            cnumero="000"+dato;
        }
        if((this.dato<10)){
           cnumero="0000"+dato;
        }
        return cnumero;
    }
    
    public String GenerarSerie() {
        String numeroserie = "";
        String sql = "select max(NumeroSerie) from ventas1";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                numeroserie = rs.getString(1);

            }
        } catch (Exception e) {

        }
        return numeroserie;
    }

    public String IdVentas() {
        String idventas = "";
        String sql = "select max(Idventas) from ventas1";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idventas = rs.getString(1);

            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return idventas;
    }

    public int guardadrVenta(venta ve) {
        String sql = "insert into ventas1(IdHuesped,NumeroSerie,FechaVentas,Monto) values(?,?,?,?)";

        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ve.getIdhuesped());
            ps.setString(2, ve.getNumserie());
            ps.setString(3, ve.getFecha());
            ps.setInt(4, ve.getMonto());
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return r;
    }

    public int guardarDetalleventas(venta ventas) {
        String sql = "insert into detalleventas1(IdVentas,Idservicio,IdHabitacion,Cantidad,PrecioVenta) values(?,?,?,?,?)";
        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ventas.getId());
            ps.setInt(2, ventas.getIdservicio());
            ps.setInt(3, ventas.getIdhabitacion());
            ps.setInt(4, ventas.getCantidad());
            ps.setInt(5, ventas.getPrecio());
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }

        return r;
    }
    
    public List listar() {
        ArrayList<venta> list = new ArrayList<>();
        String sql = "select * from  ventas1";

        try {
            con = cn.conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                venta vent = new venta();
                vent.setId(rs.getInt("IdVentas"));
                vent.setIdhuesped(rs.getInt("IdHuesped"));
                vent.setNumserie(rs.getString("NumeroSerie"));
                vent.setFecha(rs.getString("FechaVentas"));
                vent.setMonto(rs.getInt("Monto"));
                list.add(vent);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }

        return list;
    }
}
