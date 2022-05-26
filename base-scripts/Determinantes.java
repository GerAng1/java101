import java.util.Scanner;
/*
Escribir un programa que calcule por determinantes
las incognitas de un sistema de 2 o de 3 ecuaciones
(seleccionar que tipo de ecuación se desea resolver) 
guardando las constantes en matrices. 
*/
public class Determinantes {
    public static void main(String[] args) {
        int grado, x;
        double[] resp;
        double[] primGrad = new double [3];
        double[][] segGrad = new double [2][3];
        double[][] tercGrad = new double [3][4];
        Scanner lectura = new Scanner(System.in);

        do {
            System.out.printf("Resolvedor de Ecuaciones%n"
                + "Cuantas ecuaciones tienes?: ");
            grado=lectura.nextInt();

            switch (grado) {
                case 1:
                    resp = new double [1];

                    System.out.printf("Dame las variables 'a', 'b' y 'c' siendo%n"
                            + "ax+b=c:  ");

                    for(int cont=0;cont<primGrad.length; cont++){
                        primGrad[cont]=lectura.nextDouble();
                    }
                    resp=primerGrado(primGrad);

                    System.out.println("'x' vale "+ resp[0]);
                    break;

                case 2:
                    resp = new double [2];

                    System.out.printf("Dame las variables 'a', 'b', 'e', 'c', 'd' y 'f' siendo: "
                            + "%n ax + by = e %n cx + dy = f%n");

                    for(int cont=0; cont<segGrad.length; cont++){
                        for(int cont2=0; cont2<segGrad[0].length; cont2++){
                            segGrad[cont][cont2]=lectura.nextDouble();
                        }
                    }
                    resp=segundoGrado(segGrad);

                    System.out.println("'x' y ''y' son "+ resp[0] +" y " + resp[1]);
                    break;

                case 3:
                    resp = new double [3];

                    System.out.printf("Dame las variables 'a', 'b', 'c', 'j', "
                            + "'d', 'e', 'f', 'k', 'g', 'h', 'i', y 'l' "
                            + "siendo: %n ax + by + cz = j %n dx + ey + fz = k%n"
                            + " gx + hy + iz = l %n");

                    for(int cont=0; cont<tercGrad.length; cont++){
                        for(int cont2=0; cont2<tercGrad[0].length; cont2++){
                            tercGrad[cont][cont2]=lectura.nextDouble();
                        }
                    }
                    resp=tercerGrado(tercGrad);

                    System.out.println("'x', 'y' y 'z' son " + resp[0] + ", "
                            + resp[1] + ", " + resp[2] + ".");
                    break;

                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }

        } while(grado!=1 || grado!=2 || grado!=3);
    }

    public static double[] primerGrado(double[] vars){
        double[] respuesta = new double[1];

        respuesta[0] = (vars[2]-vars[1])/vars[0];

        return respuesta;
    }

    public static double[] segundoGrado(double[][] arrSeg){
        double[] respuesta = new double[2];
        double den, resp1, resp2;

        den=(arrSeg[0][0]*arrSeg[1][1]-arrSeg[0][1]*arrSeg[1][0]);

        resp1= ((arrSeg[0][2]*arrSeg[1][1]-arrSeg[0][1]*arrSeg[1][2]))
                /den;

        resp2= ((arrSeg[0][0]*arrSeg[1][2]-arrSeg[0][2]*arrSeg[1][0]))
                /den;

        respuesta[0]=resp1;
        respuesta[1]=resp2;

        return respuesta;
    }

    public static double[] tercerGrado(double[][] arrTerc){
        double x, y, z, den;
        double resp1, resp2, resp3;
        double[] respuesta = new double[3];

        den=((arrTerc[0][0]*(arrTerc[1][1]*arrTerc[2][2]-arrTerc[1][2]*arrTerc[2][1]))
            -(arrTerc[0][1]*(arrTerc[1][0]*arrTerc[2][2]-arrTerc[1][2]*arrTerc[2][0]))
            +(arrTerc[0][2]*(arrTerc[1][0]*arrTerc[2][1]-arrTerc[1][1]*arrTerc[2][0])));

        resp1=((arrTerc[0][3]*((arrTerc[1][1]*arrTerc[2][2])-(arrTerc[1][2]*arrTerc[2][1])))
          -(arrTerc[1][3]*((arrTerc[1][0]*arrTerc[2][2])-(arrTerc[1][2]*arrTerc[2][0])))
          +(arrTerc[2][3]*((arrTerc[1][0]*arrTerc[2][1])-(arrTerc[1][1]*arrTerc[2][0]))))/den;

        resp2=((arrTerc[0][0]*(arrTerc[1][3]*arrTerc[2][2]-arrTerc[2][3]*arrTerc[2][1]))
          -(arrTerc[0][1]*(arrTerc[0][3]*arrTerc[2][2]-arrTerc[2][3]*arrTerc[2][0]))
          +(arrTerc[0][2]*(arrTerc[0][3]*arrTerc[2][1]-arrTerc[1][3]*arrTerc[2][0])))/den;

        resp3=((arrTerc[0][0]*(arrTerc[1][1]*arrTerc[2][3]-arrTerc[1][2]*arrTerc[1][3]))
          -(arrTerc[0][1]*(arrTerc[1][0]*arrTerc[2][3]-arrTerc[1][2]*arrTerc[0][3]))
          +(arrTerc[0][2]*(arrTerc[1][0]*arrTerc[1][3]-arrTerc[1][1]*arrTerc[0][3])))/den;

        respuesta[0] = resp1;
        respuesta[1] = resp2;
        respuesta[2] = resp3;

        return respuesta;
    }
}
