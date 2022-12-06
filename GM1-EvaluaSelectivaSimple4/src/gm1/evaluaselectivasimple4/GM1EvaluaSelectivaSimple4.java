package gm1.evaluaselectivasimple4;

import java.util.Scanner;

/*
* @author GM1 - Ian Roberto Tejada reyes
*/
public class GM1EvaluaSelectivaSimple4 {
    public static void main(String[] args) {
        //Capturar un numero y definir si es par o impar
        Scanner sc1 = new Scanner (System.in);
        int num;
        System.out.println("Ingresa un numero:");
        num = sc1.nextInt();
        
        if(num%2 == 0){
            System.out.println("El numero "+num+" es par");
        }if (num%2 != 0){
            System.out.println("El numero "+num+" es impar");
        }
    }
    
}
