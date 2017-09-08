/*****************************************
// Tecnológico de Monterrey				//
// Campus Santa Fe						//
// Fundamentos de Programación			//
// "Condiciones con Switch"				//
// Dr. Luis Yépez Pérez					//
// Gerardo Anglada de Landa - A01021917	//
// 4/Sep/2017							//
*****************************************/

import java.util.Scanner;

public class Condiciones3{
	public static void main (String[] args){
		Scanner lectura = new Scanner (System.in);
		String zip;
		char codigo;

		System.out.print("Dame tu codigo Postal y te dire de donde eres: ");
		zip= lectura.nextLine();
		codigo=zip.charAt(0);


		switch(codigo){
			case '0':
			case '2':
			case '3':
				System.out.println("Este");
				break;
			case '4': case '5': case '6':
				System.out.println("Centro");
				break;
			case '7':
				System.out.println("Sur");
				break;
			case '8': case '9':
				System.out.println("Centro");
				break;

			default:
				System.out.println("Esa opcion no existe");
		}
	}
}