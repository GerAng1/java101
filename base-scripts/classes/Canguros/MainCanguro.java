import java.util.Scanner;

public class MainCanguro {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Canguro k1 = new Canguro("K1");
        Canguro k2 = new Canguro("K2");

        System.out.println("Determina si K1 y K2 caen en el mismo numero "
                + "espacio despues del mismo numeor de saltos.\n");

        System.out.println("En que pos. x empieza K1?: ");
        k1.setInicio(lectura.nextInt());

        System.out.println("A que velocidad va K1?: ");
        k1.setVel(lectura.nextInt());

        System.out.println("En que pos. x empieza K2?: ");
        k2.setInicio(lectura.nextInt());

        System.out.println("A que velocidad va K2?: ");
        k2.setVel(lectura.nextInt());

        System.out.printf("K1 inicio: %d, Vel.: %d espacios por salto.%n"
                + "K2 inicio: %d, Vel.: %d espacios por salto.",
                k1.getInicio(), k1.getVel(), k2.getInicio(), k2.getVel());

        k1.comparar(k2);

    }

}
