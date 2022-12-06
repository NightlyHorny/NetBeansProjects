
package com.mycompany.gm1conceptos;

import java.util.Scanner;

/**
 *
 * @author GM1-Vladimir Zuñiga Linares
 */
public class GM1Conceptos {

    public static void main(String[] args) {        
        //Declaracion de Variable
        int varNumero1;
        int varNumero2;
        
        //Instanciar objetos Scanner
        Scanner captura=new Scanner(System.in);
        
        System.out.println("Ingresa el primer numero que quieres sumar");
        varNumero1=captura.nextInt();
        //System.out.println(varNumero1);
        System.out.println("Ingresa el segundo numero que quieres sumar");
        varNumero2=captura.nextInt();
        //Procedimiento
       int varResultado;
       varResultado = varNumero1 + varNumero2;
       //Mostrar Resultado
       System.out.println("La suma de los numeros es "+varResultado);
    }
}
