package gm1.condicionalmultiple;
import java.util.Scanner;
/**
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1CondicionalMultiple {
    public static void main(String[] args) {
        String dia="";
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el dia de la semana");
        dia = sc.next();
        switch(dia.toUpperCase()){
            case ("LUNES"):
                System.out.println("Dia dedicado a la Luna");
                System.out.println("En ingles Monday (Selene)");
                break;
            case ("MARTES"):
                System.out.println("Dia dedicado a Marte");
                System.out.println("Dios de la guerra (Ares)");
                break;
            case ("MIERCOLES"):
                System.out.println("Dia dedicado a Mercurio");
                System.out.println("Mensajero de los dioses (Hermes)");
                break;
            case ("JUEVES"):
                System.out.println("Dia dedicado a Jupiter");
                System.out.println("Dios Padre (Zeus)");
                break;
            case ("VIERNES"):
                System.out.println("Dia dedicado a Venus");
                System.out.println("Diosa de la belleza y el amor (Afrodita)");
                break;
            case ("SABADO"):
                System.out.println("Dia dedicado a Saturno");
                System.out.println("Dios del tiempo (Cronos)");
                break;
            case ("DOMINGO"):
                System.out.println("Dia dedicado al Sol");
                break;
            default:
                System.out.println("No existe ese dia");
                break;
        }}}
