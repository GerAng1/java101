import java.io.*;

public class LeerArchivo {
  public static void main (String[] args) throws IOException {

    String nombreArchivo = "/Users/gerardoanglada/Documents/github/ArchivosCreados/ejemplo2.csv";
    String datosleidos;
    FileReader lector;
    BufferedReader br;
    String[][] arreglo = new String[2][3];

    lector = new FileReader(nombreArchivo);
    br = new BufferedReader(lector);

    while((datosleidos = br.readLine()) !=null){
      System.out.println(datosleidos);
      arreglo = datosleidos.split(",");
      System.out.println(arreglo[1][2]);

    }

  }

}
