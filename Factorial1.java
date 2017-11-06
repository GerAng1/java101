/*****************************************
// Tecnologico de Monterrey		//
// Campus Santa Fe			//
// Fundamentos de Programacion		//
// "Problema2 Con For”			//
// Dr. Luis Yepez Perez			//
// Gerardo Anglada de Landa - A01021917	//
// 3/Oct/2017				//
*****************************************/
import java.util.Scanner;

public class Factorial1 {
/*
Calcular el factorial de un número leido desde el teclado.
*/
    public static void main(String[] args) {
        int cont=1,fin,total=1;
        Scanner lectura = new Scanner(System.in);
       
        System.out.println("De que número quieres su factorial? ");
        fin=lectura.nextInt();
        
        do{
            total*=cont;
            cont++;
        } while(cont<=fin);
        System.out.println("El factorial de " + fin + " es: "+ total);
    }
    
}//fin de la clase
