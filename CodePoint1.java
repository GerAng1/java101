public class CodePoint1{
  public static void main (String[] args){
    String str;
    String str1="arbol";
    String str2="carro";
    String str3="barco";
    String compara = args[0];
    String nuevo;
    int val1;
    int comparacion;

    str = "Es misión del Tecnológico de Monterrey formar personas íntegras, éticas, con  una visión humanística y competitivas internacionalmente en su campo  profesional, que al mismo tiempo sean ciudadanos comprometidos con el  desarrollo económico, político, social y cultural de su comunidad y con el uso  sostenible de los recursos naturales.";

    if(str.contains(compara.toLowerCase()))
      System.out.println("Si aparece");

    else
      System.out.println("No aparece");

    nuevo = string.replace("personas", "alumnos");
    System.out.println(nuevo);

//esto ya es algo a parte
    comparacion = str1.compareToIgnoreCase(str2);
    System.out.printf("La diferencia de UTF es: %d %n ", comparacion);
    comparacion = str1.compareToIgnoreCase(str3);
    System.out.printf("La diferencia de UTF es: %d %n ", comparacion);
    comparacion = str3.compareToIgnoreCase(str2);
    System.out.printf("La diferencia de UTF es: %d %n ", comparacion);


  }

}
