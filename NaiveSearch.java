import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Metodos de busquedas de elementos en arreglo
 * @author GerAng1
 */
public class NaiveSearch {

    public int[] arregloAleatorio(int tam){
        int[] arr = new int[tam];
        Random rand = new Random();

        for(int i = 0; i < tam; i++){
            if(i == 0)
              arr[i] = 0;
            else
              arr[i] = rand.nextInt(100) + 1;
        }
        Arrays.sort(arr);
        return arr;
    }

    public int secuencial(int[] arr, int num){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == num)
                return (i + 1);
        }
        return -1;
    }

    public int mejorado(int[] arr, int num){
        int size = (arr.length - 1);
        int skip = 1;
        int cont = 2;

        while(skip == 1){
            if((size % cont) == 0)
                skip = ((size % (cont * cont)) == 0) ? (cont * cont) : cont;
            cont ++;
        }

        for(int i = 0; i < arr.length; i += skip){
            if(arr[i] == num)
                return i;
            else if (arr[i] > num){
                int subarray = (i - (skip - 1));
                for(int j = subarray; j <= i; j++){
                    if(arr[j] == num)
                        return j;
                    else if(j == i)
                        return -1;
                }
            }
        }
        return -1;
    }

    public void print(int[] a){
        for(int i = 0; i < a.length; i++){
            if(i == 0)
                System.out.print("[" + a[i] + ", ");
            else if(i == (a.length - 1))
                System.out.println(a[i] + "]");
            else
                System.out.print(a[i] + ", ");
        }
    }

    public static void main(String[] args) {
        NaiveSearch n = new NaiveSearch();
        Scanner lectura = new Scanner(System.in);

        long startTime, endTime, duration, duration2;
        int toFind;
        int[] array = n.arregloAleatorio(50);

        System.out.print("Que numero deseas buscar? (0 - 100): ");
        toFind = lectura.nextInt();

        System.out.println("El arreglo: ");
        n.print(array);
        System.out.println("");

        startTime = System.nanoTime();
        System.out.print("El num " + toFind + " esta en la posicion: ");
        System.out.println(n.secuencial(array, toFind) + ".");
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Con secuencial: " + duration + " nanosegundos.");

        startTime = System.nanoTime();
        System.out.print("El num " + toFind + " esta en la posicion: ");
        System.out.println(n.mejorado(array, toFind) + ".");
        endTime = System.nanoTime();
        duration2 = (endTime - startTime);
        System.out.println("Con mejorado: " + duration2 + " nanosegundos.");

        System.out.println("Mejorado fue " + (duration - duration2) + " nsegundos mas rapido.");

    }
}
