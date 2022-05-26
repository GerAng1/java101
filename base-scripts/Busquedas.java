import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Metodos de busquedas de elementos en arreglo
 * @author GerAng1
 */
public class Busquedas {

    public int[] arregloAleatorio(int tam){
        int[] arr = new int[tam];
        Random rand = new Random();

        for(int i = 0; i < tam; i++){
            if(i == 0)
              arr[i] = 0;
            else
              arr[i] = rand.nextInt(2000) + 1;
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
                return i + 1;
            else if (arr[i] > num){
                int subarray = (i - (skip - 1));
                for(int j = subarray; j <= i; j++){
                    if(arr[j] == num)
                        return j + 1;
                    else if(j == i)
                        return -1;
                }
            }
        }
        return -1;
    }

    public int binario(int[] arr, int toFind){
        int first = 0, last = arr.length - 1, mid;

        for(int cont = 0; first <= last; cont++){
            mid = first + (last - first) / 2;

            if (arr[mid] == toFind)
                return mid + 1;
            else if (arr[mid] < toFind)
                first = mid + 1;
            else
                last = mid - 1;
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
        Busquedas b = new Busquedas();
        Scanner lectura = new Scanner(System.in);

        long startTime, endTime, dur, dur2, dur3;
        int toFind;
        int[] array = b.arregloAleatorio(1000);

        System.out.print("Que numero deseas buscar? (0 - 2000): ");
        toFind = lectura.nextInt();

        System.out.println("El arreglo: ");
        b.print(array);
        System.out.println("");

        System.out.print("El num " + toFind + " esta en la posicion: ");
        startTime = System.nanoTime();
        System.out.println(b.secuencial(array, toFind) + ".");
        endTime = System.nanoTime();
        dur = (endTime - startTime);
        System.out.println("Con secuencial: " + dur + " nanosegundos.");

        System.out.println("");
        System.out.print("El num " + toFind + " esta en la posicion: ");
        startTime = System.nanoTime();
        System.out.println(b.mejorado(array, toFind) + ".");
        endTime = System.nanoTime();
        dur2 = (endTime - startTime);
        System.out.println("Con mejorado: " + dur2 + " nanosegundos.");
        System.out.println("Mejorado fue " + (dur - dur2) + " nsegs mas rapido.");

        System.out.println("");
        System.out.print("El num " + toFind + " esta en la posicion: ");
        startTime = System.nanoTime();
        System.out.println(b.binario(array, toFind) + ".");
        endTime = System.nanoTime();
        dur3 = (endTime - startTime);
        System.out.println("Con binario: " + dur3 + " nanosegundos.");
        System.out.println("Binario fue " + (dur - dur3) + " nsegs mas rapido.");
    }
}
