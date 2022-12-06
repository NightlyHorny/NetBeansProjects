/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gm1.usowhile;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class GM1UsoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        While evalua la condicion al inicio del bloque del codigo que se desea repetir
         */
        String nombre, resp = null, opc = null, nomhijo;
        int numHijos, i = 1;
        Scanner x = new Scanner(System.in);
        do {
            Scanner y = new Scanner(System.in);
            System.out.println("Ingresa tu nombre: ");
            nombre = y.nextLine();
            System.out.println("¿Tienes hijos?");
            resp = x.next();
            if (resp.equalsIgnoreCase("Si")) {
                System.out.println("¿Cuantos?");
                numHijos = x.nextInt();
                while (i <= numHijos) {
                    System.out.println("Como se llama tu hijo numero " + i);
                    nomhijo = x.next();
                    i++;
                }
            }
            System.out.println("¿Te gustaria repetir esto de nuevo?");
            opc = x.next();
        } while (opc.equalsIgnoreCase("Si"));

    }

}
