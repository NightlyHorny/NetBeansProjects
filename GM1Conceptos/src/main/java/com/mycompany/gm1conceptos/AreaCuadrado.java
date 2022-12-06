
package com.mycompany.gm1conceptos;

import java.util.Scanner;

/**
 *
 * @author GM1-Vladimir Zuñiga Linares
 */
public class AreaCuadrado {

    public static void main(String[] args) {
     
        //Declaracion de variables
        int varLado;
        int varArea;
        //Instanciar objeto Scanner
        Scanner x=new Scanner(System.in);
        //Ingresar los datos
        System.out.println("Cuanto vale el lado?");
        varLado=x.nextInt();
        //Procedimiento
        varArea=varLado*varLado;
        //Mostrar el resultado
        System.out.println("El area del cuadrado es "+ varArea);
    }
    
}
