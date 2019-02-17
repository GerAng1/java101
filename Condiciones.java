/*****************************************
// Tecnologico de Monterrey							//
// Campus Santa Fe											//
// Fundamentos de Programacion					//
// "Ejemplo de uso de condiciones				//
// Dr. Luis Yepez Perez									//
// Gerardo Anglada de Landa - A01021917	//
// 28/Ago/2017													//
*****************************************/

import java.util.Scanner;

public class Condiciones {
	public static void main (String [] args){

		int temp;
		String salida;
		Scanner lectura = new Scanner(System.in);

		System.out.println("Cual es la temperatura del carro?: ");
		temp=lectura.nextInt();

		if (temp<-10){
			System.out.println(" Niveles de Temperatura muy fria. Recomendable no usar carro.");
			}

		else if(temp>110){
			System.out.println("Niveles de Temperatura muy altas. Revisar aceite.");

		}
		else{
				System.out.println(" Temperatura dentro del rango.");
		}
		lectura.nextLine(); // MUY IMPORTANTE SI NO NO CORRE LO SIGUENTE
		System.out.print("Para Salir, escribe s ");
		salida=lectura.nextLine();

		if (salida.equalsIgnoreCase("s")){
			System.out.print("Adios!");
		}

	}//fin del main
}//fin de la clase
