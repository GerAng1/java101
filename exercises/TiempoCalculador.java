import java.util.Scanner;
/* 
1.- Obtiene el tiempo y regresa num segundos desde la última vez que el reloj 
"llegó a las 12". 
2.- Calcula los segundos entre dos horas.
*/
public class TiempoCalculador {
    public static void main (String[] args){
        int hora, min, seg, h, m, s = 0, numseg, ns, ns1, dif;
        Scanner lectura= new Scanner (System.in);

        System.out.print("Dame la hora sin los minutos (en formato 24 hrs): ");
        hora=lectura.nextInt();
        System.out.print("Ahora los minutos que han pasado de esa hora: ");
        min=lectura.nextInt();
        System.out.print("Por último los segundos (si no sabe con exactitud, introduzca 0): ");
        seg = lectura.nextInt();

        numseg = (hora >= 12) ? ((hora-12) * 3600 + min * 60 + seg) : (hora * 3600 + min * 60+seg);

        System.out.println("Han pasado aproximadamente " + numseg + " segundos desde que el reloj marcó las 12.");
        System.out.println(hora + ":" + min + ":" + seg);

        System.out.print("Introduce una segunda hora empezando por las horas (en formato de 24 hrs): ");
        h = lectura.nextInt();
        System.out.print("Ahora los minutos: ");
        m = lectura.nextInt();
        System.out.print("Por último los segundos (si no sabe con exactitud, introduzca 0): ");
        s = lectura.nextInt();

        ns1 = (hora * 3600 + min * 60 + seg);
        ns = (h * 3600 + m * 60 + s);

        dif = (ns > ns1) ? (ns - ns1) : (ns1 - ns);
        System.out.println("La diferencia en segundos entre la primera y segunda hora ingresada es de: " + dif);
    }
}
