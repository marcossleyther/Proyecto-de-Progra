
package Modelo;

import Config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class empleadoDao {
    
 conexion cn=new conexion();
 Connection con;
 PreparedStatement ps;
 ResultSet rs;
    
    
    public empleado validar(String user,String dpi) {
    
    empleado em =new empleado();
    String sql="select * from empleado1 where User=? and DPI=?";
        try {
            con =cn.conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dpi);
            rs=ps.executeQuery();
            while(rs.next()){
                em.setId(rs.getInt("idEmpleado"));
                em.setUser(rs.getString("User"));
                em.setDpi(rs.getString("DPI"));
                em.setNom(rs.getString("Nombres"));
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return em;
    }
}
