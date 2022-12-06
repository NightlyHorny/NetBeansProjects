package gm1.condicionalcompu;

import java.util.Scanner;

/**
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1CondicionalCompu {
    public static void main(String[] args) {
        String op, idioma = null, opc, soft;
        int preciob; 
        byte procesador, memoria, disco, teclado, acc = 0, software = 0;
        Scanner x = new Scanner(System.in);
        System.out.println(" -- Bienvenido a Pinux --");
        System.out.println("Tenemos excelentes ofertas para ti \nPueba nuestras "
                + "nuevas computadoras, mas rapidas y de mejor calidad.");
        System.out.println("------------------------------------");
        System.out.println("|       ASUS ROG Edition 14        |");
        System.out.println("|          8GB RAM DDR4            |"
                       + "\n|           SSD 240GB              |"
                       + "\n|         Intel i5 10900K          |"
                       + "\n|          Desde 29,990            |");
        System.out.println("------------------------------------");
        System.out.println("\n");
        System.out.println("------------------------------------");
        System.out.println("|        HP Zombie Gamer Z         |");
        System.out.println("|          8GB RAM DDR3            |"
                       + "\n|           SSD 240GB              |"
                       + "\n|       AMD Ryzen 5 3300U          |"
                       + "\n|          Desde 20,000            |");
        System.out.println("------------------------------------");
        System.out.println("\n");
        System.out.println("Selecciona una opcion de compra: (Asus/Zombie)");
        op = x.next();
        switch(op.toUpperCase()){ 

        case "ASUS":
            preciob= 29990;
            System.out.println("------------------------------------");
            System.out.println("|       ASUS ROG Edition 14        |");
            System.out.println("|          8GB RAM DDR4            |"
                           + "\n|           SSD 240GB              |"
                           + "\n|         Intel i5 10900K          |"
                           + "\n|          Desde 29,990            |");
            System.out.println("------------------------------------");
            System.out.println("\n");
            System.out.println("A continuacion Configuraremos algunas cosas:");
            System.out.println(" -- PROCESADOR --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- Intel i5 10900K(Incluido) \n2.- Intel i7 10900K (+8,900)");
            procesador=x.nextByte();
            switch(procesador){
                case 1:
                    break;
                case 2:
                    preciob += 8900;
                    break;
                default:
                    procesador = 1;
                    break;
            }
            System.out.println(" -- MEMORIA --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- 8GB DDR4(Incluido) \n2.- 16GB DDR4(+3200)");
            memoria=x.nextByte();
            switch(memoria){
                case 1:
                    break;
                case 2:
                    preciob += 3200;
                    break;
                default:
                    memoria = 1;
                    break;
            }
            System.out.println(" -- ALMACENAMIENTO --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- SSD 240GB(Incluido) \n2.- SSD 512GB(+900)");
            disco=x.nextByte();
            switch(disco){
                case 1:
                    break;
                case 2:
                    preciob += 900;
                    break;
                default:
                    disco = 1;
                    break;
            }
            System.out.println(" -- TECLADO --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- Español(Incluido) \n2.- Otro Idioma(GRATIS)");
            teclado=x.nextByte();
            switch(teclado){
                case 1:
                    break;
                case 2:
                    System.out.println("Ingresa el idioma del teclado:");
                    idioma = x.next();
                    break;
                default:
                    teclado = 1;
                    break;
            }
            System.out.println("Deseas agregar accesorios: Y/N");
            opc = x.next();
            if(opc.equalsIgnoreCase("y")){
                System.out.println(" -- ACCESORIOS --");
                System.out.println("Precio :"+preciob);
                System.out.println("\n1.- Seguro de vida(+6500) \n2.- Teclado RetroIluminado(+1200) \n3.- Raton RGB(+400)");
                acc=x.nextByte();
                switch (acc) {
                    case 1:
                        preciob += 6500;
                        break;
                    case 2:
                        preciob += 1200;
                        break;
                    case 3:
                        preciob += 400;
                        break;
                    default:
                        System.out.println("No se agregara ningun Accesorio");
                        opc="N";
                        break;
                }
            }
            
            System.out.println("Deseas agregar software: Y/N");
            soft = x.next();
            if(soft.equalsIgnoreCase("y")){
                System.out.println(" -- SOFTWARE --");
                System.out.println("Precio :"+preciob);
                System.out.println("\n1.- OFFICE 2021(+5000) \n2.- Filmora Studio(+2300) \n3.- Licencia Windows(+1200)");
                software=x.nextByte();
                switch (software) {
                    case 1:
                        preciob += 5000;
                        break;
                    case 2:
                        preciob += 2300;
                        break;
                    case 3:
                        preciob += 1200;
                        break;
                    default:
                        System.out.println("No se agregara software");
                        soft= "N";
                        break;
                }
            }
            
            
            System.out.println("\n\n\n");
            System.out.println("ASUS ROG Edition 14");
            System.out.println("Precio + IVA(18%): "+(preciob+(preciob*0.18)));

            System.out.println("Procesador:");
            if(procesador == 1)
                System.out.println("Intel i5 10900K");
            else
                System.out.println("Intel i7 10900K");
            

            System.out.println("Memoria:");
            if(memoria == 1)
                System.out.println("8GB DDR4");
            else
                System.out.println("16GB DDR4");
            

            System.out.println("Almacenamiento:");
            if(procesador == 1)
                System.out.println("SSD 240GB");
            else
                System.out.println("SSD 512GB");
            

            System.out.println("Teclado:");
            if(teclado == 1)
                System.out.println("Español");
            else
                System.out.println(idioma);
            

            System.out.println("Accesorios:");
            if(opc.equalsIgnoreCase("y")){
                switch (acc) {
                    case 1:
                        System.out.println("Seguro de vida");
                        break;
                    case 2:
                        System.out.println("Teclado Retroiluminado");
                        break;
                    case 3:
                        System.out.println("Raton RGB");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            }else
                System.out.println("Sin accesorios");
            

            System.out.println("Software:");
            if(soft.equalsIgnoreCase("y")){
                switch (software) {
                    case 1:
                        System.out.println("Office 2021");
                        break;
                    case 2:
                        System.out.println("Filmora Studio");
                        break;
                    case 3:
                        System.out.println("Licencia de Windows");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            }else
                System.out.println("Sin software");
            break;
        case "ZOMBIE":
            preciob= 20000;
            System.out.println("------------------------------------");
            System.out.println("|        HP Zombie Gamer Z         |");
            System.out.println("|          8GB RAM DDR3            |"
                           + "\n|           SSD 240GB              |"
                           + "\n|       AMD Ryzen 5 3300U          |"
                           + "\n|          Desde 20,000            |");
            System.out.println("------------------------------------");
            System.out.println("\n");
            System.out.println("A continuacion Configuraremos algunas cosas:");
            System.out.println(" -- PROCESADOR --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- AMD Ryzen 5 3300U(Incluido) \n2.- AMD Ryzen 7 3300U (+5,900)");
            procesador=x.nextByte();
            switch(procesador){
                case 1:
                    break;
                case 2:
                    preciob += 5900;
                    break;
                default:
                    procesador = 1 ;
                    break;
            }
            System.out.println(" -- MEMORIA --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- 8GB DDR3(Incluido) \n2.- 16GB DDR3(+3000)");
            memoria=x.nextByte();
            switch(memoria){
                case 1:
                    break;
                case 2:
                    preciob += 3000;
                    break;
                default:
                    memoria = 1;
                    break;
            }
            System.out.println(" -- ALMACENAMIENTO --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- SSD 240GB(Incluido) \n2.- SSD 512GB(+900)");
            disco=x.nextByte();
            switch(disco){
                case 1:
                    break;
                case 2:
                    preciob += 900;
                    break;
                default:
                    disco=1;
                    break;
            }
            System.out.println(" -- TECLADO --");
            System.out.println("Precio :"+preciob);
            System.out.println("\n1.- Español(Incluido) \n2.- Otro Idioma(GRATIS)");
            teclado=x.nextByte();
            switch(teclado){
                case 1:
                    break;
                case 2:
                    System.out.println("Ingresa el idioma del teclado:");
                    idioma=x.next();
                    break;
                default:
                    teclado=1;
                    break;
            }
            System.out.println("Deseas agregar accesorios: Y/N");
            opc = x.next();
            if(opc.equalsIgnoreCase("y")){
                System.out.println(" -- ACCESORIOS --");
                System.out.println("Precio :"+preciob);
                System.out.println("\n1.- Seguro de vida(+6500) \n2.- Teclado RetroIluminado(+1200) \n3.- Raton RGB(+400)");
                acc=x.nextByte();
                switch (acc) {
                    case 1:
                        preciob += 6500;
                        break;
                    case 2:
                        preciob += 1200;
                        break;
                    case 3:
                        preciob += 400;
                        break;
                    default:
                        System.out.println("No se agregaran accesorios");
                        opc= "N";
                        break;
                }
            }
            
            System.out.println("Deseas agregar software: Y/N");
            soft = x.next();
            if(soft.equalsIgnoreCase("y")){
                System.out.println(" -- SOFTWARE --");
                System.out.println("Precio :"+preciob);
                System.out.println("\n1.- OFFICE 2021(+5000) \n2.- Filmora Studio(+2300) \n3.- Licencia Windows(+1200)");
                software=x.nextByte();
                switch (software) {
                    case 1:
                        preciob += 5000;
                        break;
                    case 2:
                        preciob += 2300;
                        break;
                    case 3:
                        preciob += 1200;
                        break;
                    default:
                        System.out.println("No se agregara Software");
                        soft= "N";
                        break;
                }
            }
            
            
            System.out.println("\n\n\n");
            System.out.println("HP Zombie Gamer Z");
            System.out.println("Precio + IVA(18%): "+(preciob+(preciob*0.18)));

            System.out.println("Procesador:");
            if(procesador == 1)
                System.out.println("AMD Ryzen 5 3300U");
            else
                System.out.println("AMD Ryzen 7 3300U");
            
            System.out.println("Memoria:");
            if(memoria == 1)
                System.out.println("8GB DDR3");
            else
                System.out.println("16GB DDR3");
            
            System.out.println("Almacenamiento:");
            if(procesador == 1)
                System.out.println("SSD 240GB");
            else
                System.out.println("SSD 512GB");
            

            System.out.println("Teclado:");
            if(teclado == 1)
                System.out.println("Español");
            else
                System.out.println(idioma);
            

            System.out.println("Accesorios:");
            if(opc.equalsIgnoreCase("y")){
                switch (acc) {
                    case 1:
                        System.out.println("Seguro de vida");
                        break;
                    case 2:
                        System.out.println("Teclado Retroiluminado");
                        break;
                    case 3:
                        System.out.println("Raton RGB");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            }else
                System.out.println("Sin accesorios");
            

            System.out.println("Software:");
            if(soft.equalsIgnoreCase("y")){
                switch (software) {
                    case 1:
                        System.out.println("Office 2021");
                        break;
                    case 2:
                        System.out.println("Filmora Studio");
                        break;
                    case 3:
                        System.out.println("Licencia de Windows");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            }else
                System.out.println("Sin software");
            
            break;
        default:
            System.out.println("Opcion Incorrecta");
            break;
    }
    }
    
}
