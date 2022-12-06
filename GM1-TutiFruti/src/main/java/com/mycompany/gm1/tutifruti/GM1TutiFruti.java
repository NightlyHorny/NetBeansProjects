package com.mycompany.gm1.tutifruti;

import java.util.Scanner;

/*
 * @author nightlyhorny
 */
public class GM1TutiFruti {

    public static void main(String[] args) {
        double area=0, perimetro=0;
        float lado, radio, base, altura;
        byte opc;
        boolean op;
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Figuras Geometricas --");
        System.out.println("1- Circulo");
        System.out.println("2- Cuadrado");
        System.out.println("3- Triangulo");
        System.out.println("Escoje una opcion(1,2 o 3)");
        opc = sc.nextByte();
        
        System.out.println("Deseas calcular...");
        System.out.println("Area = true");
        System.out.println("Perimetro = false");
        op = sc.nextBoolean();
        
        switch(opc){
            case 1 -> {
                System.out.println("Ingresa el valor del radio");
                radio = sc.nextFloat();
                
                if(op==true){
                    area = Math.PI*radio*radio;
                    System.out.println("El area del circulo es "+area);
                }else{
                    perimetro = Math.PI*(2*radio);
                    System.out.println("El perimetro del circulo es "+perimetro);
                }
            }
            case 2 -> {
                System.out.println("Ingresa el valor del lado");
                lado = sc.nextFloat();
                if(op==true){
                    area = lado*lado;
                    System.out.println("El area del cuadrado es "+area);
                }else{
                    perimetro = lado+lado+lado+lado;
                    System.out.println("El perimetro del vuadrado es "+perimetro);
                }
            }
            case 3 -> {
                System.out.println("Ingresa el valor de la base");
                base = sc.nextFloat();
                System.out.println("Ingresa el valor de la altura");
                altura = sc.nextFloat();
                if(op==true){
                    area = (base*altura)/2;
                    System.out.println("El area del triangulop es "+area);
                }else{
                    float a,b,c;
                    System.out.println("Ingresa el valor del primer lado");
                    a = sc.nextFloat();
                    System.out.println("Ingresa el valor del segundo lado");
                    b = sc.nextFloat();
                    System.out.println("Ingresa el valor del tercer lado");
                    c = sc.nextFloat();
                    perimetro= a+b+c;
                    System.out.println("El perimetro del triangulo es "+perimetro);
                }
            }
            default -> System.out.println("Opcion incorrecta");
        }
    }
}
