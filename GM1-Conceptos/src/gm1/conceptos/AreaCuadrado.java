package gm1.conceptos;

import java.util.Scanner;

/**
 *
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class AreaCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        int varLado;
        int varArea;
        //Instanciar objeto scanner
        Scanner x = new Scanner(System.in);
        //Ingresar los datos
        System.out.println("|-----------------------------------|");
        System.out.println("|        Area de un Cuadrado        |");
        System.out.println("|     Ian Roberto Tejada Reyes      |");
        System.out.println("|                GM1                |");
        System.out.println("|___________________________________|\n");
        System.out.println("¿Cuanto vale el lado?");
        varLado = x.nextInt();
        //Procedimiento
        varArea = varLado*varLado;
        //Mostrar el resultado
        System.out.println("\nEl resultado del area del cuadrado es: " + varArea);
    }
    
}
