package preexamen4.ianroberto;

import java.util.Scanner;

/*
 * @author Ian Roberto Tejada Reyes
 */
public class PreExamen4IanRoberto {

    public static void main(String[] args) {
        String nombre, opc, apellido;
        int edad;
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);
        do {
            System.out.println("Cual es tu nombre:");
            nombre = y.nextLine();
            switch (nombre.toUpperCase()) {
                case "JUAN":
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Hola " + nombre);
                    }
                    break;
                case "PEDRO":
                    for (int i = 10; i >= 1; i--) {
                        System.out.println("Hola " + nombre + " " +i );
                    }
                    break;
                case "LUIS":
                    System.out.println("Ingresa tu apellido:");
                    apellido = z.nextLine();
                    System.out.println("Ingresa tu edad:");
                    edad = x.nextInt();
                    for (int i = 1; i <= edad; i++) {
                        System.out.println("Hola " + nombre + " " +apellido +" vuelta " +i);
                    }
                    
            }
                System.out.println("Te gustaria repetir esto de nuevo:");
            opc = x.next();
        } while (opc.equalsIgnoreCase("si"));

    }

}
