public class JuntaString{
  public static void main(String[] args){
    String[] nombres = {"Gerardo","Anglada","de Landa"};
    String lineaCSV;

    lineaCSV = String.join(" ",nombres);

    System.out.println(lineaCSV);
  }
}
