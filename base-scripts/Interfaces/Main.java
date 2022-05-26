import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radio, lado;
        Figura figura;
        Scanner input = new Scanner(System.in);

        System.out.println("CREANDO UN CIRCULO");
        System.out.print("Introduce el rádio: ");
        radio = input.nextDouble();

        figura = new Circulo(radio);
        System.out.println("El área del círculo es: " + figura.area());
        System.out.println("El perímetro del círculo es: " + figura.perimetro());
        System.out.println("El color del círculo es: " + figura.COLOR);

        System.out.println("CREANDO UN CUADRADO");
        System.out.print("Introduce el lado del cuadrado: ");
        lado = input.nextDouble();

        figura = new Cuadrado(lado, lado);
        System.out.println("El área del cuadrado es: " + figura.area());
        System.out.println("El perímetro del cuadrado es: " + figura.perimetro());
        System.out.println("El color del cuadrado es: " + figura.COLOR);
    }
}
