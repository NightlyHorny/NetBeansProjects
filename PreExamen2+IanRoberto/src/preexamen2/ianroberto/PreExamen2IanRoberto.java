package preexamen2.ianroberto;

import java.util.Scanner;

/*
 * @author Ian Roberto Tejada Reyes
 */
public class PreExamen2IanRoberto {

    public static void main(String[] args) {
        String opc;
        Scanner x = new Scanner(System.in);
        do {
            int First = 3, Second = 7, total = 0;
            for (int i = 11; i < 31; i++) {
                if (i % 7 == 0 || i % 3 == 0) {
                    System.out.println(i);
                    total += i;
                }
            }
            for (int i = 37; i <= 49; i++) {
                if (i % 7 == 0 || i % 3 == 0) {
                    System.out.println(i);
                    total += i;
                }
            }
            System.out.println(total);
            System.out.println("Desea que se repita de nuevo:");
            opc = x.next();
        } while (opc.equalsIgnoreCase("si"));
    }

}
