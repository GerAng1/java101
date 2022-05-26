public class MainCliente{
	public static void main(String[] args){
		Persona cliente1 = new Persona();
		Persona cliente2 = new Persona("Jesus");
		
		cliente1.setNombre("Gerardo");
		cliente1.setApellido("Anglada");
		cliente1.setEdad("19");
		cliente1.setAlias("Gerry");

		cliente2.printPersona();
		cliente1.printPersona();
		
		cliente1.setApellido("Anglada");
		cliente2.setEdad("54");
		cliente2.setAlias("Sr");
	}
}