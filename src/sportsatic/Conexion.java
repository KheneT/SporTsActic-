package sportsatic;

/**
 *
 * @author Saavedra
 */

import java.sql.*;

public class Conexion {
    public static void main(String[] args) {
        Conexion.getConexion();
    }
    
    
    private static Connection con = null;
    
    
    private Conexion (){
    
        String url= "......";
        String user = "....";
        String password = ".......";
        String driver = "com.mysql.cj.jdbc.Driver";
    
        
        
        try {
            
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static Connection getConexion(){
    
        if (con==null){
        //Aqui se esta llamando al contructor mediante un objeto anonimo
        new Conexion(); 
        }
        
        return con;
    
    
    }
    
    
}
