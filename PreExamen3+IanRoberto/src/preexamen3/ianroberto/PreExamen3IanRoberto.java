package preexamen3.ianroberto;
import java.util.Scanner;
/*
 * @author Ian Roberto Tejada Reyes
 */
public class PreExamen3IanRoberto {
    public static void main(String[] args) {
        int num = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        String opc;
        Scanner x = new Scanner(System.in);
        do {
            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingresa el numero:" + i);
                if (num == 0) {
                    num = x.nextInt();
                } else if (num2 == 0) {
                    num2 = x.nextInt();
                } else if (num3 == 0) {
                    num3 = x.nextInt();
                } else if (num4 == 0) {
                    num4 = x.nextInt();
                } else if (num5 == 0) {
                    num5 = x.nextInt();
                }
            }
            if (num > num2 && num > num3 && num > num4 && num > num5) {
                System.out.println(num + " es el mayor");
            } else if (num2 > num && num2 > num3 && num2 > num4 && num2 > num5) {
                System.out.println(num2 + " es el mayor");
            } else if (num3 > num2 && num3 > num && num3 > num4 && num3 > num5) {
                System.out.println(num3 + " es el mayor");
            } else if (num4 > num2 && num4 > num && num4 > num3 && num4 > num5) {
                System.out.println(num4 + " es el mayor");
            } else {
                System.out.println(num5 + " es el mayor");
            }
            num = 0;
            num2 = 0;
            num3 = 0;
            num4 = 0;
            num5 = 0;
            System.out.println("Desea que se repita de nuevo:");
            opc = x.next();
        } while (opc.equalsIgnoreCase("si"));
    }

}
