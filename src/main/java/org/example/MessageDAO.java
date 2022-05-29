package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {



    public static void createMessageDB(Message message){
        //Conexion a la base de datos
        Conexion dbConnect = new Conexion();
        try (Connection connection = dbConnect.getConnection() ){
            PreparedStatement preparedStatement = null;
            try {
               //Un string para generar una consulta a la BD
                String query = "INSERT INTO mensajes (mensaje, auhor_message)  VALUES (?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, message.getMessage());
                preparedStatement.setString(2, message.getAuthorMessage());
                preparedStatement.executeUpdate();
                System.out.println("The message create");
            }catch (SQLException ex){
                System.out.println(ex);
            }
            //Capturarl la excepcion
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static void readMessageBD(){
        Conexion dbConnect = new Conexion();
        PreparedStatement ps  = null;
       //Nos permite traer los datos en fila
        ResultSet resultSet = null;
        try (Connection connection = dbConnect.getConnection() ) {
            String query = "select * from mensajes;";
            ps = connection.prepareStatement(query);
            resultSet = ps.executeQuery();
            //leer los datos

            while (resultSet.next()){
                System.out.println("ID: " + resultSet.getInt("id_mensaje"));
                System.out.println("Mensaje: " + resultSet.getString("mensaje"));
                System.out.println("Author: " + resultSet.getString("auhor_message"));
                System.out.println("Date: " + resultSet.getString("fecha_message"));
                System.out.println("\n");
            }
        } catch (SQLException e) {
            System.out.println("Ohh!, messages could not be retrieved ");
            System.out.println(e);
        }

    }

    public static void deleteMessage(int idMessage){
        Conexion db_Connect2 = new Conexion();
        try (Connection connection = db_Connect2.getConnection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM mensajes WHERE id_mensaje = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idMessage);
                ps.executeUpdate();
                System.out.println("El mensaje fue eliminado");

            }catch (SQLException e){
                System.out.println(e);
                System.out.println("No se pudo borrar el mensaje");
            }


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void toUpdateMessage (Message message){

    }

}
