import java.util.Random;

public class Aleatorios1{
	public static void main (String [] args){
		Random numerosAleatorios = new Random();
		int[] arreglo = new int[10];

		for(int i = 0; i<arreglo.length; i++){
			int numero = numerosAleatorios.nextInt(100)+1;
			arreglo[i] = numero;
		}

		for(int i =0; i<arreglo.length; i++){
		System.out.print("El número es: " + arreglo[i] + ".\n");
		}

	}
}
