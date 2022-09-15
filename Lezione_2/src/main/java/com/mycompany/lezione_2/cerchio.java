
package com.mycompany.lezione_2;

public class cerchio {
    //Attributi
    
    private double raggio;
    private double diametro;
    private double perimetro;
    //Metodi
    
    public void set_raggio(double r){
        raggio=r;
    }
    
    public double diametro(){
        diametro= raggio*2;
        return (diametro);
    }
    
    public double area(){
        return (raggio*raggio*Math.PI);
    }
    
    public double perimetro(){
        return(diametro*Math.PI);
    }
    
}
