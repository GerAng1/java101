public class ChicharronEnArgs
{
	public static void main (String[] args)
	{
		double a = Double.parseDouble (args[0]), b=Double.parseDouble (args[1]), c= Double.parseDouble (args[2]);
		System.out.println("Chicharron");
		System.out.printf("Las raices son %.3f y %.3f", ((-b+ Math.sqrt((b*b)-(4*a*c)))/(2*a)), ((-b+ Math.sqrt((b*b)-(4*a*c)))/(2*a)));

	}
}
