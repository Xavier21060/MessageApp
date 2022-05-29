package org.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    /**Vamos a conectarnos a una base de datos
     * creando un meto que va a devolver un objeto
     * va a tener todas las funcionalidades para conectarnos a una BD
     */
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensaje_app", "root", "");
        }catch (SQLException e){
            System.out.println(e);
        };
        return connection;
    }
}
