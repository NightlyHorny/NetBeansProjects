package gm1.condicionalesdolares;

import java.util.Scanner;

/**
 *
 * @author Ian Roberto Tejada Reyes
 */
public class GM1CondicionalesDolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float pesos = 0;
        float dolares = 0;
        String resp = "Si";
        
        while (resp.equalsIgnoreCase("si")) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingresa la cantidad de pesos a cambiar a Dlls");
            pesos = sc.nextFloat();
            
            if (pesos <= 4999) {
                dolares = pesos / 19.80f;
            } else {
                if (pesos >= 5000 && pesos <= 9999) {
                    dolares = pesos / 19.50f;
                } else {
                    dolares = pesos / 19.12f;
                }
            }
            
            System.out.println("Monto a entregar en dolares " + dolares);
            System.out.println("Te gustaria hacer otro calculo:");
            resp = sc.next();
        }
        
    }
    
}
