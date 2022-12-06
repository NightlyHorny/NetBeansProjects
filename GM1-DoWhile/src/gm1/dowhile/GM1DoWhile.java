package gm1.dowhile;

import java.util.Scanner;

/*
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1DoWhile {
    public static void main(String[] args) {
        // Permite repetir un conjunto de instrucciones que se ejecutan al menos 1 vez
        String nombre, respuesta;
        int edad;
        float peso, estatura, imc;
        Scanner x = new Scanner(System.in);
        do{
            System.out.println("Escribe tu nombre:");
            nombre = x.next();
            System.out.println("Escribe tu edad:");
            edad = x.nextInt();
            System.out.println("Escribe tu peso (kg):");
            peso = x.nextFloat();
            System.out.println("Escribe tu estatura (m)");
            estatura = x.nextFloat();
            
            imc = peso/(estatura*estatura);
            
            System.out.println(nombre+" tu indice de masa corporal es: "+imc);
            if(imc<18.5f){
                System.out.println("Tu peso esta por debajo de lo normal.");
            }else if(imc>=18.5f && imc<=24.9f){
                System.out.println("Tu peso es normal.");
            }else if(imc>=24.9f && imc<=29.9f){
                System.out.println("Tienes sobrepeso");
            }else{
                System.out.println("Se considera que tienes obesidad.");
            }
            System.out.println("Deseas calcular otro IMC?: (Y/N)");
            respuesta = x.next();
        }while(respuesta.equalsIgnoreCase("y"));
        
    }
    
}
