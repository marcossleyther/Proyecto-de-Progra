
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

/*
Conexion a la base de datos 

*/
public class conexion {
    Connection con;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/prohuesped", "root", "root");
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
       return con;
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
