package gm1.switchempleado;

import java.util.Scanner;

/*
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1SwitchEmpleado {
    public static void main(String[] args) {
        String nombre;
        float salario, imp;
        int nac, act;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        nombre = sc1.next();
        System.out.println("Ingresa tu salario:");
        salario = sc2.nextFloat();
        System.out.println("Ingresa tu año de nacimiento:");
        nac = sc3.nextInt();
        
        if(salario > 500){
            salario += salario*0.12f; //salario=salario*1.12
            System.out.println(nombre + " tu salario a sido incremento un 12%, ahora es de "+salario);
        }else{
            salario += salario*0.09f;
            System.out.println(nombre + " tu salario a sido incremento un 9%, ahora es de "+salario);
        }
        act = 2022;
        act = act-nac;
        System.out.println("Tienes "+act+" años");
        if (act > 35){
            imp = salario*0.17f;
            salario = salario-imp;
            System.out.println("Al tener mas de 35 años, te cobraremos un impuesto de 17% = "+imp+ " tu saldo total sera de "+salario);
        }else{
            imp = salario*0.15f;
            salario = salario-imp;
            System.out.println("Al tener menos de 35 años, te cobraremos un impuesto de 15% = "+imp+ " tu saldo total sera de "+salario);
        }
        switch(nac){
            case 2000:
                System.out.println("Naciste con el siglo");
                break;
            case 2001:
                System.out.println("Torres gemelas");
                break;
            case 1968:
                System.out.println("Matanza en tlatelolco");
                break;
            default:
                break;
    }
        System.out.println("\n\nInformacion: \nNombre: "+nombre+"\nEdad: "+act+"\nSalario Final: "+salario);
    }
    
}
