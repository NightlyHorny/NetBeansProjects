/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numeroBinario;
        Scanner sc = new Scanner(System.in);
        numeroBinario = sc.next();
        int longitud = numeroBinario.length();
        int resultado = 0;
        int potencia = longitud - 1;
        
        for(int i = 0;i < longitud;i++){
         if(numeroBinario.charAt(i) == '1'){
          resultado += Math.pow(2,potencia);
         }
         potencia --;
        }
        System.out.println(numeroBinario+"="+resultado);
    }
    
}
