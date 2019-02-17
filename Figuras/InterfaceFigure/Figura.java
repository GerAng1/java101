public interface Figura {
    /*
    Todas las variables declaradas dentro de una interfaz son public, static,
    y final
    */
    public String COLOR = "rojo";

    abstract double area();
    abstract double perimetro();
}
