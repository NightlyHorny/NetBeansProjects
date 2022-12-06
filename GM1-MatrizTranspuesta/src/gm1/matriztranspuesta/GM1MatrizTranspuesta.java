package gm1.matriztranspuesta;
/* @author GM1-Ian Roberto Tejada Reyes*/
public class GM1MatrizTranspuesta {
    public static void main(String[] args) {
        //Definicion de matrices
        char [][] original=new char[4][7];
        char [][] copia=new char[7][4];
        
        //Asignar valores, hay dos opciones
        //1.- Manual
            original[0][0]='T';
            original[0][1]='e';
            original[0][2]='c';
            original[0][3]='n';
            original[0][4]='o';
            original[0][5]='l';
            original[0][6]='o';
            original[1][0]='g';
            original[1][1]='i';
            original[1][2]='c';
            original[1][3]='o';
            original[1][4]=' ';
            original[1][5]='P';
            original[1][6]='i';   
            original[2][0]='e';
            original[2][1]='d';
            original[2][2]='r';
            original[2][3]='a';
            original[2][4]='s';
            original[2][5]=' ';
            original[2][6]='N';
            original[3][0]='e';
            original[3][1]='g';
            original[3][2]='r';
            original[3][3]='a';
            original[3][4]='s';
            original[3][5]='.';
            original[3][6]=' ';
        //2.- Por captura -Tarea
        //Mostrar el contenido de la matriz original
        for(int x=0;x<=3;x++)
        {
            for(int y=0;y<=6;y++)
            {
                System.out.print(original[x][y]+"\t");
            }
            System.out.println("");
        }
        
        //Trasponer la  original hacia la copia
        for(int x=0;x<=6;x++)
        {
            for(int y=0;y<=3;y++)
            {
                copia[x][y]=original[3-y][x];
            }
        }
        System.out.println("----------------------------------------------");
        
        //mostrar la copia
         for(int x=0;x<=6;x++){
            for(int y=0;y<=3;y++){
                System.out.print(copia[x][y]+"\t");
            }
            System.out.println("");
        }
    }
    
}
