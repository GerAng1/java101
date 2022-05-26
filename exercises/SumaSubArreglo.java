public class Arreglos {
    public static void main(String[] args){
        int[] arreglo = {1, -2, 4, -5, 1};
        
        System.out.println("Tu arreglo: " + Arrays.toString(arreglo) + "\n");
    
        calculo(arreglo);
    }
    
    public static void calculo(int[] a){
        int suma=0, cont3=0;
        
        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a.length; j++){
                cont3 = i;
                while(cont3<=j){
                    suma += a[cont3];
                    cont3++;                   
                }
                if(suma<0)
                    System.out.printf("[%d:%d] = %d%n",(i+1), (j+1), suma);
                
                suma = 0;
            }
        }
    }
}