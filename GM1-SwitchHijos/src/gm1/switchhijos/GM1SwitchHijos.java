package gm1.switchhijos;
import java.util.Scanner;
/*
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1SwitchHijos {
    public static void main(String[] args) {
        // Capturar nombre, salario por cada hijo mil
        String nombre, sexo, yn;
        float salario;
        byte hijos;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        nombre = sc3.next();
        System.out.println("Ingresa tu salario:");
        salario = sc2.nextFloat();
        System.out.println("Tienes hijos? si/no");
        yn = sc4.next();
        if(yn.equalsIgnoreCase("si")){
            System.out.println("Ingresa la cantidad de hijos:");
            hijos = sc1.nextByte();
            switch (hijos){
            //niñas 300 niños 500
            case 1:
                System.out.println("Tu hijo es mujer o hombre? (H/M)");
                sexo = sc4.next();
                if("H".equalsIgnoreCase(sexo)){
                    System.out.println(nombre+" tu salario actual es de "+salario+" por tener un hijo tienes un aumento"
                        + " de "+(salario+=1000)+ " y al tener un Hombre tendras un bono de $500 por lo que tu sueldo es "+(salario+=500) );
                }else{
                    System.out.println(nombre+" tu salario actual es de "+salario+" por tener un hijo tienes un aumento"
                        + " de "+(salario+1000)+ " y al tener un Hombre tendras un bono de $300 por lo que tu sueldo es "+(salario+1000+300) );
                }
                break;
            case 2:
                System.out.println("Elige alguna de las siguientes opciones:");
                System.out.println("a) Tienes 1 hijo y 1 hija");
                System.out.println("b) Tienes dos hijos");
                System.out.println("c) Tienes dos hijas");
                sexo = sc4.next();
                switch (sexo.toUpperCase()){
                    case "A":
                        System.out.println(nombre+" tu salario actual es de "+salario+" por tener dos hijos tienes un aumento"
                        + " de "+(salario+=2000)+ " y al tener un Hombre y una Mujer tendras un bono de $800 por lo que tu sueldo es "+(salario+=800));
                        break;
                    case "B":
                        System.out.println(nombre+" tu salario actual es de "+salario+" por tener dos hijos tienes un aumento"
                        + " de "+(salario+=2000)+ " y al tener dos Mujeres tendras un bono de $600 por lo que tu sueldo es "+(salario+=600));
                        break;
                    case "C":
                        System.out.println(nombre+" tu salario actual es de "+salario+" por tener dos hijos tienes un aumento"
                        + " de "+(salario+=2000)+ " y al tener dos Hombres tendras un bono de $1000 por lo que tu sueldo es "+(salario+=1000));
                        break;
                    default:
                        System.out.println("Lo siento escoje una opcion correcta.");
                }
                break;
            case 3:
                System.out.println("Elige alguna de las siguientes opciones:");
                System.out.println("a) Tienes 2 hijos y 1 hija");
                System.out.println("b) Tienes 2 hijas y 1 hijo");
                sexo = sc4.next();
                switch (sexo.toUpperCase()){
                    case "A":
                        System.out.println(nombre+" tu salario actual es de "+salario+" por tener tres hijos tienes un aumento"
                        + " de "+(salario+=3000)+ " y al tener dos Hombre y una Mujer tendras un bono de $1300 por lo que tu sueldo es "+(salario+=1300));
                        break;
                    case "B":
                        System.out.println(nombre+" tu salario actual es de "+salario+" por tener tres hijos tienes un aumento"
                        + " de "+(salario+=3000)+ " y al tener dos Mujeres y un Hombre tendras un bono de $1100 por lo que tu sueldo es "+(salario+=1100));
                        break;
                    default:
                        System.out.println("Lo siento escoje una opcion correcta.");
                }
                break;
            default:
                    System.out.println(nombre+ " lo lamento "+nombre+" tienes demasiados hijos, no podemos hacerte un aumento tu sueldo sera de: "+salario);
                break;
        }
        }else{
            System.out.println("Lo lamento "+nombre+" no tienes hijos pero tu salario sera el mismo: "+salario);
        }
        
    }
    
}
