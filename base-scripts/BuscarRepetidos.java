/*****************************************
// Tecnologico de Monterrey				      //
// Campus Santa Fe						          //
// Fundamentos de Programacion		      //
// "Tarea 6.3 Arreglos"             		//
// Dr. Luis Yepez Perez					        //
// Gerardo Anglada de Landa - A01021917	//
// 09/Oct/2017							            //
*****************************************/
import java.util.Random;

public class BuscarRepetidos {

//Escribir un programa que encuentre los elementos repetidos en un arreglo.

    public static void main(String[] args) {
        Random numeroAleatorios = new Random();
        int[] arreglo = new int [20];
        int repetido=-1;

        for (int i=0; i<arreglo.length ;i++ ) {
            arreglo[i] = numeroAleatorios.nextInt(41)-20;
        }
        for (int i=0;i<arreglo.length ;i ++ ) {
            System.out.printf("%d ", arreglo[i]);
        }

        System.out.println("");

        for(int cont=0; cont<arreglo.length; cont++){
            for(int cont2=0;cont2<arreglo.length;cont2++){
                if(arreglo[cont]==arreglo[cont2] && cont != cont2){
                System.out.println("El '" +arreglo[cont]+"' se repite");
                }
            }
        }

    }
}
