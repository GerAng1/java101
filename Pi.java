import java.util.Scanner;

public class Pi {
/*
La constante matemática pi (π) puede ser aproximada,
escriba un programa efectúe este cálculo con un número 
de términos especificado por el usuario. 
*/
    public static void main(String[] args) {
      int cont,x=0;
      double pi=0, den=1;
      Scanner lectura= new Scanner(System.in);
      
      System.out.println("La formula es: "
              + "1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15 + 1/17 ... = pi/4 ");
        System.out.print("Cuantos terminos quieres en la formula? "
                + "(entre más, más preciso): ");
        cont=lectura.nextInt();
      do {
 
         if (x%2==0) {
            pi+=(1/den);
         } 
         else {
            pi-=(1/den);
         }
         den+=2;
         x++;
      } while (x<cont);
      pi*=4;
      System.out.println(pi);
   }
}
