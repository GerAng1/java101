   /********************************|
 * | Fundamentos de Programación    |
 * | "Arreglo de dos Dimensiones"   |
 * | Gerardo Anglada - A01021917    |
 * | 24/01/2017                    |
 * |********************************/
 import java.util.*;

public class ArregloDosDomensiones {
    static Scanner lectura = new Scanner(System.in);
    //para el arreglo de dos dimensiones
    static int meses=12;
    static final int IMPORTAVENDE=2;
    //variables
    static int importe=0, mesImporte=0, venta=0, mesVenta=0;
    //arreglo
    static int [][] tabla= new int [meses][IMPORTAVENDE];

    public static void main(String[] args) {
        capturar();
        //mesMasBajo();
        //mesMasAlto();
        imprimir();
    }//final del main
    public static void capturar(){
        int cont1=0, cont2=0;

        for(cont1=0; cont1<meses; cont1++){
            for (cont2=0; cont2<IMPORTAVENDE; cont2++){
                tabla[cont1][cont2]= cont1 + "," + cont2;
            }
        }

    }//final del metodo capturar
    public static void imprimir(){
        System.out.print();
    }//final del metodo imprimir
}//final de la clase
