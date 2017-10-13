import java.util.Random;

public class Aleatorios1{
	public static void main (String [] args){
		Random numerosAleatorios= new Random();
		int[] arreglo= new int[100];
		int numero=numerosAleatorios.nextInt(100)+1;
		
		for(int i =0; i<arreglo.length; i++){
			arreglo[i]=arreglo.nextInt;
		}
		
		for(int i =0; i<arreglo.length; i++){
		System.out.print("El numero es: " + arreglo[i]);
		}
	}
}
