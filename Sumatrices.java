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

public class Sumatrices{
	public static void main (String [] args){
		Random numerosAleatorios= new Random();
		int[][] matriz= new int[10][10];
		int suma, mayor;


		for(int renglones = 0; renglones<matriz.length; renglones++){
			for(int columnas = 0; columnas<matriz[0].length; columnas++){
				matriz[renglones][columnas] = numerosAleatorios.nextInt(100)+1;
				System.out.printf(" (%d,%d)= %d \t", renglones, columnas, matriz[renglones][columnas]);
			}
		System.out.println();
		}

		for(int renglones = 0; renglones<matriz.length-1; renglones++){
			for(int columnas = 0; columnas<matriz.length-1; columnas++){
				suma = matriz[renglones][columnas]+matriz[renglones][columnas+1]+matriz[renglones+1][columnas]+matriz[renglones+1][columnas+1])
				System.out.printf("%d \t", suma;
				if(suma>suma
			}
		System.out.println();
		}

		System.out.printf("La sumatriz de 2x2 mayor se encuentra en (%d,%d)
	}
}