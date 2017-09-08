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

public class While1{
	public static void main(String[] args){
		Scanner lectura = new Scanner(System.in);
		int contador, numero=1000;

		System.out.print("Cuenta Regresiva \n Dame un valor menor a 1000: ");
		contador = lectura.nextInt();

		while(numero>contador){
			System.out.println("Contador: " + numero);
			numero --;
		}
	}
}