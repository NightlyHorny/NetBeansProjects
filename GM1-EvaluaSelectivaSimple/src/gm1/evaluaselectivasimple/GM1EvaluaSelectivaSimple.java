package gm1.evaluaselectivasimple;

import java.util.Scanner;

/*
* @author GM1 - Ian Roberto Tejada reyes
*/
public class GM1EvaluaSelectivaSimple {
    public static void main(String[] args) {
        // Ingresa mes y mostrar mensaje del mes
        Scanner sc1 = new Scanner (System.in);
        String Mes;
        System.out.println("Ingresa el mes en el que te encuentras:");
        Mes = sc1.nextLine();
        
        if(Mes.equalsIgnoreCase("Enero")){
            System.out.println("Año Nuevo");
        }if(Mes.equalsIgnoreCase("Febrero")){
            System.out.println("Dia de la calendaria");
        }if(Mes.equalsIgnoreCase("Marzo")){
            System.out.println("Dia de la mujer");
        }if(Mes.equalsIgnoreCase("Abril")){
            System.out.println("Dia del niño/niña");
        }if(Mes.equalsIgnoreCase("Mayo")){
            System.out.println("Dia de la madre");
        }if(Mes.equalsIgnoreCase("Junio")){
            System.out.println("Dia del trabajador (No se si va en este mes ;C)");
        }if(Mes.equalsIgnoreCase("julio")){
            System.out.println("Cumpleaños de mi hermano (Jan)");
        }if(Mes.equalsIgnoreCase("Agosto")){
            System.out.println("Cumpleaños de mi mamá (Nereyda)");
        }if(Mes.equalsIgnoreCase("Septiembre")){
            System.out.println("Dia de la independencia");
        }if(Mes.equalsIgnoreCase("Octubre")){
            System.out.println("Hallowen");
        }if(Mes.equalsIgnoreCase("Noviembre")){
            System.out.println("Mi cumpleaños (Ian)");
        }if(Mes.equalsIgnoreCase("Diciembre")){
            System.out.println("Navidad");
        }if (!Mes.equalsIgnoreCase("Enero") && !Mes.equalsIgnoreCase("Febrero") && !Mes.equalsIgnoreCase("Marzo") && !Mes.equalsIgnoreCase("Abril") && !Mes.equalsIgnoreCase("mayo") && !Mes.equalsIgnoreCase("junio") && !Mes.equalsIgnoreCase("julio") && !Mes.equalsIgnoreCase("agosto") && !Mes.equalsIgnoreCase("septiembre") && !Mes.equalsIgnoreCase("octubre") && !Mes.equalsIgnoreCase("noviembre")  && !Mes.equalsIgnoreCase("Diciembre")){
            System.out.println("Mes invalido");
        }
    }
    
}
