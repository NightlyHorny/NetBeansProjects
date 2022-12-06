package gm1.estructurasselectivassimples;

import java.util.Scanner;

/*
 * @author GM1 - Ian Roberto Tejada Reyes 
*/
public class Gm1EstructurasSelectivasSimples {
    public static void main(String[] args) {
        String nombre;
        int edad;
        String carrera;
        float monto;
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        //Capturar datos
        System.out.println("Como te llamas?");
        nombre=sc1.next();
        System.out.println("Cual es tu edad?");
        edad=sc2.nextInt();
        System.out.println("Cual es tu carrera?");
        carrera=sc1.next();
        System.out.println("Cuanto vas a pagar?");
        monto=sc2.nextFloat();
        if ("covid".equalsIgnoreCase(nombre)){
            System.out.println("El covid no es bienvenido");
            System.out.println("*************************");
        }
        if (edad < 16){
            System.out.println("Lamentamos informarte que no podras participar");
            int resultado = 16-edad;
            System.out.println("Dentro de "+resultado+" años te esperamos");
        }
        if (carrera.equalsIgnoreCase("ISC") || carrera.equalsIgnoreCase("IM")){
            System.out.println("Eres ingeniebro en sistemas o mecatronica");
        }
        if(monto == 500){
            System.out.println("Puedes pasar por tu kit");
        }
    }
    
}
