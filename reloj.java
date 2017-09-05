/** ******************************|
 * | Fundamentos de Programación    |
 * | "Título"                       |
 * | Dr. Luis Yépez Pérez           |
 * | Gerardo Anglada - A01021917    |
 * | Mm/dd/2017                     |
 * |******************************* */
package codigosbase;
import java.util.Scanner;
        
public class reloj {
    
public static void main (String[] args){
  int hora, min, seg = 0, numseg;
  Scanner lectura= new Scanner (System.in);
  
    System.out.println("Dame la hora sin los minutos (en formato 24 hrs): ");
    hora=lectura.nextInt();
    System.out.println("ahora los minutos que han pasado de esa hora: ");
    min=lectura.nextInt();
    
    numseg= ((hora-12)*60*60)+(min*60);
    
    System.out.println("Han pasado aproximadamente " + numseg + " segundos desde "
            + "las 12.");

          System.out.println(hora+":"+min+":"+seg);

      }

    }

  


