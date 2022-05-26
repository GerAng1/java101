import java.util.*;
import javax.swing.*;

/*
 *Gerardo Anglada
 * Actividad Segundo Parcial
 */
public class CelularMain {
    static Scanner lectura= new Scanner(System.in);
    static String letrero="", letrero2="";
    static int opcion=0;
    static Celular miTel= new Celular("5543407932", 0.0, "AT&T");

public static void main(String[] args) {

    miTel.depositarFamiliar(100);

   while(opcion!=7){
       menu();
    }
}
public static void menu(){
    String lasOpciones="";
    String [] arreglo={"actualiza", "incrementas", "doyioggnifds", "cs", "id", "df", "s"} ;
    lasOpciones="\t1.- Actualiza Datos \n";
    lasOpciones+="\t2.- Incrementa Saldo \n";
    lasOpciones+="\t3.- Descuenta Saldo \n";
    lasOpciones+="\t4.- Consulta Saldo \n";
    lasOpciones+="\t5.- Imprime Datos \n";
    lasOpciones+="\t6.- Deposito a Familiar \n";
    lasOpciones+="\t\t7.- Salir \n";
    lasOpciones+="";
    lasOpciones+="Elija la opcion que quieras";

     // System.out.println(lasOpciones);
      JOptionPane.showOptionDialog(null, "Menu", "Celular", 1, JOptionPane.PLAIN_MESSAGE, null, arreglo, null);

              opcion=lectura.nextInt();

    //switch case que nos ayuda a elegir que se debe hacer
     switch(opcion){
         case 1:
             aD();
         break;
         case 2:
             iS();
         break;
         case 3:
             dS();
         break;
         case 4:
             cS();
         break;
         case 5:
             iD();
         break;
         case 6:
             dF();
         break;
         case 7:
             System.exit(0);
         break;
         default:
             System.out.println("Opcion no existe");
        break;
     }
}
public static void aD(){
    String cia ="", cel="", equis="",clave="";//"equis" para imprimir datos
    double elSaldo=0.0;
        do {
           System.out.println("Inserta Contraseña: ");
           clave=lectura.next();
        } while (!clave.equalsIgnoreCase("holabola")); //pedira la contrasena hasta que este sea la correcta

         System.out.println("Dime la compania");
         cia=lectura.next();
         System.out.println("Dame el saldo");
         elSaldo=lectura.nextDouble();
         System.out.println("Dame el nuevo num ");
         cel=lectura.next();

         miTel.actualizaDatos(cia, elSaldo, cel); //esto hace los cambios

        equis=miTel.imprimeDatos();
        System.out.println(equis);
        System.out.println(); //esto los reimprime para ver los cambios
}

public static void iS(){
    double cuanto=0.0, temp=0.0;
        System.out.println("Cuanto le agregamos? ");
        cuanto=lectura.nextDouble();
        temp=miTel.incrementaSaldo(cuanto);
        System.out.println("Tu nuevo saldo es de "+temp);
}//fin del metodo
public static void dS(){
    double cuanto=0.0, temp=0.0;
    System.out.println("Cuanto vas a usar? ");
    cuanto=lectura.nextDouble(); //guarda el valor que se descontara en cuanto
    temp=miTel.descuentaSaldo(cuanto); //en temp estara el valor del saldo original menos "cuanto"
    System.out.println("Tu nuevo saldo es de " + temp);
}//fin del metodo

public static void cS(){
    System.out.println("Tu saldo actual es de: " + miTel.consultaSaldo());
}//fin del metodo

public static void iD(){
    String equis="";
    equis=miTel.imprimeDatos();
    System.out.println(equis);
    System.out.println();
}//fin del metodo

public static void dF(){
    double wieViel=0.0;
    System.out.println("Cuanto saldo quieres depositar al saldo familiar?: ");
    wieViel=lectura.nextDouble();
    miTel.depositarFamiliar(wieViel);
    System.out.println(miTel.imprimeFam());//porque en mi clase ya declare que me regrese el string de cuanto
}//fin del metodo

}//fin de la clase
