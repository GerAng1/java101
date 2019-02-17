public class Fraccion {
    protected int num, den;
    
    public Fraccion(int num, int den) throws ArithmeticException{
        if(den == 0)
            throw new ArithmeticException();
        
        if((num < 0 && den < 0) || (num > 0 && den < 0)){
            this.num = (-1*num);
            this.den = (-1*den);
        }
                
        else{
            this.num = num;
            this.den = den;
        }
    }
    public Fraccion(int num){
        this.num = num;
        den = 1;
    }
    public Fraccion(){
        num = 0;
        den = 1;
    }
    
    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }
    
    public double toDouble(){
        return ((double)num/(double)den);
    }
    
    public String toString(){
        return num + "/" + den;
    }
    
    public Fraccion add(Fraccion f){
        Fraccion newFraccion;
        int newNum, newDen;
        
        if(den == f.getDen()){
            newNum = num + f.getNum();
            newDen = den;     
        }
        
        else{
            newDen = den * f.getDen();  
            newNum = (((newDen/den) * num) + ((newDen/f.getDen()) * f.getNum()));
        }
        
        newFraccion = new Fraccion(newNum, newDen);
        return newFraccion;
    }
    
    public Fraccion substract(Fraccion f){
        Fraccion newFraccion;
        int newNum, newDen;
        
        if(den == f.getDen()){
            newNum = num - f.getNum();
            newDen = den;     
        }
        
        else{
            newDen = den * f.getDen();  
            newNum = (((newDen/den) * num) - ((newDen/f.getDen()) * f.getNum()));
        }
        
        newFraccion = new Fraccion(newNum, newDen);
        return newFraccion;
    }
    
    public Fraccion multiply(Fraccion f){
        Fraccion newFraccion;
        int newNum, newDen;
        
        newNum = num * f.getNum();
        newDen = den * f.getDen();
        
        newFraccion = new Fraccion(newNum, newDen);
        return newFraccion;
    }
    
    public Fraccion divide(Fraccion f){
        Fraccion newFraccion;
        int newNum, newDen;
        
        newNum = num * f.getDen();
        newDen = den * f.getNum();
       
        newFraccion = new Fraccion(newNum, newDen);
        return newFraccion;
    }
    
    public Fraccion toLowestTerms(){
        Fraccion reducedF = new Fraccion();
        int gcd;

        if(getNum() == 0)
            return reducedF;
        
        else if(getNum() < getDen()){
            gcd = GCD(getDen(), getNum());
            reducedF = new Fraccion(getNum()/gcd, getDen()/gcd);
            return reducedF;
        }
        
        gcd = GCD(getNum(), getDen());
        reducedF = new Fraccion(getNum()/gcd, getDen()/gcd);
        return reducedF;             
    }
    
    public int GCD(int a, int b) {
        if (b==0) 
            return a;
        
        return GCD(b,a%b);
    }
    
    public boolean equals(Object o){
        
        if(o instanceof Fraccion){
            Fraccion f = (Fraccion)o;
            
            if(num * f.getDen() == den * f.getNum())
                return true;
            
            else
                return false;
        }
        
        else
            return false;
    }
}