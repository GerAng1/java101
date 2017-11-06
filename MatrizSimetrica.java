import java.util.Scanner;
import java.util.Random;

public class MatrizSimetrica {
    
    public static void main(String[] args) {
    int [][] matriz;
    int tam, simetrico=0;
    Scanner lectura = new Scanner (System.in);
    Random rands = new Random ();
    
    System.out.print("De que tamaño quieres tu matriz?: ");
    tam = lectura.nextInt();
        
    matriz = new int [tam][tam];
    
        for(int cont = 0; cont<matriz.length; cont++){
            for(int cont2 = 0; cont2<matriz[0].length; cont2++){
                matriz[cont][cont2] = rands.nextInt(8);
                System.out.printf("%d \t ", matriz[cont][cont2]);    
            }
            System.out.println("");             
        }
        
        simetria(matriz);
    }
    
    public static void simetria(int[][]matriz){
        int simetrica=0;
        
        for(int cont = 0; cont<matriz.length; cont++){
            for(int cont2 = 0; cont2<matriz[0].length; cont2++){
                
            if(matriz[cont][cont2]!=matriz[cont2][cont])
                simetrica=-1;
                break;
            }
        }
    if (simetrica==-1)
            System.out.println("La matriz no es simetrica");
        else
            System.out.println("La matriz es simetrica");  
    }
} 