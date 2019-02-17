/********************************|
* | Fundamentos de Programación  |
* | "Condiciones con Arreglos"   |
* | Gerardo Anglada - A01021917  |
* | 2/Oct/2017                   |
* |******************************/
import java.util.*;

public class Arreglo1 {
  public static void main(String[] args) {
      Scanner lectura = new Scanner(System.in);
      double [] arreglo2 = new double[10];
      double suma=0;

      System.out.printf("Dame las calificaciones de los 10 alumnos (0-100): %n");

      for(int x=0; x<arreglo2.length; x++){
        arreglo2[x]=lectura.nextDouble();
      }

      for (int i=0; i<arreglo2.length; i++){
        suma+= arreglo2[i];
      }

      System.out.printf("El promedio de tu salon es de .2%f", suma/(arreglo2.length));

  }
}
