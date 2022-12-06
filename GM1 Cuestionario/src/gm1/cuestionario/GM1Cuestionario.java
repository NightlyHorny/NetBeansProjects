package gm1.cuestionario;

import java.util.Scanner;

public class GM1Cuestionario {
    /*@author Ian Roberto Tejada Reyes*/
    public static void main(String[] args) {
        // Declaracion de variables
        byte edad;
        short dias;
        int control;
        String persona, resp;
        float estatura;
        //Declarcion objeto Scanner
        Scanner objeto1 = new Scanner(System.in);
        Scanner objeto2 = new Scanner(System.in);
        Scanner objeto3 = new Scanner(System.in);
        Scanner objeto4 = new Scanner(System.in);
        Scanner objeto5 = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        //Introducir datos
        do {
            System.out.println("¿Cual es tu nombre?");
            persona = objeto4.nextLine();
            System.out.println("¿Cual es tu estatura?");
            estatura = objeto5.nextFloat();
            System.out.println("¿Cuantos años tienes?");
            edad = objeto1.nextByte();
            System.out.println("Que dia del año es hoy");
            dias = objeto2.nextShort();
            System.out.println("Escribe un numero de control");
            control = objeto3.nextInt();
            //mostrar el contenido de las variables
            System.out.println("\n");
            System.out.println("________________________________________________________________________________");
            System.out.println("| Hola " + persona + " me agrada tu nombre, esta fuera de este mundo,            ");
            System.out.println("| Ohh! me da gusto que tengas " + edad + " años,                                   ");
            System.out.println("| Dios! es increible que midas " + estatura + " metros es increible 0wo,                ");
            System.out.println("| mira! que rapido han pasdo " + dias + " dias,                                    ");
            System.out.println("| Por cierto, casi lo olvido, tu numero de control es " + control + ", lindo dia.  ");
            System.out.println("|_______________________________________________________________________________");
            System.out.println("Te gustaria repetirlo de nuevo:");
            resp = x.nextLine();
        } while (resp.equalsIgnoreCase("si"));

    }

}
