/*****************************************
// Tecnol�gico de Monterrey				//
// Campus Santa Fe						//
// Fundamentos de Programaci�n			//
// "Condiciones con Switch"				//
// Dr. Luis Y�pez P�rez					//
// Gerardo Anglada de Landa - A01021917	//
// 4/Sep/2017							//
*****************************************/

import java.util.Scanner;

public class Condiciones2{
	public static void main (String[] args){
		Scanner lectura = new Scanner (System.in);
		int opcion;

		System.out.print("Elige un numero y te dire si es primo (1-10): ");
		opcion= lectura.nextInt();

		switch(opcion){
			case 2:
			case 3:
			case 5:
			case 7:
				System.out.println("Si es primo");
				break;
			case 0: case 1: case 4: case 6: case 8: case 9: case 10:
				System.out.println("No es primo");
				break;
			default:
				System.out.println("Esa opcion no existe");
		}
	}
}
