public class Libro {
    private String nombre, autor;
    private int numPag;

    public Libro(String nombre, String autor, int numPag){
        this.nombre = nombre;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getNombre(){
        return nombre;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumPag(){
        return numPag;
    }

}
