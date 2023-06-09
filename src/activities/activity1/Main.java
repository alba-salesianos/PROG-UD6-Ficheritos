package activities.activity1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = "";

        while (text.length()<30){
            System.out.println("Introduzca un texto de 30 caracteres:");
            text = console.nextLine();

            if (text.length()<30){
                System.out.println("Al texto le faltan " + (30 - text.length()) + " caracteres");
            }
        }

        text = text.toUpperCase().replace(" ", "_");

        System.out.println(text);

        try {
            FileWriter fw = new FileWriter("src/files/activity1.txt");

            for (int i = 0; i < text.length(); i++) {
                fw.write(text.charAt(i));
            }

            System.out.println("You're filled with determination.");

            fw.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
