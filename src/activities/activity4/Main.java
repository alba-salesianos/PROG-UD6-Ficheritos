package activities.activity4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int option = -1;
        Scanner keyboard = new Scanner(System.in);

        String colour;
        int numberOfLegs;

        TableManager tableManager = new TableManager();


        while (option != 3) {

            String boxGraphic = "\n╔═════════════════════════════════════════╗";
            boxGraphic += "\n║                M E S A S                ║";
            boxGraphic += "\n╟─────────────────────────────────────────╢";
            boxGraphic += "\n║ Seleccione una opción:                  ║ ";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n║ 1. Añadir mesa                          ║";
            boxGraphic += "\n║ 2. Enseñar mesas                        ║";
            boxGraphic += "\n║ 3. Cerrar                               ║";
            boxGraphic += "\n║                                         ║";
            boxGraphic += "\n╚═════════════════════════════════════════╝";

            System.out.println(boxGraphic);
            option = keyboard.nextInt();
            keyboard.nextLine();


            switch (option) {
                case 1:
                    System.out.println("¿De qué color es la mesa?");
                    colour = keyboard.nextLine();

                    System.out.println("¿Cuántas patas tiene la mesa?");
                    numberOfLegs = keyboard.nextInt();
                    keyboard.nextLine();

                    Table table = new Table(colour, numberOfLegs);
                    tableManager.saveTable(table);
                    break;


                case 2:
                    tableManager.showTables();
                    break;


                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Esa no es una opción válida.");
                    break;
            }
        }

        keyboard.close();
    }
}
