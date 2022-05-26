import java.util.Scanner;

/*
Calcular el promedio de calificaciones introducidas por teclado con un diálogo
semejante al siguiente (se debe pedir el número de calificaciones a ingresar):
   ¿Cuántas calificaciones? 8
      Calificación 1: 90
      Calificación 2: 75
      ...
      Calificación 8: 87
     El promedio de estas 8 calificaciones es: 87.4
*/

public class PromCalif {
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
        System.out.printf("El promedio de estas %d materias es: %.2f",numMat, prom);
    }//fin del main
}//fin de la clase
