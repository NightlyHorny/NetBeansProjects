package gm1.evaluaselectivasimple2;

import java.util.Scanner;

/*
* @author GM1 - Ian Roberto Tejada reyes
*/

public class GM1EvaluaSelectivaSimple2 {
    public static void main(String[] args) {
        //Calcular si es mayor de edad para tramitar su INE
        Scanner sc1 = new Scanner (System.in);
        int edad;
        System.out.println("Ingresa tu edad:");
        edad = sc1.nextInt();
        if (edad >= 18){
            System.out.println("Puedes tramitar tu INE, acude a tu modulo mas cercano.");
        }if (edad < 18){
            System.out.println("No puedes tramitar tu INE acude en " + (18-edad)+ " año/s");
        }
    }
    
}
