import java.util.ArrayList;

public class Libro {
    private String nombre;
    //private ArrayList<Autor> listAutores = new ArrayList<Autor>();
    private int numPag;
    private Autor autor;

    public Libro(String nombre, Autor autor, int numPag){
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getNombre(){
        return nombre;
    }
    public String getAutor(){
        return (autor.getAp() + ", " + autor.getNom());
    }
    public int getNumPag(){
        return numPag;
    }

}
