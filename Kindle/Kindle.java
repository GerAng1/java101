import java.util.ArrayList;
import java.util.Scanner;

public class Kindle {
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    private String added = "NO HAY", read = "NO HAY", erased = "NO HAY";

    public void agregarLibro(){
        Scanner lc = new Scanner(System.in);
        Libro l;

        String nombre, autor;
        int numPag;

        System.out.print("¿Nombre?: ");
        nombre = lc.nextLine();
        added = nombre;

        System.out.print("¿Autor?: ");
        autor = lc.nextLine();

        System.out.println("¿Num. Pags.?: ");
        numPag = lc.nextInt();
        lc.nextLine();

        l = new Libro(nombre, autor, numPag);
        listaLibros.add(0, l);

        System.out.println("Se ha agregado " + nombre + " a la lista.");
    }

    public void leerLibro(){
        boolean existe = false;
        Scanner lc = new Scanner(System.in);
        String libro;

        Libro book;

        if(listaLibros.isEmpty())
            System.out.println("\n NO TIENES LIBROS QUE LEER. AGREGA UNOS CUANTOS!");

        else{
            System.out.println("\nQue libro quieres leer? (El titulo nada mas): ");
            libro = lc.nextLine();

            while(existe == false){
                for(int i = 0; i < listaLibros.size(); i++){
                    if(libro.equalsIgnoreCase(listaLibros.get(i).getNombre())){
                        book = listaLibros.get(i);
                        listaLibros.add(0, book);
                        listaLibros.remove(i+1);
                        System.out.println("\n El usuario esta leyendo " + listaLibros.get(0).getNombre() + ".");
                        existe = true;
                        read = listaLibros.get(0).getNombre();
                        break;
                    }
                }

                if(existe == false){
                    System.out.println("Ese libro no existe. Verifique que lo escriba como en la lista: ");
                    libro = lc.nextLine();
                }
            }
        }
    }

    public void eliminarLibro(){
        String libro;

        Scanner lc = new Scanner(System.in);
        boolean existe = false;

        if(listaLibros.isEmpty())
            System.out.println("\n NO HAY LIBROS QUE BORRAR!");

        else{
            System.out.println("Que libro quieres eliminar? (El titulo nada mas): ");
            libro = lc.nextLine();

            while(existe == false){
                for(int i = 0; i < listaLibros.size(); i++){
                    if(libro.equalsIgnoreCase(listaLibros.get(i).getNombre())){
                      erased = listaLibros.get(i).getNombre();
                      System.out.println("El libro " + listaLibros.get(i).getNombre() +
                                " ha sido eliminado.");
                      listaLibros.remove(i);

                      existe = true;
                      break;
                    }
                }

                if(existe == false){
                        System.out.println("Ese libro no existe. Verifique que lo escriba como en la lista: ");
                    libro = lc.nextLine();

                }
            }
        }
    }

    public void updates(){
        System.out.println("");
        System.out.println("Ultimo Libro agregado: " + added);
        System.out.println("Ultimo Libro leido: " + read);
        System.out.println("Ultimo Libro eliminado: " + erased);
    }

    public void imprimirLibros(){
        System.out.println("\n\nTus Libros:");

        if(listaLibros.isEmpty())
          System.out.println("NO HAY LIBROS PARA IMPRIMIR!");

        else{
        for(int i = 0; i < listaLibros.size(); i++){
            System.out.printf("%n" + (i+1) + ": " + listaLibros.get(i).getAutor() +
                    ": " + listaLibros.get(i).getNombre() +
                    " (" + listaLibros.get(i).getNumPag() + " pags.)");

            System.out.println("");
        }
        }
    }

    public int getSize(){
        if(listaLibros.isEmpty())
            return 0;

        else
            return listaLibros.size();
    }

    public void agregarLibroE(Libro l){
        listaLibros.add(l);
    }
}
