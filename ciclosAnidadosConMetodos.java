   /****************************************|
 * | Fundamentos de Programación            |
 * | "Ciclos dentro de Ciclos con métodos"  |
 * | Gerardo Anglada - A01021917            |
 * | Mm/dd/2017                             |
 * |****************************************/
import java.util.*; //esto es porque uno lee desde el teclado

public class CiclosAnidadosConMetodos {
  //declaro variables globales
	static int NUMCOMIDAS=0, TOTALFINAL=0;
	static int NUMPECES=0;
	static Scanner lectura= new Scanner(System.in);

public static void main (String[] args){
        capturaGlobal();
        captura();
        imprime();
}//cierre del main

public static void capturaGlobal(){
    System.out.print("Cuantas veces le das de comer a los peces?: ");
    NUMCOMIDAS=lectura.nextInt();//lee y guarda el valor en la variable "gramosComidaPez"

    System.out.print("Cuántos peces tienes en la pecera?: ");
    NUMPECES=lectura.nextInt();

}//final del metodo

public static void captura(){
	int pez=0, comidaDelDia=0, comidaTotal=0, gramosComida=0;
	double promPez=0;

	for(pez=0; pez<NUMPECES; pez++){
		for(comidaDelDia=0; comidaDelDia<NUMCOMIDAS; comidaDelDia++){
            		System.out.println("Cuántos gramos de comida comió el pez " + (pez+1)+ " en la comida " + (comidaDelDia+1)+ "?: " );
            		gramosComida=lectura.nextInt();
            		comidaTotal=comidaTotal+gramosComida;
         	}//cierre for
      	promPez= comidaTotal/NUMCOMIDAS;
      	System.out.println("Este pez consumió en promedio " + promPez + " gramos.");
      	TOTALFINAL=comidaTotal;
      	comidaTotal=0;
   	 }//cierre for
}//final del metodo

public static void imprime(){
       System.out.println("Se consumieron en total "+TOTALFINAL + " gramos de comida.");
}//final del metodo

}//final de la clase
