/*****************************************
// Tecnológico de Monterrey				//
// Campus Santa Fe						//
// Fundamentos de Programación			//
// "Condiciones con Switch"				//
// Dr. Luis Yépez Pérez					//
// Gerardo Anglada de Landa - A01021917	//
// 4/Sep/2017							//
*****************************************/
import java.util.Random;

public class Matriz1{
	public static void main (String [] args){
		Random numerosAleatorios= new Random();
		int[][] matriz= new int[10][5];

		matriz[0][0]=7;
		matriz[0][1]=8;
		matriz[1][0]=2;
		matriz[1][1]=4;
		matriz[2][0]=8;
		matriz[2][1]=3;
	
		for(int renglones = 0; renglones<matriz.length; renglones++){
			for(int columnas = 0; columnas<matriz[0].length; columnas++){
				System.out.printf(" (%d,%d)= %d \t", renglones, columnas, matriz[renglones][columnas]);
			}
		System.out.println();
		}
		
		for(int renglones = 0; renglones<matriz.length; renglones++){
			for(int columnas = 0; columnas<matriz[0].length; columnas++){
				matriz[renglones][columnas] = numerosAleatorios.nextInt(100)+1;
				System.out.printf("%d \t", matriz[renglones][columnas]);	
			}
		System.out.println();
		}
		
	}
}