import java.util.Scanner;

public class MainLibros {

    static Kindle kindle = new Kindle();

    public static void main(String[] args) {
        Autor a1 = new Autor("Stephanie", "Meyer", 44);
        Autor a2 = new Autor("George", "Orwell", 100);
        Libro l1 = new Libro("Crepusculo", a1, 322);
        Libro l2 = new Libro("1984", a2, 592);

        kindle.agregarLibroE(l1);
        kindle.agregarLibroE(l2);

        System.out.println("Bienvenido a tu Kindle. Por abrir su Kindle "
                + "por primera vez, le regalamos 2 libros para que empieze a leer!");

        menu();
    }

    public static void menu(){
        Scanner lectura = new Scanner(System.in);
        String lasOpciones="";
        boolean selMenu = true;
        int opcion;

        lasOpciones="\n MENU \n";
        lasOpciones+="\t1.- Agregar Libro \n";
        lasOpciones+="\t2.- Leer Libro \n";
        lasOpciones+="\t3.- Eliminar Libro \n";
        lasOpciones+="\t4.- Imprimir Libros \n";
        lasOpciones+="\t5.- Updates \n";
        lasOpciones+="\t 6.- Salir \n";
        lasOpciones+="";
        lasOpciones+="Elija la opcion que quieras: ";

        System.out.println("\nTienes " + kindle.getSize() + " libros.");

        System.out.print(lasOpciones);

        do{
          opcion=lectura.nextInt();
          lectura.nextLine();
          switch(opcion){
            case 1:
              agregarLibro();
              selMenu = true;
              break;
            case 2:
              leerLibro();
              selMenu = true;
              break;
            case 3:
              eliminarLibro();
              selMenu = true;
              break;
            case 4:
              imprimirLibros();
              selMenu = true;
              break;
            case 5:
              updates();
              selMenu = true;
              break;
            case 6:
              System.out.println("Adios\n");
              System.exit(0);
              break;
            default:
              System.out.print("Opcion no existe, elige entre 1 y 6: ");
              selMenu = false;
              break;
          }
        }while(selMenu == false);
    }//fin Menu

    public static void agregarLibro(){
        Scanner lc = new Scanner(System.in);
        Libro l;
        int numPag;

        String added;

        String title, nomAutor, apAutor;
        Autor a;

        System.out.print("¿Título obra?: ");
        title = lc.nextLine();
        added = title;

        System.out.print("¿Nombre autor?: ");
        nomAutor = lc.nextLine();

        System.out.print("¿Apellido autor?: ");
        apAutor = lc.nextLine();

        a = new Autor(nomAutor, apAutor);

        System.out.println("¿Num. Pags.?: ");
        numPag = lc.nextInt();
        lc.nextLine();

        l = new Libro(title, a, numPag);

        kindle.agregarLibro(l, added);

        System.out.println("Se ha agregado " + title + " a la lista.");

        menu();
    }

    public static void leerLibro(){
        kindle.imprimirLibros();
        kindle.leerLibro();

        menu();
    }

    public static void eliminarLibro(){
        kindle.imprimirLibros();
        kindle.eliminarLibro();

        menu();
    }

    public static void updates(){
        kindle.updates();

        menu();
    }

    public static void imprimirLibros(){
        kindle.imprimirLibros();

        menu();
    }
}
