/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gm1.manejostring;

/**
 *
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1ManejoString {
    public static void main(String[] args) {
        String nombre = "Juanito Perez Gonzalez";
        String palabra = "Tec de Piedras";
        String pais = "Estados Unidos Mexicanos";
        
        int cuenta;
        
        char letra;
        //Longitud
        cuenta=pais.length();
        System.out.println("La longitud de pais es "+cuenta);
        //
        letra=palabra.charAt(8);
        System.out.println("La posicion 8 contiene "+letra);
        //Indice
        System.out.println("Indice de la letra U: "+pais.indexOf("U"));
        
        //Comparar Palabras
        String x = "Tecnologico";
        String y = "TECNOLOGICO";
        System.out.println("Comparar palabras: "+x.compareTo(y));
        System.out.println("Comparar sin mayusculas: "+x.compareToIgnoreCase(y));
        
        //Para determinar si un texto contiene otro
        String cancion="Estas son las mañanitas que cantaba el rey David";
        String sub="que";
        System.out.println("La cancion contiene el sub "+cancion.contains(sub));
        
        //Para determinar si termina con una secuencia especifica
        System.out.println(x.endsWith("ico"));
        
        //Buscar y remplazar caracteres
        System.out.println(palabra.replace("Tec", "Instituto Tecnologico"));
        System.out.println(cancion);
        System.out.println(cancion.toUpperCase());
        System.out.println(cancion);
        System.out.println(cancion.toLowerCase());
    
    }   
    
    
}
