//Ejemplo de composición
public class TarjetaCredito{
    private String numero;
    private double saldo;
    private Fecha fechaExpi;
    private Fecha fechaExpe;
    
    public TarjetaCredito(String numero, double saldo, int diaexpe, int mesexpe, int annoexpe, int diaexpi, int mesexpi, int annoexpi){
        this.numero=numero;
        this.saldo=saldo;
        fechaExpi = new Fecha(diaexpi, mesexpi, annoexpi);
        fechaExpe = new Fecha(diaexpe, mesexpe, annoexpe);
    }
    
    public String getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void compras(double cantidad){
        if(cantidad > saldo)
            System.out.println("Fondos insuficientes");
        
        else
            saldo = saldo - cantidad;   
    }
    
    public void printTC(){
        System.out.printf("Tarjeta de Crédito: %s\nSaldo: %.2f\n", numero, saldo);
        System.out.printf("Fecha de Expiración: %s\nFecha de Expedición: %s\n", fechaExpi.FormatoFecha(), fechaExpe.FormatoFecha());
    }
}