import java.util.*;

public class CalculadoraFracciones {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE FRACCIONES");

        menu();
    }

    public static void menu(){
        int opcion;
        boolean selMenu = true, err = true;
        Scanner lc = new Scanner(System.in);

        System.out.print("\n MENU \n"
            + "\t1.- Resultado Fraccion \n"
            + "\t2.- Sumar Fracciones \n"
            + "\t3.- Restar Fracciones \n"
            + "\t4.- Multiplicar Fracciones \n"
            + "\t5.- Dividir Fracciones \n"
            + "\t6.- Simplificar Fraccion \n"
            + "\t7.- Comparar Fracciones \n"
            + "\t8.- Imprimir Fraccion \n"
            + "\t 9.- Salir \n\n");

        while(err){
            try{
                System.out.println("Elija la opcion que quieras: ");
                
                while(selMenu){
                    opcion=lc.nextInt();
                    lc.nextLine();

                    switch(opcion){
                      case 1:
                        ansFrac();
                        selMenu = false;
                        break;
                      case 2:
                        sumar();
                        selMenu = false;
                        break;
                      case 3:
                        restar();
                        selMenu = false;
                        break;
                      case 4:
                        multiplicar();
                        selMenu = false;
                        break;
                      case 5:
                        dividir();
                        selMenu = false;
                        break;
                      case 6:
                        toLowestTerms();
                        selMenu = false;
                        break;
                      case 7:
                        comparar();
                        selMenu = false;
                        break;
                      case 8:
                        imprimir();
                        selMenu = false;
                        break;
                      case 9:
                        System.out.println("Adios\n");
                        System.exit(0);
                        break;
                      default:
                        System.out.print("Opcion no existe, elige entre 1 y 9: ");
                        break;
                    }
                }
            }

            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
    }//fin Menu
    
    public static void ansFrac(){
        int num, den;
        boolean err = true;
        Fraccion f;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador, "
                        + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();
               
                f = new Fraccion(num, den);                
                System.out.printf("%d/%d es: %.2f", num, den, f.toDouble());
                
                err = false;
            }

            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
        
        menu();
    }
    
    public static void sumar(){
        int num, den;
        boolean err = true;
        Fraccion f, otherf;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador, "
                + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den);

                System.out.println("Teclea los valores del numerador y denominador "
                        + "a sumar, separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                otherf = new Fraccion(num, den);
                System.out.printf("%s + %s es: %s",
                        f.toString(), otherf.toString(), f.add(otherf).toLowestTerms());
                
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
        
        menu(); 
    }
    
    public static void restar(){
        int num, den;
        boolean err = true;
        Fraccion f, otherf;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador, "
                        + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den);

                System.out.println("Teclea los valores del numerador y denominador "
                        + "a restar, separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                otherf = new Fraccion(num, den);
                System.out.printf("%s - %s es: %s",
                        f.toString(), otherf.toString(), f.substract(otherf).toLowestTerms());
                
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
        
        menu();
    }
    
    public static void multiplicar(){
        int num, den;
        boolean err = true;
        Fraccion f, otherf;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador, "
                        + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den);

                System.out.println("Teclea los valores del numerador y denominador "
                        + "a multiplicar, separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                otherf = new Fraccion(num, den);
                System.out.printf("%s * %s es: %s",
                        f.toString(), otherf.toString(), f.multiply(otherf).toLowestTerms());
                
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
        
        menu();
    }
    
    public static void dividir(){
        int num, den;
        boolean err = true;
        Fraccion f, otherf;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador, "
                        + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den);

                System.out.println("Teclea los valores del numerador y denominador "
                        + "a dividir, separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                otherf = new Fraccion(num, den);
                System.out.printf("%s / %s es: %s",
                        f.toString(), otherf.toString(), f.divide(otherf).toLowestTerms());
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
        
        menu();
    }
    
    public static void toLowestTerms(){
       int num, den;
       boolean err = true;
       Fraccion f;
       Scanner lc = new Scanner(System.in);
       
       while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador "
                        + "a reducir, separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den); 
                System.out.println(f.toString() + " es igual a: " + f.toLowestTerms().toString());
                
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
       }
    
        menu();
    }
    
    public static void comparar(){
        int num, den;
        boolean err = true;
        Fraccion f, otherf;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador, "
                        + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den);

                System.out.println("Teclea los valores del numerador y denominador "
                        + "a comparar, separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                otherf = new Fraccion(num, den);
                
                if(f.equals(otherf))
                    System.out.println(f + " y " + otherf + " son equivalentes.");
                
                else
                    System.out.println(f + " y " + otherf + " no son equivalentes.");
                
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
        
        menu();
    }
    
    public static void imprimir(){
        int num, den;
        boolean err = true;
        Fraccion f;
        Scanner lc = new Scanner(System.in);
        
        while(err){
            try{
                System.out.println("Teclea los valores del numerador y denominador,"
                    + "separados por un espacio o enter [Ej. -3 4]");
                num = lc.nextInt();
                den = lc.nextInt();

                f = new Fraccion(num, den);
                System.out.println(f.toString());
                
                err = false;
            }
            
            catch (ArithmeticException ex) {
                System.err.println("Error: Denominador no puede ser '0'. \n");
                lc.nextLine();
            } 
            catch (InputMismatchException ex) {
                System.err.println("Error: No puede teclear letras. \n");
                lc.nextLine();
            }
        }
       
        menu();
    }
}//fin clase