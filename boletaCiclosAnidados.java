   /***********************************|
 * | Fundamentos de Programación       |
 * | "Ciclos anidados en una boleta"   |
 * | Gerardo Anglada - A01021917       |
 * | 24/01/2017                        |
 * |***********************************/
import java.util.*;

public class boletaCiclosAnidados {

//seccion para declarar variables globales
 static final int MAT=3;
 static final int PAR=2;

 static String[] materia = new String[MAT]; //arreglo nombre de las materias
 static int[][] boleta = new int [MAT][PAR];

 static Scanner lectura = new Scanner(System.in);

 static String respuesta="";
 static int posicion=-1;

 public static void main(String[] args){
   capturaMaterias();
    capturaCalf();
    imprimeBoleta();
    modificaBol();
    imprimeBoleta();
    }//cierre del main



public static void imprimeBoleta(){
    //este metodo hace la impresion de la boleta
    //usando tanto el arreglo de los nombres
    int cont1=0, cont2=0;

    for(cont1=0; cont1<MAT; cont1++){
        System.out.print(materia[cont1] + " \t");
        for(cont2=0; cont2<PAR; cont2++) {
            System.out.print(boleta[cont1][cont2] + " ");
        }//este controla la cantidad de parciales que imprimir
        System.out.println();

    }//cierre del for que controla cuantas materias

}//cierre del imprimeBoleta

public static void capturaMaterias(){
    int cont=0;
            for(cont=0;cont<MAT;cont++){
                System.out.print("Nombre de la Materia "+(cont+1)+ ": ");
                materia[cont]=lectura.nextLine();
            }//cierre del for
}//cierre del metodo de captura

public static void capturaCalf(){
    int cont1=0, cont2=0;
    for(cont1=0; cont1<MAT; cont1++){
        for (cont2=0; cont2<PAR; cont2++){
            System.out.print(materia[cont1]+" Parcial " + (cont2+1) + " ");
            boleta[cont1][cont2]=lectura.nextInt();
        }//cierre del for
    }//ciclo que controla las materias
}//captura las calificaciones del alumno

public static void modificaBol() {
//declarar variables
int cambioDeParcial=0;


System.out.print("Dime que materia quieres modificar: ");
            respuesta= lectura.next();
            buscar();//para que al modificar invoque el metodo de buscar
    if(posicion==-1){
        System.out.println("mmm.. esa materia no esta");
    }//cierre del if
    else{
       System.out.print("De que parcial quieres modificar? (1 o 2): ");
       cambioDeParcial=lectura.nextInt();
       cambioDeParcial-=1;//para que salga 0/1 cuando se ponga 1/2
       System.out.println("La calificacion actual es: " +
               boleta[posicion][cambioDeParcial]+
               " dime la nueva calificacion: ");
       boleta[posicion][cambioDeParcial]=lectura.nextInt();

    }//cierre del else
    respuesta="";
    posicion=-1;
}//cierre del metodo modifica


public static void buscar() {
//declarar variables
    int cont=0;
    //inicia la rutina de busqueda
    for (cont=0;cont<MAT; cont++) {
       if(respuesta.equals(materia[cont])){
           posicion=cont;
           break;
        } //cierre del if
    }//cierre del ciclo de busqueda

}//cierre del metodo buscar que busca algo en el arreglo

}
