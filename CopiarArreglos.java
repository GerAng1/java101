import java.util.Random;
public class CopiarArreglos {

    public static void main(String[] args) {
        Random numeroAleatorios = new Random();
        int numero, buscado=-1;
        int[] arreglo = new int [20];
        int[] arregloCopia=new int [20];

        System.out.printf("Antes: %n Original:");
        for (int i=0; i<arreglo.length ;i++ ) {
            arreglo[i] = numeroAleatorios.nextInt(41)-20;
        }
        for (int i=0;i<arreglo.length ;i ++ ) {
            System.out.printf("%d ", arreglo[i]);
        }
        
        System.out.printf("%n Copia:   ");
        for (int j=0; j<arregloCopia.length ;j++ ) {
            arregloCopia[j] = numeroAleatorios.nextInt(41)-20;
        }
        for (int j=0;j<arregloCopia.length ;j ++ ) {
            System.out.printf("%d ", arregloCopia[j]);
        }

        
        for(int cont=0;cont<arreglo.length; cont++){
            arregloCopia[cont]=arreglo[cont];
        }
        
        System.out.printf("%n %n Despues: %n Original:");
        
        for (int i=0;i<arreglo.length ;i ++ ) {
            System.out.printf("%d ", arreglo[i]);
        }
        
        System.out.printf("%n Copia:   ");
        for (int j=0;j<arregloCopia.length ;j ++ ) {
            System.out.printf("%d ", arregloCopia[j]);
        }    
    }
}

       