package org.example;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
       Conexion conexion = new Conexion();
       try (Connection cnx = conexion.getConnection() ){

       }catch (Exception e){
           System.out.println(e);
       }
    }
}
