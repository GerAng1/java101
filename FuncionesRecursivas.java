
package tareamatrices;
import java.util.Scanner;

public class FuncionesRecursivas {
    //Calculo sumatoria hasta n
    public static void main(String[] args){
    int n = 15;
    int fin;
    Scanner lectura = new Scanner(System.in);
    
    System.out.printf("Sumatoria %d %nCon recursivo %d %nFactorial Recursivo %d", 
    sumatoria(n), sumatoriaRecursiva(n), factorialRecursivo(n));
    
    System.out.printf("Fibonacci%n Cuantas veces quieres que se haga la suma?: ");
    fin=lectura.nextInt();
    
        System.out.printf("La serie de fibonacci hasta la variable %d es %d", fin+2, fibonacci(ans));
    
    }//fin del main
        
    public static int sumatoria(int n){
        int suma = 0;
    
        for(int cont = 0; cont<=n; cont++){
            suma+=cont;
           }
        return suma;
    }//fin sumatoria

    public static int sumatoriaRecursiva(int n){
        if(n==1)
            return 1;
       
        else if(n<0)
            return 0;
       
        else
            return n+sumatoriaRecursiva(n-1);      
    } 
    
    public static long factorialRecursivo(long n){
        if(n<=1)
            return 1;
       
        else if(n<0)
            return 0;
       
        else
            return n*factorialRecursivo(n-1);     
    } 
    
    public static int fibonacci(int fin){
        int total=0;
        
        return total;
    }
}//fin clase
