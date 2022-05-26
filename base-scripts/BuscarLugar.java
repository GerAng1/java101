/*****************************************
// Tecnologico de Monterrey				      //
// Campus Santa Fe						          //
// Fundamentos de Programacion		      //
// "Tarea 6.2 Arreglos"             		//
// Dr. Luis Yepez Perez					        //
// Gerardo Anglada de Landa - A01021917	//
// 09/Oct/2017							            //
*****************************************/
import java.util.Random;
import java.util.Scanner;

//Escribir un programa que busque un elemento en un arreglo.

public class BuscarLugar {
    public static void main(String[] args) {
        Random numeroAleatorios = new Random();
        int numero, buscado=-1;
        int[] arreglo = new int [20];
        Scanner lectura= new Scanner(System.in);

        for (int i=0; i<arreglo.length ;i++ ) {
            arreglo[i] = numeroAleatorios.nextInt(41)-20;
        }
        for (int i=0;i<arreglo.length ;i ++ ) {
            System.out.printf("%d ", arreglo[i]);
        }

        System.out.printf(" %n Dime un valor que buscas: ");
        numero=lectura.nextInt();

        for(int cont=0; cont<arreglo.length; cont++){
            if(numero==arreglo[cont]){
                buscado=cont;
                System.out.println("Se encuentra en el lugar '" +buscado+"' del arreglo");
            }
        }

        if(buscado==-1){
            System.out.println("Ese número no se encuentra en este arreglo");
        }
        
    }
}
