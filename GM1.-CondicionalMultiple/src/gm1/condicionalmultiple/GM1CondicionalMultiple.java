package gm1.condicionalmultiple;

import java.util.Scanner;

/**
 *
 * @author Damian Gonzalez Rivera
 */
public class GM1CondicionalMultiple {

   
    public static void main(String[] args) {
    String dia="";
        Scanner op=new Scanner(System.in);
        System.out.println("Ingresa el dia de la semana");
        dia=op.next();
        //Uso de condicional multiple
        switch(dia.toLowerCase()){
            case "lunes":
                System.out.println("Dia dedicado a la luna");
                System.out.println("En ingles MONDAY");
                break;
            case "martes":
                System.out.println("Dia dedicado a Marte");
                System.out.println("El Dios de la guerra");
                break;
            case "miercoles":
                System.out.println("Dia dedicado a Mercurio");
                System.out.println("El planeta mas pequeño");
                break;
            case "jueves":
                System.out.println("Dia dedicado a Jupiter");
                System.out.println("El quinto planeta del sistema solar");
                break;
            case "viernes":
                System.out.println("Dia dedicado a Venus");
                System.out.println("El segundo planeta");
                break;
            case "sabado":
                System.out.println("Dia dedicado a Saturno");
                System.out.println("Ahora dedicado al Shabbat el hebreo");
                break;
            case "domingo":
                System.out.println("Originalmente dedicado al sol");
                System.out.println("Hoy conocido como el dia del señor");
                break;
            default:
                System.out.println("Dia de la semana invalido");
                break;
        }
    }
    
}
