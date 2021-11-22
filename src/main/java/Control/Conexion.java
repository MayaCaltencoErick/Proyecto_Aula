/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PRIDE OTTER
 */
public class Conexion {
   
public static Connection getConnection(){
        String url, userName, password;
        
        url = "jdbc:mysql://us-cdbr-east-04.cleardb.com:3306/heroku_8824012eabc0c11";
        userName = "b45ded842b30d0";
        password = "137821bc";
        
        Connection con = null;
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, userName, password);
            
            System.out.println("Conexion Exitosa con la BD");
        
        }catch(Exception e){
            System.out.println("Error al conectar la BD");
            System.out.println(e.getMessage());
        
        }
        return con;
    }
}

