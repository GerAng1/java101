import java.util.Random;
import java.util.Scanner;

public class SumaMatrizRecur{
    public static void main(String[] args){
        int[][] matriz;
        int rows, columns;
        Scanner lectura = new Scanner(System.in);
        Random numeros = new Random();

        System.out.printf("Suma de Matrices%n%n "
                + "Suma los valores dentro de una matriz, no entre matrices%n"
                + "\'bfCuantas columnas quieres en tu matriz?:  ");
        columns = lectura.nextInt();

        System.out.printf("\'bfY filas?:  ");
        rows = lectura.nextInt();

        matriz = new int[rows][columns];

        for(int cont = 0; cont<rows; cont++)\{
            for(int cont2 = 0; cont2<columns; cont2++)\{
                matriz[cont][cont2] = numeros.nextInt(9)+1;
            }
        }

        System.out.printf("%n Tu matriz%n%n");

        for(int cont3 = 0; cont3<rows; cont3++)\{
            for(int cont4 = 0; cont4<columns; cont4++)\{
                System.out.printf(matriz[cont3][cont4] + "  ");
            }
            System.out.println("");
        }

        System.out.printf("%nLa suma de todos los valores de tu matriz es: %d%n", sumatrices(matriz, rows-1, columns-1));
    }//fin del main

    public static int sumatrices(int[][] m, int r, int c)\{
        if(r==0 && c==0)
            return m[r][c];

        else if(c==0)
            return m[r][c] + sumatrices(m, r-1, m[0].length-1);

        return  m[r][c] + sumatrices(m, r, c-1);
    }//fin sumatrices
}//fin de la clase
