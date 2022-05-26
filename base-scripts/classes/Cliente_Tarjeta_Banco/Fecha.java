public class Fecha{
    private int dia;
    private int mes;
    private int anno;
    
    public Fecha(int dia, int mes, int anio){
        //Revisar si el mes está en el rango
        //Igual para día y año
        this.dia = dia;
        this.mes = mes;
        this.anno = anio;
    }
    
    public String FormatoFecha(){
        return String.format("%2d/%2d/%d", dia, mes, anno);
    }
}