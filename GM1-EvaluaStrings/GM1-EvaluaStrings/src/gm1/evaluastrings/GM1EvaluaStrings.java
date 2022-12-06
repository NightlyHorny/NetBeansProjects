package gm1.evaluastrings;

import java.util.Scanner;

/**
 *
 * @author GM1 - Ian ROberto Tejada Reyes
 */
public class GM1EvaluaStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Captura 5 strings libres
        //Realizar las operaciones de manejo de strings
        /*
        String nombre = "ian roberto tejada reyes";
        String nacimiento = "piedras negras, coahuila";
        String descripcionCasa = "color beige, en obra negra con puerta de madera";
        String primaria = "Heriberto Salas Flores";
        String primcompare = "heriberto salas flores";*/
        
        //Length charAt indexOf compareTo compareToIgnoreCase contains endsWith replace toUpperCase toLowerCase
        //  \       \       \       \               \           \         \          \       \           \  
        String nombre, nacimiento, descripcionCasa, primaria, primcompare;
        Scanner obj1 = new Scanner (System.in);
        Scanner obj2 = new Scanner (System.in);
        Scanner obj3 = new Scanner (System.in);
        Scanner obj4 = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre porfavor: ");
        nombre = obj1.nextLine();
        System.out.println("Ingresa tu lugar de nacimiento: ");
        nacimiento = obj2.nextLine();
        System.out.println("Ingresa la descripcion de tu casa: ");
        descripcionCasa = obj3.nextLine();
        System.out.println("Ingresa el nombre de tu primaria: ");
        primaria = obj4.nextLine();
        System.out.println("\n\n");
        primcompare = primaria.toUpperCase();
        
        int longitud;
        longitud=nombre.length();
        System.out.println("La longitud de tu nombre es: "+longitud);
        System.out.println("Tu nombre esta mas bonito en mayusculas "+nombre.toUpperCase());
        
        char pos;
        pos=nacimiento.charAt(9);
        System.out.println("La posicion 9 de tu lugar de nacimiento es: "+pos);
        
        
        System.out.println("Comparemos "+primaria+" con "+primcompare+" "+ primaria.compareTo(primcompare)+"\nComo no son iguales ignoremos las mayusculas: "+primaria.compareToIgnoreCase(primcompare));
        String cscontain = "color";
        String csscontain = "Color";
        if(descripcionCasa.contains(cscontain) || descripcionCasa.contains(csscontain)){
            System.out.println("Ya vi que incluiste el color de tu casa, gracias");
        }else{
            System.out.println("Que mal que no contiene el color");
        }
        int num = nacimiento.indexOf("c");
        if (-1 == num){
            System.out.println("El indice de la letra C es: "+nacimiento.indexOf("C"));
        }else{
            System.out.println("El indice de la letra c es: "+nacimiento.indexOf("c"));
        }
        
        System.out.println("Mejor devuelvo tu nombre a minusculas para que no te enojes :D "+nombre.toLowerCase());
        if(descripcionCasa.contains("a")){
        System.out.println("Remplazemos una letra de tu descripcion de casa "+descripcionCasa.replace("a", " Aqui estoy "));
        }else if(descripcionCasa.contains("e")){
            System.out.println("Remplazemos una letra de tu descripcion de casa "+descripcionCasa.replace("e", " Aqui estoy "));
        }
        if(nombre.endsWith("0") == false){
        System.out.println("Lastima que tu nombre no termine con o "+nombre.endsWith("o"));
        }else{
        System.out.println("Que bueno que tu nombre termina con o "+nombre.endsWith("o"));
        }
    }
    
}
