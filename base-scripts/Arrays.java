import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    static int[] fila = new int[3];

    public static void main(String[] args) {
        push(2);
        print();
        push(3);
        print();
        push(4);
        print();
        push(10);
        print();
        pop();
        print();
        pop();
        print();
        pop();
        print();
    }//fin del main

    public static void push(int a) {
        int i = fila.length - 1;

        while ((i - 1) >- 1) {
            fila[i] = fila[i-1];
            i -= 1;
        }

        fila[0] = a;
    }

    public static void pop() {
        int popped = fila.length - 1;

        for(int cont = fila.length - 1; cont >- 1; cont--) {

            if(fila[cont] != 0){
                fila[cont] = 0;
                break;
            }
        }
    }

    public static void print(){
      System.out.println(Arrays.toString(fila));
    }
}
