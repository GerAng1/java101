   /****************************************|
 * | Fundamentos de Programación            |
 * | "Ciclos Anidados Figuras: Triángulo"   |
 * | Gerardo Anglada - A01021917            |
 * | 12/01/2017                             |
 * |****************************************/

import java.util.Scanner;

public class Triangulo {
public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);
 int cont1=0, cont2=0;
 int tam=0;

    System.out.print("De cuántos pisos quieres el Triángulo? ");
    tam=lectura.nextInt();

 for(cont1=0; cont1<tam; cont1++) {
    for(cont2=0; cont2<=cont1; cont2++){

    System.out.print(" + ");

    }//termina for de altura
    System.out.println();//asi se saltan renglones
    }//termina for ancho

  } //cierra metodo main
}//cierra clase
