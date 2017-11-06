import java.util.Scanner;

/* Escribir un programa que permita visualizar el triángulo de Pascal hasta un 
renglon dado por el usuario, usando arreglos de arreglos.
*/
public class PascalTriangulo {

public static void main(String args[]) {
/*    int filas;
    int[][] pascal;
    Scanner lectura = new Scanner(System.in);
    
    System.out.printf("Pascal %n Cuantas filas quieres en tu triangulo?: ");
    filas=lectura.nextInt();   

    pascal = new int[filas][filas];
    
    for (int i =0; i<filas; i++){
        for (int j=0; j<filas; j++){
        pascal[i][j] = 0;
        }
    }

    for (int i=0; i<filas; i++){
        pascal[i][0] = 1;
    }

    for (int i = 1; i < filas; i++) {
        for (int j = 1; j < filas; j++) {
            pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        }
    }
    
    for (int i = 0; i < filas; i++) {
        for(int j=0; j<=i; j++) {
            System.out.print(pascal[i][j]+ " ");
        }
    System.out.println();
    }
}
}
                           */ 
    int [][] triangulo;
    int tam;
    Scanner lectura = new Scanner(System.in);
    
    System.out.printf("Pascal %n Cuantas filas quieres en tu triangulo?: ");
    tam=lectura.nextInt();
    
    triangulo = new int[tam][];
    
    for (int cont=0; cont<triangulo.length; cont++) {
        triangulo[cont] = new int[cont+1];
        triangulo[cont][0] = 1;
        triangulo[cont][cont] = 1;
        
        for (int cont2=1; cont2<cont; cont2++) {
            triangulo[cont][cont2] = triangulo[cont-1][cont2]+triangulo[cont-1][cont2-1];
        }
    }

    for (int cont=0; cont<triangulo.length; cont++) {
        for(int cont1=0; cont1<tam; cont1++){
            System.out.print(" ");
        }
        for (int cont2=0; cont2<triangulo[cont].length; cont2++) {   
            System.out.print(" "+triangulo[cont][cont2]);
        }
        tam--;
        System.out.println("");
    }
}
}
                       