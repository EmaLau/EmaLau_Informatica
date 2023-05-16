package com.mycompany.calcolatrice_scientifica;

/**
 *
 * @author emalau
 */
public class Calcoli_base {

    //Attributi
    private String n1_string;
    private String n2_string;
    private double n1;
    private double n2;
    private String operando;
    private double tot;
    //Metodi
    public void set_n1(String n1){
        this.n1_string = n1;
    }
    
    public void set_n2(String n2){
        int a = this.n1_string.length() +1;
        this.n2_string = n2;
        String b = this.n2_string.substring(a);
        this.n1 = Double.parseDouble(this.n1_string);
        this.n2 = Double.parseDouble(b);
    }
    
    public void set_operando(String operando) {
        this.operando = operando;
    }
    
    public double get_tot(){
        if(null !=  operando) {
            switch(operando) {
                case "+" ->
                    tot = n1 + n2;
                case "-" ->
                    tot = n1 - n2;
                case "*" ->
                    tot = n1 * n2;
                case "/" ->
                    tot = n1 / n2;
                default -> {
                    \
                }
            }
        }
        return tot;
    }
    
    public void set_reset(boolean resetting) {
        if(resetting == true){
            this.n1 = 0;
            this.n2 = 0;
            this.tot = 0;
            this.n1_string = null;
            this.n2_string = null;
            this.operando = null;
        }
    }

}
