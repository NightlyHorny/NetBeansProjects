package gm1.vectores;

import java.util.Scanner;

/* @author GM1 - Ian Roberto tejada Reyes*/
public class GM1Vectores {
    public static void main(String[] args) {
        /* int calif1,calif2,calif3,calif4,calif5,calif6,calif7,calif8,calif9,calif10;
        String resp = "si";
        float prom, total;
        Scanner x = new Scanner(System.in);
        while(resp.equalsIgnoreCase("si")){
            System.out.println("ingresa las calificaciones (1/100)");
            calif1 = x.nextInt();
            calif2 = x.nextInt();
            calif3 = x.nextInt();
            calif4 = x.nextInt();
            calif5 = x.nextInt();
            calif6 = x.nextInt();
            calif7 = x.nextInt();
            calif8= x.nextInt();
            calif9 = x.nextInt();
            calif10 = x.nextInt();
            total = calif1 + calif2 + calif3 + calif4 + calif5 + calif6 + calif7 + calif8 + calif9 + calif10;
            prom = total / 10;
            System.out.println("El promedio es "+prom);
            System.out.println("Deseas repetir el programa?");
            resp = x.next();
        } */
        float[] califica = new float[10];
        String[] nombres = new String[10];
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        float total = 0;
        for(int i = 0; i<=9;i++){
            System.out.println("Cual es el nombre de la materia "+(i+1));
            nombres[i]=y.next();
            System.out.println("Escribe la calificacion "+(i+1));
            califica[i]=x.nextFloat();
            total += califica[i];
        }
        System.out.println("promedio ->"+(total/califica.length));
    }
    
}
