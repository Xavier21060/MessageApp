package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {

        /*1): Vamos a crear un menu que nos va a permitir ejecutar las 4 operacion

         */
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("------------------");
            System.out.println("Aplication of Message");
            System.out.println("1. Create Message");
            System.out.println("2. List Message" );
            System.out.println("3. Delete Message");
            System.out.println("4.  Edit Message");
            System.out.println("5. Exit");

            //Leemos la opcion del opcion
            System.out.println("\n::Choose an option");
            option = sc.nextInt();

            if (option == 5){
                System.out.println("Thanks for visiting our application");
            }
            /*Dependiendo de la opcion que el usuario
             escoja lo a redireccionar a nuestra capa service
             */
            switch (option){
                case 1:
                    MessgeService.createMessage();
                    break;
                case 2:

                    MessgeService.listarMessage();
                    break;
                case 3:
                    MessgeService.deleteMessage();
                    break;
                case 4:
                    MessgeService.editMessage();
                    break;
                default:
                    System.out.println("Choose an option correct");
                    break;
            }


        }while (option != 5);





















       /*Conexion conexion = new Conexion();
       try (Connection cnx = conexion.getConnection() ){

       }catch (Exception e){
           System.out.println(e);
       }*/
    }




}
