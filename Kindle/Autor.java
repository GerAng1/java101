public class Autor {
    private String nombre, apellido;
    private int edad;

    public Autor(String nom, String ap){
        nombre = nom;
        apellido = ap;
    }

    public Autor(String nom, String ap, int edad){
        nombre = nom;
        apellido = ap;
        this.edad = edad;
    }

    public void SetNom(String nom){
        nombre = nom;
    }
    public void SetAp(String ap){
        apellido = ap;
    }
    public void SetEdad(int edad){
        this.edad = edad;
    }

    public String getNom(){
        return nombre;
    }
    public String getAp(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
}
