/*****************************************
// Tecnol�gico de Monterrey				//
// Campus Santa Fe						//
// Fundamentos de Programaci�n			//
// "Usando print con formato			//
// Dr. Luis Y�pez P�rez					//
// Gerardo Anglada de Landa - A01021917	//
// 28/Ago/2017							//
*****************************************/
import java.util.Scanner;

public class MetodoUno {
	public static void main (String [] args){

		Scanner lector = new Scanner (System.in);
		String nombre = "Gerry";
		int edad= 19;



		System.out.print("Como te llamas?: ");
		nombre=lector.nextLine();
		System.out.print("Cuantos anos tienes? (en numeros porfa): ");
		edad=lector.nextInt();
		imprime(nombre, edad);



	}//fin del main

	public static void imprime(String nom, int num){
		System.out.printf("Hola %s de %d de edad %n", nom, num);
	}//fin del metodo que imprime

}//fin de la clase
