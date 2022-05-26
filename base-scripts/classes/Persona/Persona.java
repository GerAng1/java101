
public class Persona {
    private String nombre;

    Persona(){
        this("Gerardo");
    }
    Persona(String nombre){
      setNombre(nombre);
    }

    private void setNombre(String nombre){
      this.nombre=nombre;
    }//cierre del modificador

    private String getNombre(){
      return(nombre);
    }

/*otros metodos
ya no son void porque le van a regresar un valor
(el que yo quiera) a la clase implementadora.*/
//en este caso regresa un texto)

  public String imprimir(){
    String temp="";
    temp="El nombre de esta persona es: ";
    temp+=getNombre();
    //para sustituir sout
    return(temp);
  }          
}//cierre clase
