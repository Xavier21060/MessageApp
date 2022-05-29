package org.example;

import java.util.Scanner;

public class MessgeService {


    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("write your message");
        String message = sc.nextLine();

        System.out.println("Your Name is?");
        String name = sc.nextLine();

        Message registro = new Message();
        registro.setMessage(message);
        registro.setAuthorMessage(name);

        MessageDAO.createMessageDB(registro);
    }

    public  static void listarMessage(){
        MessageDAO.readMessageBD();
    }

    public  static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el id del mensaje a borra");
        int idMessage= sc.nextInt();
        MessageDAO.deleteMessage(idMessage);
    }

    public static void editMessage(){}

}
