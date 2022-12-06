package gm1.areacirculo;
import java.util.Scanner;
/**
 *
 * @author Damian Gonzalez Rivera
 */
public class GM1AreaCirculo {

    public static void main(String[] args) {
      //Declaracion de variables
      double varRadio;
      double varArea;
      //Declaracion de Scanner
      Scanner op=new Scanner(System.in);
      //Capturar los datos
      System.out.println("¿Cual es el valor del radio?");
      varRadio=op.nextDouble();
      //Procedimiento
      varArea=varRadio*varRadio*Math.PI;
      //Mostrar resultado
      System.out.println("El area del cirulo es "+varArea);       
    }
    
}
