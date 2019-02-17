   /********************************|
 * | Fundamentos de Programación    |
 * | "Ciclos dentro de Ciclos"      |
 * | Gerardo Anglada - A01021917    |
 * | Mm/dd/2017                     |
 * |********************************/
import java.util.*; //esto es porque uno lee desde el teclado

public class CiclosAnidados {
//declarar todo

      public static void main(String[] args) {

        int pez=0,numComida=0; //los contadores para el for
        int numPeces=0; //declarar cuantos peces habrá
        Scanner lectura= new Scanner(System.in);
        double promPez=0.0; //donde se guarda el promedio
        double totalGramosComida=0; //total de gramos que se consumieros
        int gramosComidaPez=0; //cuantos gramos come un pez
        double loquetenemos=0.0; //suma de lo que llevamos de gramos
        int comidasAlDia=0;
        //terminamos de declarar y hay que saber cuantos peces hay

        System.out.print("Cuantas veces al dia alimentas a tus peces? ");
        comidasAlDia=lectura.nextInt();

        System.out.print("Cuantos peces hay en la pecera?");
        numPeces=lectura.nextInt();

//empezamos los ciclos
        for(pez=0; pez<numPeces; pez++){
            for(numComida=0;numComida<comidasAlDia;numComida++){
                System.out.println("Cuantos gramos comio el pez " + (pez+1) +
                         " en la comida " +(numComida+1)+" ?"); //el mas uno solo es para que no salga "pez 0"
                gramosComidaPez=lectura.nextInt();//lee y guarda el valor en la variable "gramosComidaPez"
                loquetenemos= loquetenemos+gramosComidaPez;
            }
            promPez=loquetenemos/comidasAlDia;
            System.out.println("Este pez en promedio comio " +promPez+ " gramos al dia");
            totalGramosComida=loquetenemos; //aqui se acumula lo que va cominedo cada pez
            loquetenemos=0;
        }
        //para imprimir el valor final de cunto se comieros los peces en la pecera
        System.out.println("Se consumieron en total " +totalGramosComida+ "gramos de comida");
    }//cierre del main

}//cierre de la clase
