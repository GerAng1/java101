/*****************************************
// Tecnologico de Monterrey				//
// Campus Santa Fe						//
// Fundamentos de Programacion			//
// "Ejemplo de uso de metodos			//
// Dr. Luis Yepez Perez					//
// Gerardo Anglada de Landa - A01021917	//
// 28/Ago/2017							//
*****************************************/
import java.util.Scanner;

public class Metodos2 {
	public static void main (String [] args){

		Scanner lectura = new Scanner (System.in);
		double valor;

		System.out.print("Que numero quieres al cuadrado?: ");
		valor=lectura.nextDouble();

		double numero1= cuadrado(valor);
		System.out.printf("El cuadrado de %f es %f %n", 4.0, cuadrado(4.0));
		System.out.printf("%.2f %n", numero1);
	}//fin del main

	public static double cuadrado(double num){
		double cuadrado;
		cuadrado = num*num;
		return cuadrado;
	}//fin del metodo

}//fin de la clase
