package gm1.selectivasdobles;

import java.util.Scanner;

/**
 *
 * @author GM1-Ian Roberto Tejada Reyes
 */
public class GM1SelectivasDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, carrera;
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Cual es tu nombre?");
        nombre = sc1.next();
        System.out.println("Cual es tu carrera?");
        carrera = sc1.next();
        if(nombre.equalsIgnoreCase("covid")){
            System.out.println("Te perjudicaron con ese nombre");
        }else{
            System.out.println("Bienvenido "+nombre);
        }
        if(carrera.equalsIgnoreCase("ISC")){
            System.out.println("Estudias Ing. Sistemas computacionales");
        }else{
            System.out.println("Te equivocaste de carrera.");
            if(carrera.equalsIgnoreCase("IM")){
                System.out.println("Estudias Mecatronica");
            }if (carrera.equalsIgnoreCase("II")){
                System.out.println("Estudias Industrial");
            }
        }
    }
    
}
