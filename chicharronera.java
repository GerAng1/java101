/** ********************************************|
 * | Fundamentos de Programación                |
 * | "Chicharronera con impresion con formato"  |
 * | Gerardo Anglada - A01021917                |
 * | 2/Sep/2017                                 |
 * |********************************************/
import java.util.Scanner;

public class chicharronera {


public static void main (String [] args){

    Scanner lectura= new Scanner (System.in);
    double a, b, c;
    double raiz1=0.0, raiz2=0.0;
    double conSuma, conResta, div1, div2;

    System.out.print("Dame el valor para a: ");
    a=lectura.nextDouble();
    System.out.print("Dame el valor para b: ");
    b=lectura.nextDouble();
    System.out.print("Y dame el valor para c: ");
    c=lectura.nextDouble();

    conSuma=mas(a,b,c);
    div1=dividir(conSuma, a);
    raiz1=div1;

    conResta=menos(a,b,c);
    div2=dividir(conResta, a);
    raiz2=div2;

    imprimir(raiz1, raiz2);

}//fin del main



public static double mas(double a, double b, double c){

        double mas=(-b+(Math.sqrt((b*b)-(4*a*c))));
        return mas;
}

public static double menos(double a, double b, double c){

        double menos=(-b-(Math.sqrt((b*b)-(4*a*c))));
        return menos;
}


public static double dividir(double num, double a){

        double div= num/(2*a);
        return div;
}

public static void imprimir(double raiz1, double raiz2){

        System.out.printf("Las raices son %.2f y %.2f", raiz1, raiz2);
}
}
