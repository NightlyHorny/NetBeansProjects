package gm1.condicionalmultiple2;

import java.util.Scanner;
/*
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1CondicionalMultiple2 {
    public static void main(String[] args) {
        String mes;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el mes");
        mes = sc.next();
        
        //Switch;
        switch(mes.toUpperCase()){
            case ("ENERO"):
                System.out.println("Año Nuevo");
                break;
            case ("FEBRERO"):
                System.out.println("Dia de la Calendaria");
                break;
            case ("MARZO"):
                System.out.println("Dia de la mujer");
                break;
            case ("ABRIL"):
                System.out.println("Dia del niño");
                break;
            case ("MAYO"):
                System.out.println("Dia de la madre");
                break;
            case ("JUNIO"):
                System.out.println("Dia del Padre");
                break;
            case ("JULIO"):
                System.out.println("Cumpleaños de mi hermano (Jan)");
                break;
            case ("AGOSTO"):
                System.out.println("Cumpleaños de mi mama (Nereyda)");
                break;
            case ("SEPTIEMBRE"):
                System.out.println("Dia de la independencia");
                break;
            case ("OCTUBRE"):
                System.out.println("hallowen");
                break;
            case ("NOVIEMBRE"):
                System.out.println("Mi cumpleaños (Ian)");
                break;
            case ("DICIEMBRE"):
                System.out.println("Navidad");
                break;
            default:
                System.out.println("Mes Invalido");
                break;
        }
    }
    
}
