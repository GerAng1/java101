public class EnumTest{
	Day day;

	public EnumTest(Day day){
		this.day = day;
	}

	public void print(){
		switch(day){
			case MONDAY:
				System.out.println("¡Que dia tan feo!");
				break;
			case VIERNES:
				System.out.println("¡Mejoro la semana!");
				break;
			case SATURDAY: CASE SUNDAY:
				System.out.println("¡Gracias Fin de Semana!");
				break;
			default:
				System.out.println("¡Entre semana no cuenta!");
				break;


		}
	}
}