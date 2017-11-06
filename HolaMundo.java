public class HolaMundo
{
	public static void main (String[] args)
	{
		double num0 = Double.parseDouble (args[0]), num1=Double.parseDouble (args[1]), num2= Double.parseDouble (args[2]);
		System.out.println("Chicharrón");
		System.out.println("Las raíces son " + ((-num1+ Math.sqrt((num2*num2)-(4*num0*num2)))/(2*num0)) ) ;


	}
}