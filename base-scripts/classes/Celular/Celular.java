public class Celular {
    private String numTel;
    private double saldo;
    private String compania;

//las variables de clase
    static double saldoFam;
    static int cuantos;
    //met constructores

    Celular(){
        this("0000000000",0.0, "Libre");
    }

    Celular(String numTel, double saldo, String compania) {
        setNumTel(numTel);
        setSaldo(saldo);
        setCompania(compania);

        if(cuantos==1)
            saldoFam=0.0;
    }

    private void setNumTel(String numTel){
        this.numTel=numTel;
    }
    private void setSaldo(double saldo){
    this.saldo=saldo;
    }
    private void setCompania (String compania){
    this.compania=compania;
    }
    private String getNumTel(){
        return(numTel);
    }
    private double getSaldo(){
        return (saldo);
    }
    private String getCompania(){
        return(compania);
    }

    public void actualizaDatos(String compania, double saldo, String numTel){
        setCompania(compania);
        setSaldo(saldo);
        setNumTel(numTel);
    }

    public double incrementaSaldo(double cuanto){
        double unTemp=0.0;
                unTemp=getSaldo();
                unTemp+=cuanto;
                setSaldo(unTemp);
                return(unTemp);
    }
    public double descuentaSaldo(double cuanto){
        double otroTemp=0.0, temp2=0.0, temp3=0.0;
        otroTemp=getSaldo();

        //checar si hay saldo suficiente
        if(otroTemp>=cuanto){
            otroTemp-=cuanto;
            setSaldo(otroTemp);
        }
        else{
            temp2=saldoFam+otroTemp;
        if(temp2>cuanto){
            temp3=cuanto-otroTemp;
            saldoFam-=temp3;
            otroTemp=0;
            setSaldo(otroTemp);
        }//cierre if si alcanza el saldo+saldofam
        else{
            otroTemp=-1;
        }//cierre de lo qeu hara si no alcanza nada
        }//cierre del else si nuestro saldo no es mayor a la cantidad retirada

        return(otroTemp);
        }

    public String imprimeDatos(){
        String temp="";
        temp="  El numero es: " + getNumTel();
        temp+="\n Tiene un saldo de: " + getCompania();
        temp+="\n Tiene un saldo de: " + getSaldo();
        temp+="\n El Saldo Familiar es: " + saldoFam;
        return(temp);
    }
     public String imprimeFam(){
        String temp="";
        temp="\n El Saldo Familiar es de: " + saldoFam;
        return(temp);
    }
    public double consultaSaldo(){
        double temp=0.0;
        temp=getSaldo();
        return(temp);
    }
    public void depositarFamiliar(double cuantoLePones){
        saldoFam=saldoFam+cuantoLePones;

    }
}
