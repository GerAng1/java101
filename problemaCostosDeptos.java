/** ************************************************|
 * | Fundamentos de Programación                    |
 * | "Problema de Arreglos, condiciones y ciclos"   |
 * | Gerardo Anglada - A01021917                    |
 * | 2/Feb/2017                                     |
 * |************************************************/

package codigosbase;

import java.util.*;

public class problemaCostosDeptos {

    //captura datos globales
    static Scanner lectura = new Scanner(System.in);
    static Random random= new Random ();

    static final int MES=13;
    static final int DEPT=3;
    
    static int elec = -1;
    static int elecMes = -1;
    static int costoElec = -1;
    static String deptos []= {"Electronicos", "Computos", "Software"};
    static String[][] costos = new String [DEPT][MES];
    
public static void main (String[] args){
    capturaCostos();
    mayorElec();
    imprimir();        
//  promCostos();
    mayMenSoft();
//  menDic();        
}//final main
   
public static void capturaCostos(){
    for (int cont1 = 0; cont1 < DEPT; cont1++){
        String depto = deptos[cont1];
        costos[cont1][0] = depto;
        for (int cont = 1; cont < MES; cont++){
            System.out.println("Dame el costo de " + depto + " para el mes "
                    + cont + ":");
            costos[cont1][cont] = lectura.next();
        }
    }    
}//fin del metodo que captura los meses del año

public static void imprimir(){
    for (int cont = 0; cont < DEPT; cont++){
        for (int cont1 = 0; cont1 < MES; cont1++){
            System.out.print(costos[cont][cont1] + " ");
        }
        System.out.println("");
    }    
    System.out.println("El mayor costo de Electronicos se registro en el mes "
            + elecMes + " y fue de " + costoElec + ".");
}// final del metodo imprime
    
public static void mayorElec(){
    for (int cont = 0; cont < DEPT; cont++){
        if(deptos[cont].equalsIgnoreCase("Electronicos")){
            elec = cont;
            break;
        }            
    }
    for (int cont = 1; cont < MES; cont++){
        int costoOriginal = Integer.parseInt(costos[elec][cont]);
            
        if(costoOriginal > costoElec){
            elecMes = cont;
            costoElec = costoOriginal;
        }
    }
        
        
}//fin de mayor elec

public static void promCostos(){
    int cont = 0;
    double costosComp = 0, total = 0, promedio;

}

public static void mayMenSoft(){
    for (int cont = 0; cont < DEPT; cont++){
        if(deptos[cont].equalsIgnoreCase("Electronicos")){
            elec = cont;
            break;
        }            
    }
        
    for (int cont = 1; cont < MES; cont++){
        int costoOriginal = Integer.parseInt(costos[elec][cont]);
            
        if(costoOriginal > costoElec){
            elecMes = cont;
            costoElec = costoOriginal;
        }
    }     
 }//fin metodo
}//final de la clase
