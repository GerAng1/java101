public enum Tarjeta {
    CLASICA(29.00, 47.00),
    ORO(25.00, 45.00),
    PLATINO(16.00, 33.00),
    BLACK(9.90, 26.00);
    
    private final double min;
    private final double max;
    
    Tarjeta(double min, double max){
    this.min = min;
    this. max = max;
    }
    
    public double getMin(){
        return min;
    }
    
    public double getMax(){
        return max;
    }

    public double TIIE(){
        double tiie = (28*100)/360;
        return tiie;
    }
   
    public double TIA(){
        double tia = TIIE() + (max-min);
        
        return tia;
    }
    
    public double TIM(){
        double tim = (TIA()/360) * 30;
        
        return tim;
    }
    
}
