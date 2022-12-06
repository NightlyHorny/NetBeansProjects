package gm1.operadores.pkg2;

/**
 *
 * @author GM1 - Ian Roberto Tejada Reyes
 */
public class GM1Operadores2 {
    public static void main(String[] args) {
        String nombre = "";
        int var1 = 10;
        int var2 = 25;
        float var3 = 2.5f;
        float var4 = 6.3f;
        boolean var5 = true;
        boolean var6 = false;
        
        //Operadores logicos
        System.out.println("Uso de mayor que "+(var1>var2));
        System.out.println("Uso de menor que "+(var1<var2));
        System.out.println("Uso de mayor o igual que "+(var1>=var2));
        System.out.println("Uso de menor o igual que "+(var1<=var2));
        System.out.println("Uso de no igual "+(var1!=var2));
        
        //Incremento y Decremento
        System.out.println("Valor original "+var1);
        var1++;
        System.out.println("Inremento "+var1);
        
        System.out.println("Valor original "+var2);
        var2--;
        System.out.println("Decremento  "+var2);
        
        //Asignacion
        System.out.println("Valor original "+var3);
        var3 += 2.5f;
        System.out.println("Asignacion e incremento "+var3);
        
        System.out.println("Valor original "+var4);
        var4 -= 1.5f;
        System.out.println("Asignacion y decremento "+var4);
        
        System.out.println("Valor original "+var1);
        var1 *= 12;
        System.out.println("Asignacion y multiplicacion "+var1);
        
        System.out.println("Valor original "+var2);
        var2 *= 6;
        System.out.println("Asignacion y division "+var2);
        
        System.out.println("Valor original "+var1);
        var1 += var2;
        var1 %= 7;
        System.out.println("Asignacion y residuo "+var1);
        }
    
}
