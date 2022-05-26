import java.util.Scanner;

public class TrianguloFacil {
    public static void main(String args[]){
        int filas, cont, cont2, primero=1, cont3;
        Scanner lectura = new Scanner(System.in);
	
        System.out.printf("Pascal%n Cuantas filas quieres?: ");
        filas = lectura.nextInt();
		
        for(cont=0;cont<filas;cont++){
            for(cont2=filas; cont2>cont; cont2--){
                System.out.print(" ");
            }
            primero = 1;
            
            for(cont3=0;cont3<=cont;cont3++){
                System.out.print(primero+ " ");
                 primero *= (cont - cont3) / (cont3 + 1);
            }
            System.out.println();
        }
    }
}