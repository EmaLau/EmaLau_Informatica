package emalau.verifica_15_11_2022;

public class Verifica_15_11_2022_Class {

    //Attributes
    private double n1;
    private double n2;
    private String operando;
    private double totale;

    //Metods
    public void set_n1(double n1) {
        this.n1 = n1;
    }
        public double get_n1(){
        return n1;
    }

    public void set_n2(double n2) {
        this.n2 = n2;
    }
    public double get_n2(){
        return n2;
    }
    public void set_operando(String operando) {
        this.operando = operando;
    }

    public double get_totale() {
        if (operando == "*") {
            totale = n1 * n2;
        } else if (operando == "/") {
            totale = n1 / n2;
        }

        return totale;
    }

}
