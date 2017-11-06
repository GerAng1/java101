/*****************************************
// Tecnologico de Monterrey		//
// Campus Santa Fe			//
// Fundamentos de Programacion          //
// “Ejemplo de Strings Recursivo”	//
// Dr. Luis Yepez Perez			//
// Gerardo Anglada de Landa - A01021917	//
// 19/Oct/2017				//
*****************************************/
public class StringRecursivo {
    public static void main(String[] args) {
        String nombre = "Gerardo";
        //String parte = nombre.substring(2,4);
        
        //System.out.println(parte); PARA ENTENDER EL SUBSTRING
        palabras(nombre);
    }
    public static void palabras(String nom){
        if (nom.length()<=1)
            System.out.println(nom + " ");
        else {
            System.out.println(nom+" ");
            palabras(nom.substring(0,nom.length()-1));
        }
    }
}
