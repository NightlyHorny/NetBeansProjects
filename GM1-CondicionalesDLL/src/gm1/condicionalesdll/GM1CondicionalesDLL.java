package gm1.condicionalesdll;

import java.util.Scanner;

/**
 *
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1CondicionalesDLL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pesos = 0, dll = 0;
        Scanner sc1 = new Scanner (System.in);
        System.out.println("Ingresa la cantiad de pesos a cambiar a Dll's");
        pesos=sc1.nextFloat();
        if(pesos >= 5000){
            dll = pesos/19.50f;
        }else{
            if(pesos <= 99999 && pesos >= 5000){
                dll = pesos/19.50f;
            }else{
                dll = pesos/19.12f;
            }
            dll = pesos/19.80f;
        }
        System.out.println("Monto a entrear (Dll's) "+dll);
    }
    
}
