public class Persona{

	private String nombre, apellido, alias;
	private int edad;
	
	public Persona(){ //constructor que creará valores por default
		nombre = "[INSERT NAME]";
		apellido = "[INSERT LAST NAME]";
		alias = "[INSERT ALIAS]";
		edad = 18;
	}
	
	public Persona(String nombre){
		this.nombre = nombre;
		apellido = "[INSERT LAST NAME]";
		alias = "[INSERT ALIAS]";
		edad = 18;

	//te permite desde el main crear un objeto con ese valor inicial
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	
	}

	public void setApellido(String apellido){
		this.apellido = apellido;
	
	}

	public void setAlias(String alias){
		this.alias = alias;
	
	}

	public void setEdad(int edad){
		this.edad = edad;
	
	}
	
	public void getNombre(){
		return nombre;
	
	}

	public void getApellido(){
		return apellido;
	
	}

	public void getAlias(){
		return alias;
	
	}

	public void getEdad(){
		return edad;
	
	}

	public void printPersona(){
		System.out.printf("Persona: %s. %s %s. %nEdad: %d.", alias, nombre, apellido, edad);
	
	}
}