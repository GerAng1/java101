   /****************************************|
 * | Fundamentos de Programación            |
 * | "Ciclos Anidados Figuras: Cuadrado"    |
 * | Gerardo Anglada - A01021917            |
 * | 12/01/2017                             |
 * |****************************************/
import java.util.*; //para importar la clase Scanner y poder usarlo

public class Cuadrado {

public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);
 int cont1=0, cont2=0;
 int tam=0;

    System.out.print("De cuanto por cuanto quieres el cuadrado? ");
    tam=lectura.nextInt();

 for(cont1=0; cont1<tam; cont1++) {
    for(cont2=0; cont2<tam; cont2++){

    System.out.print(" * ");

    }
    System.out.println();
    }
    }
}
