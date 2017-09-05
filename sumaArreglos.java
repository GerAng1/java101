   /********************************|
 * | Fundamentos de Programación    |
 * | "Suma de Arreglos"             |
 * | Gerardo Anglada - A01021917    |
 * | Mm/dd/2017                     |
 * |******************************* */
package codigosbase;

import java.util.*; //para importar la clase Scanner y poder usarlo

public class sumaArreglos {
    static int cont=0, tam=0;
    static int arregloA[], arregloB[], arregloC[];
    static Scanner lectura = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        //Instrucciones para pedir el tamaño
    
        System.out.print("Dame el tamaño del arreglo: ");
        tam=lectura.nextInt();
        
        //instrucciones para crear los arreglos
        arregloA= new int[tam];
        arregloB= new int[tam];
        arregloC= new int[tam];
        //se tiene que llamar a captura
        captura();
         //se puede poner al final, pero asi entiendes el orden de como ocurre
        suma();
       imprime();
    }//cierre del método main
    
    public static void captura(){
        for(cont=0; cont<tam; cont++){
            System.out.println("Pon el numero de la posición " + (cont+1) + ": ");
            arregloA[cont]=lectura.nextInt();
            
            System.out.println("Pon el numero de la posición " + (cont+1) + " para sumarlo: ");
            arregloB[cont]=lectura.nextInt();
        }//cierre del ciclo for
    
    }//cierre del metodo que captura los datos del arreglo
    
    public static void suma(){
    //vamos a sumar los arreglos con un for
    for(cont=0;cont<tam;cont++){
        arregloC[cont]=arregloA[cont]+arregloB[cont];
    }//cierre del ciclo for
    
    }//cierre del método que suma los datos del arreglo
    
    public static void imprime(){
    
    //método para imprimir todo el arreglo
   
   for(cont=0; cont<arregloA.length;cont++){
   System.out.println(arregloA[cont]+" + "+arregloB[cont]+ " = " + arregloC[cont]);} //cierre del ciclo for
    
    }// cierre del método que imprime los datos del trabajo
    }
