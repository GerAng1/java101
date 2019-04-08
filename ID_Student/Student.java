public class Student{
	private String name;
	private int id;
	private int units;

	public Student(){
		this("[INSERT NAME]", 0, 0);
	}

	public Student(String name){
		this(name, 0, 0);
	}

	public Student(String name, int id){
		this(name, id, 0);
	}

	public Student(String name, int id, int units){
		this.name = name;
		this.id = id;
		this.units = units;
	}

	public void getName(){
		return name;
	}

	public void getID(){
		return id;
	}


	public void getUnits(){
		return units;
	}


}