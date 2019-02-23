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

    public int mejorado2(int[] arr, int num){
        String factString = "";
        for(int i = 2; i < arr.length; i++){
            if(arr.length % i == 0){
                factString += Integer.toString(i) ;
                factString+= ",";
            }
        }

        String[] factarr = factString.split(",");

        String number = factarr[factarr.length / 2];
        int factor = Integer.parseInt(number);

        for(int i = 0; i < arr.length; i += factor){
            if(arr[i] == num)
                return i;
            else if (arr[i] > num){
                for(int j = (i - (factor - 1)); j <= i; j++){
                    if(arr[j] == num)
                        return j;
                    else if(j == i)
                        return -1;
                }
            }
        }
        return -1;
    }

    /*public int factor(int size){
        String factString = "";
        for(int i = 2; i < size; i++){
            if(size % i == 0){
                factString += Integer.toString(i) ;
                factString+= ",";
            }
        }

        String[] factarr = factString.split(",");

        String number = factarr[factarr.length / 2];
        int mid = Integer.parseInt(number);
        return mid;
    }*/

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

    public int binario(int[] arr, int toFind){
        int first = 0, last = arr.length - 1, mid;
        int cont = 0;

        while (first <= last) {
            mid = first + (last - first) / 2;

            if (arr[mid] == toFind)
                return mid;
            else if (arr[mid] < toFind)
                first = mid + 1;
            else
                last = mid - 1;
            cont += 1;
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

        long startTime, endTime, dur, dur2, dur3, dur4;
        int toFind;
        int[] array = b.arregloAleatorio(1000);

        System.out.print("Que numero deseas buscar? (0 - 1000): ");
        toFind = lectura.nextInt();

        System.out.println("El arreglo: ");
        b.print(array);
        System.out.println("");

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
        System.out.println("Mejorado fue " + (dur - dur2) + " nsegundos mas rapido.");


        System.out.println("");
        System.out.print("El num " + toFind + " esta en la posicion: ");
        startTime = System.nanoTime();
        System.out.println(b.mejorado2(array, toFind) + ".");
        endTime = System.nanoTime();
        dur3 = (endTime - startTime);
        System.out.println("Con mejorado2: " + dur3 + " nanosegundos.");
        System.out.println("Mejorado2 fue " + (dur - dur3) + " nsegundos mas rapido.");


        System.out.println("");
        System.out.print("El num " + toFind + " esta en la posicion: ");
        startTime = System.nanoTime();
        System.out.println(b.binario(array, toFind) + ".");
        endTime = System.nanoTime();
        dur4 = (endTime - startTime);
        System.out.println("Con binario: " + dur4 + " nanosegundos.");
        System.out.println("Binario fue " + (dur - dur4) + " nsegundos mas rapido.");

    }
}
