import java.util.Scanner;
public class MainCliente {
    public static void main(String[] args){
        //micelaneo
        String ans;
        Scanner lectura = new Scanner(System.in);
         
        //Tarjeta
        String ansCard;
        int typeCard;
        TarjetaCredito tc = new TarjetaCredito("5224123412341234", 48000.00, 12, 10, 2015, 12, 10, 2019);
        Tarjeta tBlack = Tarjeta.BLACK;
        boolean selCard = true;
        //Cliente
        Cliente c = new Cliente(1243,"Juan", "Pérez", 28);
        Cliente c2, c3;
        String nom, ap;
        int IDcont = 1;
        int edad;
        
        System.out.println("\n\n\nPara Una Mejor Experiencia, "
                + "tenga la terminal en Pantalla Completa...\n");
        
        System.out.println("SISTEMA DE ALTA DE CLIENTES\n");
                
        c.setTarjetaCredito(tc); 
        c.printCliente();
        
        System.out.println("");
        //tc.printTC();
        
        System.out.printf("Quieres agregar un cliente nuevo? [Y/N]: ");
                ans = lectura.nextLine();
        
        while(ans.equalsIgnoreCase("Y")){           
            
                System.out.print("Nombre del Cliente: ");
                    nom = lectura.nextLine();
                    
                System.out.print("Apellido(s) del Cliente: ");
                    ap = lectura.nextLine();
                    
                System.out.print("Edad del Cliente: ");
                    edad = lectura.nextInt();
                    lectura.nextLine();
                    
                c2 = new Cliente(IDcont, nom, ap, edad);
                System.out.printf("Se ha creado al Cliente %s con el folio %d.%n%n", nom, IDcont);
                    IDcont++;
                
                System.out.print("Desea agregarle una tarjeta ahora? [Y/N]: ");
                    ansCard = lectura.nextLine();
                    
                    if(ansCard.equalsIgnoreCase("Y")){
                        
                        for (Tarjeta t : Tarjeta.values())
                             System.out.printf("La TIIE de la %s es: %.2f%% %n"
                                     + "Su Tasa Mensual es: %.2f%% %n"
                                     + "Su Tasa Anual es: %.2f%% %n"
                                     + "%n", t, t.TIIE(), t.TIM(), t.TIA());

                        System.out.printf("Seleccione la opcion de la tarjeta que desea: %n%n"
                            + "1: Clásica: \t\t\t 2: Oro \t\t\t 3: Platinum \t\t\t 4: Black%n"
                            + "Ingresos mínimos: $7,500 \t Ingresos mínimos: $15,000\t"
                            + " Ingresos mínimos: $45,000\t Ingresos mínimos: $100,000%n"
                            + "Anualidad: $699 \t\t Anualidad: $959 \t\t Anualidad:1,999 \t\t Anualidad:4,599 %n%n");

                            
                        do{ System.out.print("Seleccione [1, 2, 3 o 4]: "); 
                            typeCard = lectura.nextInt();
                            lectura.nextLine();
                            
                            
                            switch(typeCard){
                                case 1:
                                    System.out.println("Su Tarjeta Clasica");
                                    selCard = true;
                                    break;
                                case 2:
                                    System.out.println("Su Tarjeta Oro");
                                    selCard = true;
                                    break;
                                case 3:
                                    System.out.println("Su Tarjeta Platino");
                                    selCard = true;
                                    break;
                                case 4:
                                    System.out.println("Su Tarjeta BLACK");
                                    selCard = true;
                                    break;
                                default:
                                    System.out.println("Esa opción no es válida \n");
                                    selCard = false;
                                    break;
                                }
                            }while(selCard == false);
                    }
            System.out.printf("Quieres agregar un cliente nuevo? [Y/N]: ");
                ans = lectura.nextLine();
        }  
    }
}