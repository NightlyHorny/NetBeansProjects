package preexamen1.ianroberto;
import java.util.Scanner;
/*@author Ian Roberto Tejada Reyes*/
public class PreExamen1IanRoberto {
    public static void main(String[] args) {
        //Calcular el horario
        String resp, dia;
        int hr;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Ingresa el dia actual:");
            dia = x.next();
            System.out.println("Ingresa la hora sin minutos:");
            hr = x.nextInt();
            switch(dia.toUpperCase()){
                case "LUNES" -> {
                    switch(hr){
                        case 8 -> System.out.println("Deberias estar en el Taller de Administracion(9K)");
                        case 9 -> System.out.println("Deberias estar en Matematicas Discretas(7D)");
                        case 10 -> System.out.println("Deberias estar en Fundamentos de la Investigacion(5K)");
                        case 11 -> System.out.println("Deberias estar Calculo Diferencial(IE)");
                        case 12 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        case 1 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        case 2 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        default -> System.out.println("Estas libre :D");
                    }
                }
                case "MARTES" -> {
                    switch(hr){
                        case 8 -> System.out.println("Deberias estar en el Taller de Administracion(9K)");
                        case 9 -> System.out.println("Deberias estar en Matematicas Discretas(7D)");
                        case 10 -> System.out.println("Deberias estar en Fundamentos de la Investigacion(5K)");
                        case 11 -> System.out.println("Deberias estar Calculo Diferencial(IE)");
                        case 12 -> System.out.println("Deberias estar en Taller de Etica(9K)");
                        case 1 -> System.out.println("Deberias estar en Taller de Etica(9K)");
                        case 2 -> System.out.println("Deberias estar en Taller de Etica(9K)");
                        default -> System.out.println("Estas libre :D");
                    }
                }
                case "MIERCOLES" -> {
                    switch(hr){
                        case 8 -> System.out.println("Deberias estar en el Taller de Administracion(9K)");
                        case 9 -> System.out.println("Deberias estar en Matematicas Discretas(7D)");
                        case 10 -> System.out.println("Deberias estar en Fundamentos de la Investigacion(5K)");
                        case 11 -> System.out.println("Deberias estar Calculo Diferencial(IE)");
                        case 12 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        case 1 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        case 2 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        default -> System.out.println("Estas libre :D");
                    }
                }
                case "JUEVES" -> {
                    switch(hr){
                        case 8 -> System.out.println("Deberias estar en el Taller de Administracion(9K)");
                        case 9 -> System.out.println("Deberias estar en Matematicas Discretas(7D)");
                        case 10 -> System.out.println("Deberias estar en Fundamentos de la Investigacion(5K)");
                        case 11 -> System.out.println("Deberias estar Calculo Diferencial(IE)");
                        case 12 -> System.out.println("Deberias estar en Taller de Etica(9K)");
                        case 1 -> System.out.println("Deberias estar en Taller de Etica(9K)");
                        case 2 -> System.out.println("Deberias estar en Taller de Etica(9K)");
                        default -> System.out.println("Estas libre :D");
                    }
                }
                case "VIERNES" -> {
                    switch(hr){
                        case 9 -> System.out.println("Deberias estar en Matematicas Discretas(7D)");
                        case 10 -> System.out.println("Deberias estar en Fundamentos de Programacion(LCV)");
                        case 11 -> System.out.println("Deberias estar Calculo Diferencial(IE)");
                        case 12 -> System.out.println("Deberias estar en Tutoria(LC)");
                        default -> System.out.println("Estas libre :D");
                    }
                }

            }
            
            System.out.println("te gustaria repetir este programa?");
            resp = x.next();
        }while(resp.equalsIgnoreCase("si"));
    }
    
}
