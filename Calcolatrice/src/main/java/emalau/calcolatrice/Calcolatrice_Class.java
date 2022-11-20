package emalau.calcolatrice;

public class Calcolatrice_Class {

    //Attributes
    private double n1;
    private double n2;
    private String operando;
    private double tot;

    //Metods
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
        if (null != operando) switch (operando) {
            case "+" -> tot = n1 + n2;
            case "-" -> tot = n1 - n2;
            case "*" -> tot = n1 * n2;
            case ":" -> tot = n1 / n2;
            default -> {
            }
        }
        return tot;
    }
    public void set_reset(boolean resetting){
        if(resetting = true){
            this.n1 = 0;
            this.n2 = 0;
            this.tot = 0;
        }
    }

}
