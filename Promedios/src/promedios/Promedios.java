/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Promedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, suma=0, b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            b=sc.nextInt();
            suma+=b;
        }
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println(format.format(suma/a));
    }
    
}
