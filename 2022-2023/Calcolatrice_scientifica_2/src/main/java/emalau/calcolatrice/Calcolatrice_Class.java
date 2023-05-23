package emalau.calcolatrice;


/*
*
*
* Classe per fare le operazioni della calcolatrice
* @author EmaLau
* @Version 1.0
*
*
 */
public class Calcolatrice_Class {

    //Attributes
    private double n1;
    private double n2;
    private String operando;
    private double tot;
    private double sin;
    private double cos;
    private double tan;
    private double sqrt;
    private boolean rad_deg = false;
    //Constructor
    
    public Calcolatrice_Class(){
        
    }
    
    public Calcolatrice_Class(double n1, double n2, String operando){
        this.n1 = n1;
        this.n2 = n2;
        this.operando = operando;
    }
    
    
    //Metods
    public void set_rad_deg(int rad_deg){
        if(rad_deg == 0){
            this.rad_deg = false;
        }else{
            this.rad_deg = true;
        }
    }
    
    
    public void set_sqrt(double sqrt){
        this.sqrt = sqrt;
    }
    
    public double get_sqrt(){
        if(this.rad_deg == false){
         tot = Math.sqrt(sqrt);
         }else{
            tot = Math.toDegrees(Math.sqrt(sqrt));
        }
        return tot;
    }
    
    
    public void set_tan(double tan){
        this.tan = tan;
    }
    
    
    public double get_tan(){
        tot = Math.tan(tan);
        return tot;
    }
    
    
    public void set_sin(double sin){
        this.sin = sin;
    }
    
    public double get_sin(){
        if(this.rad_deg == false){
         tot = Math.sin(sin);
         }else{
            tot = Math.toDegrees(Math.sin(sin));
        }
        return tot;
    }
    
    public void set_cos(double cos){
        this.cos = cos;
    }
    
    public double get_cos(){
        tot = Math.cos(cos);
        tot = Math.toDegrees(tot);
        return tot;
    }
    
    
    
    public void set_n1(double n1) {
        this.n1 = n1;
    }

    public void set_n2(double n2) {
        this.n2 = n2;
    }

    public void set_operando(String operando) {
        this.operando = operando;
    }

    public double get_tot() {
        if (null != operando) {
            switch (operando) {
                case "+" ->
                    tot = n1 + n2;
                case "-" ->
                    tot = n1 - n2;
                case "*" ->
                    tot = n1 * n2;
                case ":" ->
                    tot = n1 / n2;
                default -> {
                }
            }
        }
        return tot;
    }

    public void set_reset(boolean resetting) {
        if (resetting = true) {
            this.n1 = 0;
            this.n2 = 0;
            this.tot = 0;
        }
    }

}
