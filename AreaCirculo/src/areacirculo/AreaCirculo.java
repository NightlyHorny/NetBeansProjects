/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacirculo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, area;
        Scanner sc = new Scanner(System.in);
        radio = sc.nextDouble();
        area = Math.PI*radio*radio;
        DecimalFormat format = new DecimalFormat("#.00");
        System.out.println(format.format(area));
    }
    
}
