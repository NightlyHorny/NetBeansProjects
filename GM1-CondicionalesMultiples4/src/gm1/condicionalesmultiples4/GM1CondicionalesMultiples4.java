package gm1.condicionalesmultiples4;
import java.util.Scanner;
/*
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1CondicionalesMultiples4 {
    public static void main(String[] args) {
        String departamento, articulo;
        float monto, op;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa el nombre del articulo");
        articulo = sc3.next();
        System.out.println("Ingresa el departmento al que pertenezcan");
        System.out.println("a) Alimentos \nb) Electronica \nc) Ropa \nd) Vinos y licores \ne) Otros");
        departamento = sc1.next();
        System.out.println("Ingresa el monto total");
        monto = sc2.nextFloat();
        
        switch(departamento){
            case "a":
                System.out.println("El articulo " + articulo + " tiene un costo total de: "+ monto);
                break;
            case "b":
                op = monto*0.35f;
                op = op+monto;
                System.out.println("El articulo " + articulo + " tiene un costo total de: "+ op);
                break;
            case "c":
                op = monto*0.20f;
                op = op+monto;
                System.out.println("El articulo " + articulo + " tiene un costo total de: "+ op);
                break;
            case "d":
                op = monto*0.29f;
                op = op+monto;
                System.out.println("El articulo " + articulo + " tiene un costo total de: "+ op);
                break;
            case "e":
                op = monto*0.05f;
                op = op+monto;
                System.out.println("El articulo " + articulo + " tiene un costo total de: "+ op);
                break;
            default:
                System.out.println("No existe ese departamento");
                break;
        }
    }
    
}
