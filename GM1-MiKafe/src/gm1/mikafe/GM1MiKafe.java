package gm1.mikafe;
import java.util.Scanner;
/*@author GM1 - Ian Roberto Tejada Reyes*/
public class GM1MiKafe {

    public static void main(String[] args) {
        String cliente, extra, sabor, resp;
        String opcwhile = "Si";
        byte combo = 0;
        float total = 0, cambio, recibido, montoExtra = 0, faltante, recibof;

        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        while (opcwhile.equalsIgnoreCase("si")) {
            Scanner whileop = new Scanner(System.in);
            System.out.println("-- Mi Kafe --");
            System.out.println("1.- Combo Hamburguesas");
            System.out.println("2.- Combo Sandwich");
            System.out.println("3.- Combo Burrito");
            System.out.println("4.- Combo Pizza");
            System.out.println("Que combo deseas?");
            combo = x.nextByte();
            System.out.println("De que sabor la bebida?");
            sabor = x.next();
            if (sabor.equalsIgnoreCase("Coca") || sabor.equalsIgnoreCase("Sprite") || sabor.equalsIgnoreCase("Fanta") || sabor.equalsIgnoreCase("Agua")) {
                System.out.println("Deseas agregar algo extra?");
                resp = x.next();
                if (resp.equalsIgnoreCase("si")) {
                    System.out.println("P.- Papas");
                    System.out.println("T.- Tocino");
                    System.out.println("N.- Nuggets");
                    System.out.println("A.- Aros");
                    System.out.println("Elige algo extra");
                    extra = y.next();
                    switch (extra.toUpperCase()) {
                        case "P":
                            montoExtra = 30;
                            break;
                        case "T":
                            montoExtra = 20;
                            break;
                        case "N":
                            montoExtra = 50;
                            break;
                        case "A":
                            montoExtra = 30;
                            break;
                        default:
                            System.out.println("Ese extra no existe");
                    }
                }
                switch (combo) {
                    case 1:
                        total = 90 + montoExtra;
                        break;
                    case 2:
                        total = 50 + montoExtra;
                        break;
                    case 3:
                        total = 70 + montoExtra;
                        break;
                    case 4:
                        total = 80 + montoExtra;
                        break;
                    default:
                        System.out.println("Ese combo no existe");
                        break;
                }
                if (sabor.equalsIgnoreCase("Arizona")) {
                    total += 5;
                }
                System.out.println("El monto a pagar por esta compra es: " + total);
                System.out.println("A nombre de quien pongo el pedido?");
                cliente = y.next();
                System.out.println(cliente + " recibo tu pago por");
                recibido = y.nextFloat();
                if (recibido < total) {
                    System.out.println("Monto de pago insuficiente.");
                } else {
                    cambio = recibido - total;
                    System.out.println("El cambio es de: " + cambio);
                }
            } else {
                System.out.println("por el momento no contamos con " + sabor + ", por defecto se te asignara CocaCola");
                sabor = "Coca";
                System.out.println("Deseas agregar algo extra?");
                resp = x.next();
                if (resp.equalsIgnoreCase("si")) {
                    System.out.println("P.- Papas");
                    System.out.println("T.- Tocino");
                    System.out.println("N.- Nuggets");
                    System.out.println("A.- Aros");
                    System.out.println("Elige algo extra");
                    extra = y.next();
                    switch (extra.toUpperCase()) {
                        case "P":
                            montoExtra = 30;
                            break;
                        case "T":
                            montoExtra = 20;
                            break;
                        case "N":
                            montoExtra = 50;
                            break;
                        case "A":
                            montoExtra = 30;
                            break;
                        default:
                            System.out.println("Ese extra no existe");
                    }
                }
                switch (combo) {
                    case 1:
                        total = 90 + montoExtra;
                        break;
                    case 2:
                        total = 50 + montoExtra;
                        break;
                    case 3:
                        total = 70 + montoExtra;
                        break;
                    case 4:
                        total = 80 + montoExtra;
                        break;
                    default:
                        System.out.println("Ese combo no existe");
                        break;
                }
                if (sabor.equalsIgnoreCase("Arizona")) {
                    total += 5;
                }
                System.out.println("El monto a pagar por esta compra es: " + total);
                System.out.println("A nombre de quien pongo el pedido?");
                cliente = y.next();
                System.out.println(cliente + " recibo tu pago por");
                recibido = y.nextFloat();
                if (recibido < total) {
                    faltante = recibido - total;
                    faltante = faltante * (-1);
                    System.out.println("Te falta un total de " + faltante + " pesos");
                    System.out.println("Por favor ingresa el dinero faltante: ");
                    recibof = y.nextFloat();
                    if (recibof == faltante) {
                        System.out.println("Pago completado recoje tu pedido, lindo dia :D");
                    } else if (recibof > faltante) {
                        recibof -= faltante;
                        System.out.println("Tu cambio es de " + recibof);
                    } else {
                        faltante -= recibof;
                        System.out.println("El valor ingresado es menor al total, te falta un total de: " + faltante);
                        System.out.println("Por favor ingresa el dinero faltante: ");
                        recibof = y.nextFloat();
                        if (recibof == faltante) {
                            System.out.println("Pago completado recoje tu pedido, lindo dia :D");
                        } else if (recibof > faltante) {
                            recibof -= faltante;
                            System.out.println("Tu cambio es de " + recibof);
                        } else {
                            System.out.println("Lo sentimos, tu orden expiro.");
                        }
                    }
                } else {
                    cambio = recibido - total;
                    System.out.println("El cambio es de: " + cambio + " pesos");
                    System.out.println("Pago completado recoje tu pedido, lindo dia :D");
                }
            }
            System.out.println("Te gustaria ordenar de nuevo:");
            opcwhile = whileop.next();
        }
    }

}
