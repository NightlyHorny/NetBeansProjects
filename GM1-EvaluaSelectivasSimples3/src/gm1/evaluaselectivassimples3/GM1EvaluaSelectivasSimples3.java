package gm1.evaluaselectivassimples3;

import java.util.Scanner;

/*
* @author GM1 - Ian Roberto Tejada reyes
*/
public class GM1EvaluaSelectivasSimples3 {
    public static void main(String[] args) {
        //Captura 3 calificaciones y marcar COMPETENTE >= 70 o INCOMPETENTE < 70
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Scanner sc3 = new Scanner (System.in);
        float calif1, calif2, calif3, total, promedio;
        System.out.println("Ingresa la primera calificación:");
        calif1 = sc1.nextFloat();
        System.out.println("Ingresa la segunda calificación:");
        calif2 = sc2.nextFloat();
        System.out.println("Ingresa la tercera calificación:");
        calif3 = sc3.nextFloat();
        total = calif1+calif2+calif3;
        promedio = total/3;
        if (promedio >= 70f){
            System.out.println("El alumno es COMPETENTE promedio("+promedio+")" );
        }if(promedio < 70f){
            System.out.println("El alumno es INCOMPETENTE promedio("+promedio+")" );
        }
        
    }
    
}
