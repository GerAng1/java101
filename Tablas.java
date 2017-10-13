/*****************************************
// Tecnologico de Monterrey							//
// Campus Santa Fe											//
// Fundamentos de Programacion					//
// "Tablas de multiplicar con for"			//
// Dr. Luis Yepez Perez									//
// Gerardo Anglada de Landa - A01021917	//
// 18/Sep/2017													//
*****************************************/
import java.util.Scanner;

public class Tablas{
	public static void main(String[] args){

		    int termina, empieza, columna;
				Scanner lectura = new Scanner(System.in);

				System.out.println("Tablas");
		    System.out.print("Hasta que numero quieres la tabla?: ");
		    termina = lectura.nextInt();

		    for (empieza = -1; empieza <= termina; empieza++)
				{
					while(empieza==-1)
					{
						System.out.println();
						for (columna = -1; columna <= termina; columna++)
						{
							System.out.print(-1*empieza*columna + "\t");
						}
						empieza++;
					}
						System.out.println();

					for (columna = -1; columna <= termina; columna++)
					{
						if (columna==-1)
						{
							 System.out.print(-1*empieza*columna + "\t");
						}//fin del if
						else
						{
						 	System.out.print(empieza*columna + "\t");
						}//fin del else
					}//fin del for
		    }//fin del otro for
	}//fin del main
}//fin de la clase

/* LO QUE SALE
Tablas
Hasta que numero quieres la tabla?: 11

-1	 0	  1		 2	 3	 4	 5	 6	 7	 8	 9	 10		 11	
 0	 0	  0		 0	 0	 0	 0	 0	 0	 0	 0	  0	 	  0
 1	 0	  1		 2	 3	 4	 5	 6	 7   8	 9	 10		 11
 2	 0	  2		 4	 6	 8	10	12	14	16	18	 20		 22
 3	 0	  3		 6	 9	12	15	18	21	24	27	 30		 33
 4	 0	  4		 8	12	16	20	24	28	32	36	 40		 44
 5	 0	  5		10	15	20	25	30	35	40	45	 50		 55
 6	 0	  6		12	18	24	30	36	42	48	54	 60		 66
 7	 0	  7		14	21	28	35	42	49	56	63	 70		 77
 8	 0	  8		16	24	32	40	48	56	64	72	 80		 88
 9	 0	  9		18	27	36	45	54	63	72	81	 90		 99
 10	 0	 10		20	30	40	50	60	70	80	90	100		110
 11	 0	 11		22	33	44	55	66	77	88	99	110		121

*/
