import java.util.Scanner;

public class Chicharron {

    public static void main(String [] args) {
        Scanner lectura = new Scanner(System.in);
        double a, b, c;

        System.out.println("Escriba los valores a calcular ");

        System.out.println("a: ");
        a = lectura.nextDouble();

        System.out.println("b: ");
        b = lectura.nextDouble();

        System.out.println("c: ");
        c = lectura.nextDouble();

        chicharronera(a, b, c);
    }

    public static void chicharronera(double a, double b, double c) {
        double mas, menos;

        mas = (-b+(Math.sqrt((b*b)-(4*a*c)))/(2*a));
        menos = (-b-(Math.sqrt((b*b)-(4*a*c)))/(2*a));
        System.out.printf("Las raices son %.3f y %.3f.", mas, menos);
    }
}
