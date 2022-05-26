/********************************|
* | Fundamentos de Programación  |
* | "Condiciones con For"        |
* | Gerardo Anglada - A01021917  |
* | 2/Oct/2017                   |
* |******************************/

public class For {
  public static void main(String[] args) {

    for(int x=1; x<40;x++){
      System.out.print(x);

    if(x%2==0)
      System.out.print("es par");

    if(x%3==0) //EN VEZ DE "ELSE IF" SOLO Y Y ASI APLICA AMBAS (E.G. 12)
      System.out.print("es divisible entre 3");

    System.out.println();
    }

  }
}
