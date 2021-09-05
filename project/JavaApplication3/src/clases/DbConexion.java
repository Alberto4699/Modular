package clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;


public class DbConexion {
    
    String user = "root";
    String pass = "root";
    String url = "jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=CONVERT_TO_NULL";
    Connection conexion = null;

    public Connection Conectar() {
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            if(conexion!=null){
                System.out.print("Conexion exitosa");
            }
            return conexion;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return null;
    }
}
