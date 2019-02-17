public class CelularMainConArreglo {

    public static void main(String[] args) {
        //declara crea arreglo de objetos
        Celular [] miRed = new Celular[5];
        int cont=0;
        String losDatos="";

        //codigo para inizializar arreglo

        for (cont=0; cont<miRed.length; cont++) {
            miRed[cont]= new Celular();
        }//cierre for

        miRed[1].actualizaDatos("Telcel", 500, "5543434241");

        for (cont=0; cont<miRed.length; cont++) {
        losDatos=miRed[cont].imprimeDatos();
            System.out.println(losDatos);

        }//cierre del for
    }//cierre main
}//cierre clase
