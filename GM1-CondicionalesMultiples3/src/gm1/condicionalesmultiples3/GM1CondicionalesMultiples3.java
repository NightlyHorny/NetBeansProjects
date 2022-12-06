
package gm1.condicionalesmultiples3;

import static java.lang.System.exit;
import java.util.Scanner;
/*
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1CondicionalesMultiples3 {
    public static void main(String[] args) {
        String carrera;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa la carrera que cursas");
        carrera = sc.next();
        
        if(carrera.equalsIgnoreCase("ISC")){
            carrera = "SistemasComputacionales";
        }else if(carrera.equalsIgnoreCase("IM")){
            System.out.println("Por favor especifica si es IMecatronica o IMecanica");
            exit(0);
        }else if(carrera.equalsIgnoreCase("IMecanica")){
            carrera = "Mecanica";
        }else if(carrera.equalsIgnoreCase("IMecatronica")){
            carrera = "Mecatronica";
        }else if(carrera.equalsIgnoreCase("II")){
            carrera = "Industrial";
        }else if(carrera.equalsIgnoreCase("IGE")){
            carrera = "Gestion";
        }
        //Switch;
        switch(carrera.toUpperCase()){
            case ("SISTEMASCOMPUTACIONALES"):
                System.out.println("En esta carrera se veran lenguajes de programacion y lo necesario para poder manejar las "
                        + "nuevas tecnologias");
                break;
            case ("MECANICA"):
                System.out.println("Control, Mantenimiento y Automatizacion maquinas industriales");
                break;
            case ("INDUSTRIAL"):
                System.out.println("Logistica en areas de produccion, areas de productos y en general lo necesario");
                break;
            case ("MECATRONICA"):
                System.out.println("Control, Mantenimiento y Automatizacion de circuitos electricos");
                break;
            case ("ELECTRONICA"):
                System.out.println("Comportamiento y mantenimiento de circuitos electronicos");
                break;
            case ("GESTION"):
                System.out.println("Gestion de empresa a nivel tactico");
                break;
            case ("CONTADURIA"):
                System.out.println("Contar cosas");
                break;
            default:
                System.out.println("No existe esa carrera");
                break;
        }
    }
    
}
