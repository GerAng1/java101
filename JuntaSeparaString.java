public class JuntaSeparaString{
  public static void main(String[] args){
    String[] nombres = {"Gerardo","Anglada","de Landa"};
    String lineaCSV;

    lineaCSV = String.join(", ",nombres);

    System.out.println(lineaCSV);
  }

//SEPARANDO

String[] separados;

separados = lineaCSV.split(", ");

System.out.println(separados[0]);

}
