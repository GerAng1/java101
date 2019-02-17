import java.util.Scanner;
public class Soups {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String str;
        char[] cStr = {'D', 'O', 'G'};
        char[][] letters = {{'D', 'G', 'O', 'O', 'D', 'D', 'O', 'D', 'G', 'O', 'O', 'D', 'D', 'O'},
                            {'O', 'D', 'O', 'O', 'G', 'G', 'G', 'O', 'O', 'D', 'G', 'O', 'G', 'G'},
                            {'O', 'G', 'O', 'G', 'D', 'O', 'O', 'D', 'G', 'O', 'O', 'D', 'D', 'D'},
                            {'D', 'G', 'D', 'O', 'O', 'O', 'G', 'G', 'O', 'O', 'G', 'D', 'G', 'O'},
                            {'O', 'G', 'D', 'G', 'O', 'G', 'D', 'G', 'O', 'G', 'G', 'O', 'G', 'D'},
                            {'D', 'D', 'D', 'G', 'D', 'D', 'O', 'D', 'O', 'O', 'G', 'D', 'O', 'O'},
                            {'O', 'D', 'G', 'O', 'G', 'G', 'D', 'O', 'O', 'G', 'G', 'O', 'O', 'D'}};

        System.out.printf("BIENVENIDO A LA SOPA DE LETRAS%n%n");

        for(int row = 0; row<letters.length; row++){
            for(int column = 0; column<letters[0].length; column++){
            System.out.print(letters[row][column] + "  ");
            }
            System.out.println("");
        }

        /*System.out.printf("%n%nEscribe la palabra que estas buscando y "
                + "te dire cuantas veces aparece en la sopa %n Ejemplos: "
                + "good (fácil), god(medio), dog(nivel extremo imposible, "
                + "juraras que no esta):");
        str = lectura.nextLine();
        cStr = str.toCharArray();
        *///esto se implementa cuando sepa como hacer el for del metodo por el length del toString
        //MIENTRASTANTO
        
        System.out.println("Antes de continuar, busque la palabra 'DOG', "
                + "si se rinde, escriba 'dog' y oprima enter.");
        lectura.next();
        searchTimes(letters, cStr);
    }

    public static void searchTimes(char[][] mtr, char[] word){
      //int[] row = {-1, -1, -1, 0, 0, 1, 1, 1};
      //int[] column = {-1, 0, 1, -1, 1, -1, 0, 1};
      //int numLetters = word.length;
      
      boolean bool = false;
        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr[i].length; j++) {
                if (j>1) {
                    if (mtr[i][j] == 'D' && mtr[i][j - 1] == 'O' && mtr[i][j - 2] == 'G') {//left
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (j<mtr[i].length-2) {
                    if (mtr[i][j] == 'D' && mtr[i][j + 1] == 'O' && mtr[i][j + 2] == 'G') {//rigth
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (i<mtr.length-2) {
                    if (mtr[i][j] == 'D' && mtr[i + 1][j] == 'O' && mtr[i + 2][j] == 'G') {//bot
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (i>1) {
                    if (mtr[i][j] == 'D' && mtr[i-1][j] == 'O' && mtr[i - 2][j] == 'G') {//top
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (i<mtr.length-2 && j<mtr[i].length-2) {
                    if (mtr[i][j] == 'D' && mtr[i + 1][j + 1] == 'O' && mtr[i + 2][j + 2] == 'G') {//bot&rigth
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (i>1 && j>1) {
                    if (mtr[i][j] == 'D' && mtr[i - 1][j - 1] == 'O' && mtr[i - 2][j - 2] == 'G') {//top&left
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (i>1 && j<mtr[i].length-2) {
                    if (mtr[i][j] == 'D' && mtr[i - 1][j + 1] == 'O' && mtr[i - 2][j + 2] == 'G') {//top&rigth
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
                if (i<mtr.length-2 && j>1) {
                    if (mtr[i][j] == 'D' && mtr[i + 1][j - 1] == 'O' && mtr[i + 2][j - 2] == 'G') {//bot&left
                        bool = true;
                        System.out.println("Se encuentra en x = " + (j+1) + ", y = -" + (i+1));
                    } 
                }
            }
        }
        System.out.println(bool);

        }
    }