package gm1.modularidad;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @author GM1 - Ian Roberto Tejada Reyes */
public class GM1Modularidad {

    public static void main(String[] args) {
        try {
            int opcion;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("---------------------------------");
                System.out.println("1. Suma de vectores");
                System.out.println("2. Dividir vectores");
                System.out.println("3. Resta de vectores");
                System.out.println("4. Remplazar letras por numeros");
                System.out.println("5. Concatenar vectores");
                System.out.println("6. Encuentra el mayor");
                System.out.println("7. Transponer la matriz");
                System.out.println("8. Ocultar mensaje en matriz transpuesta");
                System.out.println("9. Salir");
                System.out.println("--------------------------------");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1 -> {
                        sumaVectores();
                        break;
                    }
                    case 2 -> {
                        dividirVectores();
                        break;
                    }
                    case 3 -> {
                        restaVectores();
                        break;
                    }
                    case 4 -> {
                        remplazarVector();
                        break;
                    }
                    case 5 -> {
                        concatenarvectores();
                        break;
                    }
                    case 6 -> {
                        mayorMatriz();
                        break;
                    }
                    case 7 -> {
                        transponerMatriz();
                        break;
                    }
                    case 8 -> {
                        transponerOcultarMatriz();
                        break;
                    }

                }
            } while (opcion != 9);

        } catch (InputMismatchException ex) {
            System.out.println("Los datos no corresponden con el tipo");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Te has excedido del limite del array");
        } catch (Exception ex) {
            System.out.println("Esto es un error :p");
        }
    }

    public static void sumaVectores() {
        int[] vector1 = {17, 11, 5, 6, 25};
        int[] vector2 = {9, 2, 8, 0, 3};
        int[] vectorSuma = new int[5];
        for (int x = 0; x <= 4; x++) {
            vectorSuma[x] = vector1[x] + vector2[x];
            System.out.print(vectorSuma[x] + " ");
        }
        System.out.println("-----------------------------");
    }

    public static void dividirVectores() {
        float[] vector2 = new float[5];
        float[] vector1 = new float[5];
        float[] divect = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 5 valores para el primer vector");
        for (int x = 0; x <= 4; x++) {

            System.out.print("\tvector1[" + x + "]:");
            vector1[x] = sc.nextFloat();
        }
        System.out.println("Introduce 5 valores para el segundo vector");
        for (int x = 0; x <= 4; x++) {

            System.out.print("\tvector2[" + x + "]:");
            vector2[x] = sc.nextFloat();
        }
        for (int x = 0; x <= 4; x++) {
            divect[x] = vector1[x] / vector2[x];
        }
        for (int x = 0; x <= 4; x++) {
            System.out.print(divect[x] + "  ");
        }
        System.out.println("---------------------------------------");
    }

    public static void restaVectores() {
        float[] vector2 = new float[5];
        float[] vector1 = new float[5];
        float[] restvec = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 5 valores para el primer vector");
        for (int x = 0; x <= 4; x++) {

            System.out.print("\tvector1[" + x + "]:");
            vector1[x] = sc.nextFloat();
        }
        System.out.println("Introduce 5 valores para el segundo vector");
        for (int x = 0; x <= 4; x++) {

            System.out.print("\tvector2[" + x + "]:");
            vector2[x] = sc.nextFloat();
        }
        for (int x = 0; x <= 4; x++) {
            restvec[x] = vector1[x] - vector2[x];
        }
        for (int x = 0; x <= 4; x++) {
            System.out.print(restvec[x] + "  ");
        }
        System.out.println("---------------------------------------");
    }

    public static void concatenarvectores() {
        String[] vector2 = new String[1];
        String[] vector1 = new String[1];
        String[] concat = new String[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera frase a concatenar:");
        vector1[0] = sc.nextLine();
        System.out.println("Introduce la segunda frase a concatenar:");
        vector2[0] = sc.nextLine();
        concat[0] = vector1[0] + vector2[0];
        System.out.println(concat[0]);
    }

    public static void remplazarVector() {
        String[] vector1 = new String[1];
        String[] tt = new String[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase a ocultar");
        vector1[0] = sc.nextLine();
        tt[0] += vector1[0].replace("a", "4");
        tt[0] = tt[0].replace("A", "4");
        tt[0] = tt[0].replace("o", "0");
        tt[0] = tt[0].replace("O", "0");
        tt[0] = tt[0].replace("i", "1");
        tt[0] = tt[0].replace("I", "1");
        tt[0] = tt[0].replace("e", "3");
        tt[0] = tt[0].replace("E", "3");
        tt[0] = tt[0].replace("J", "7");
        tt[0] = tt[0].replace("j", "7");
        System.out.println(tt[0]);
    }

    public static void mayorMatriz() {
        int[][] matriz = new int[4][4];
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los datos para la matriz:");
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                matriz[x][y] = sc.nextInt();
            }
        }
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                int numeroActual = matriz[x][y];
                if (numeroActual > mayor) {
                    mayor = numeroActual;
                }
                if (numeroActual < menor) {
                    menor = numeroActual;
                }
            }
        }
        System.out.printf("El mayor es " + mayor + " y el menor es " + menor);
    }

    public static void transponerMatriz() {
        Scanner sc = new Scanner(System.in);
        String[][] matrizorg = new String[4][7];
        String[][] matriztrans = new String[7][4];
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 6; y++) {
                matrizorg[x][y] = sc.next();
            }
        }
        for (int x = 0; x <= 6; x++) {
            for (int y = 0; y <= 3; y++) {
                matriztrans[x][y] = matrizorg[3 - y][x];
            }
        }
        System.out.println("Original");
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 6; y++) {
                System.out.print(matrizorg[x][y] + "\t");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Transpuesta oculta");
        for (int x = 0; x <= 6; x++) {
            for (int y = 0; y <= 3; y++) {

                System.out.print(matriztrans[x][y] + "\t");
            }
            System.out.println("");
        }
    }

    public static void transponerOcultarMatriz() {
        Scanner sc = new Scanner(System.in);
        String[][] matrizorg = new String[4][7];
        String[][] matriztrans = new String[7][4];
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 6; y++) {
                matrizorg[x][y] = sc.next();
                matrizorg[x][y] = matrizorg[x][y].replace("a", "4");
                matrizorg[x][y] = matrizorg[x][y].replace("A", "4");
                matrizorg[x][y] = matrizorg[x][y].replace("o", "0");
                matrizorg[x][y] = matrizorg[x][y].replace("O", "0");
                matrizorg[x][y] = matrizorg[x][y].replace("i", "1");
                matrizorg[x][y] = matrizorg[x][y].replace("I", "1");
                matrizorg[x][y] = matrizorg[x][y].replace("e", "3");
                matrizorg[x][y] = matrizorg[x][y].replace("E", "3");
                matrizorg[x][y] = matrizorg[x][y].replace("J", "7");
                matrizorg[x][y] = matrizorg[x][y].replace("j", "7");
            }
        }
        for (int x = 0; x <= 6; x++) {
            for (int y = 0; y <= 3; y++) {
                matriztrans[x][y] = matrizorg[3 - y][x];
            }
        }
        System.out.println("Original");
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 6; y++) {
                System.out.print(matrizorg[x][y] + "\t");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Transpuesta oculta");
        for (int x = 0; x <= 6; x++) {
            for (int y = 0; y <= 3; y++) {

                System.out.print(matriztrans[x][y] + "\t");
            }
            System.out.println("");
        }
    }
}
