package gm1.conceptos;
import java.util.Scanner;
/**
 *
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1Conceptos {

    public static void main(String[] args) {
        //Declaracion de Variables
        int varNumero1;
        int varNumero2;
        int varSuma;
                
        //Instanciar objeto Scanner
        Scanner captura=new Scanner(System.in);
        System.out.println("|-----------------------------------|");
        System.out.println("|        Suma de dos Numeros.       |");
        System.out.println("|     Ian Roberto Tejada Reyes      |");
        System.out.println("|                GM1                |");
        System.out.println("|___________________________________|\n");
        System.out.println("Ingresa el primer número qué quieres sumar:");
        varNumero1=captura.nextInt();
        System.out.println("Ingresa el segundo número qué quieres sumar:");
        varNumero2=captura.nextInt();
        
        //Procedimiento
        varSuma = varNumero1 + varNumero2;
        System.out.println("\nLa suma de los numeros: " + varNumero1 + " + " + varNumero2 + " = " + varSuma);
                
    }
    
}
