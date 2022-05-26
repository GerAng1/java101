import java.util.Scanner;

public class MenorDeTres {

	public static void main(String[] args){
		double num1, num2, num3, menor;
		Scanner lectura = new Scanner(System.in);

		System.out.println("Dame 3 números con al menos un decimal y te dire cuál es el menor");

    System.out.print("Tu primer numero?: ");
		num1 = lectura.nextDouble();

    System.out.print("¿El segundo?: ");
    num2 = lectura.nextDouble();

    System.out.println("Y el ultimo: ");
		num3 = lectura.nextDouble();

    menor = sacarMinimo(num1,num2,num3);

    System.out.println("El número más pequeño es: " + menor);
	}

  public static double sacarMinimo(double primer, double segundo, double tercer){
    if (primer<segundo && primer<tercer)
      return primer;

		else if (segundo<primer && segundo<tercer)
      return segundo;

		else if (tercer<primer && tercer<segundo)
      return tercer;

		else
		return null;
  }
}
