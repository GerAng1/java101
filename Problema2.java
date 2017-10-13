import java.util.Scanner;

public class Problema2 {

//Calcular el promedio de calificaciones introducidas por teclado.

    public static void main(String[] args) {
        int numMat, total=0, calif, num=1;
        double prom;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Cuantas calificaciones vas a meter?: ");
        numMat=lectura.nextInt();

        while (num<=numMat){
            System.out.print("Calificacion " + num + ": ");
            calif=lectura.nextInt();
            total+=calif;
            num++;
        }
        prom=total/numMat;
        System.out.printf("El promedio de estas "+numMat+" materias es: %.2f", prom);
    }//fin del main
}//fin de la clase
