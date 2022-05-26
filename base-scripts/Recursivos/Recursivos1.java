/*****************************************
// Tecnologico de Monterrey		//
// Campus Santa Fe			//
// Fundamentos de Programacion          //
// “Ejemplo de conteo con recursivo”	//
// Dr. Luis Yepez Perez			//
// Gerardo Anglada de Landa - A01021917	//
// 19/Oct/2017				//
*****************************************/

//Hacer un programa que muestre un conteo de 1 a 100 con una funcion recursiva

public class Recursivos1 {
    public static void main(String[] args) {
        int x = 100;
        conteo(x);
    }
    
    public static void conteo(int num){
        int cont=0;
                    
        if(num<=0)
            return;
        
        else{
            conteo(num-1);
            System.out.printf("%d ", num);
        return;      
        }
    }
}
