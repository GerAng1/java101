import java.io.*;
import java.util.Scanner;

public class EscribirArchivo {
  public static void main (String[] args) throws IOException {

    String nombreArchivo = "/Users/gerardoanglada/Documents/github/ArchivosCreados/LLenadoDesdeCodigo.txt";
    String texto;
    File archivo;
    FileWriter escritor;
    PrintWriter pw;
    Scanner lectura = new Scanner(System.in);


    archivo = new File(nombreArchivo);
    archivo.createNewFile();

    escritor = new FileWriter(archivo, true);

    //escritor.write("Ejemplo de archivo. \n Salto ");
    System.out.print("Dime que quieres que agregue al archivo: ");
    texto = lectura.next();

    pw = new PrintWriter(escritor);
    pw.printf(texto);


    escritor.close();
  }

}
