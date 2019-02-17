public class Canguro {
    private int vel, inicio;
    private String nombre;

public Canguro(String nombre){
    this.nombre = nombre;

}

public void comparar(Canguro otro){
    Boolean bool = false;
    int espacio, espacio2, pos = 0;

    for(int cont = 0; ; cont++){
        espacio = inicio + (vel*cont);
        espacio2 = otro.inicio + (otro.vel*cont);

        if(espacio == espacio2){
            bool = true;
            pos = cont;
            break;
        }

        else if (vel>otro.vel && inicio>otro.inicio)
            break;

        else if (vel<otro.vel && inicio<otro.inicio)
            break;

        else if (espacio>espacio2 && vel>otro.vel)
            break;

        else if (espacio<espacio2 && vel<otro.vel)
            break;

    }

    if(bool == true)
        System.out.printf("%n%n Concuerdan en el espacio %d.", (pos));

    else if (bool == false)
        System.out.println("\n\n No concuerdan");

}

public void setVel(int vel){
    this.vel = vel;
}

public void setInicio(int inicio){
    this.inicio = inicio;
}

public int getVel(){
    return vel;
}

public int getInicio(){
    return inicio;
}

}
