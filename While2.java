/*****************************************
// Tecnológico de Monterrey				//
// Campus Santa Fe						//
// Fundamentos de Programación			//
// "Condiciones con While"				//
// Dr. Luis Yépez Pérez					//
// Gerardo Anglada de Landa - A01021917	//
// 9/Sep/2017							//
*****************************************/
import java.util.Scanner;

public class While2{
	public static void main(String[] args){
		Scanner lectura = new Scanner(System.in);
		int termina;

		System.out.print("Sumatoria \n Hasta que unmero quieres sumar?: ");
		termina = lectura.nextInt();

		System.out.printf("La sumatoria es de %d.", sumatoria(termina));
		System.out.printf("El factorial es de %d.", factorial(termina));


	}
	public static int sumatoria(int num){
		int cont=0, suma=0;

		while(cont<=num){
			suma=suma+cont;
			cont++;
		}
	return suma;
	}

	public static int factorial(int num){
			int cont=1, fact=1;

			while(cont<=num){
				fact*=cont;
				cont++;
			}
	return fact;
	}
}