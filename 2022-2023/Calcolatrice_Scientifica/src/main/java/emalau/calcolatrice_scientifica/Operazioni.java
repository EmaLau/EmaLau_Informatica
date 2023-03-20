package emalau.calcolatrice_scientifica;

/**
 *
 * @author emala
 */
public class Operazioni {

    //Attributes
    private double num1;
    private double num2;
    private String segno;
    private double tot;

    //Costructor
    public Operazioni() {
    }

    public Operazioni(double num1, String segno) {
        this.num1 = num1;
        this.segno = segno;
    }
    //Metods

    public void set_num1(double num1) {
        this.num1 = num1;
    }

    public double get_num1() {
        return this.num1;
    }

    public void set_num2(double num2) {
        this.num2 = num2;
    }

    public double get_num2() {
        return this.num2;
    }

    public void set_segno(String segno) {
        this.segno = segno;
    }

    public String get_segno() {
        return this.segno;
    }

    public double get_tot() {
        if (null != segno) {
            switch (segno) {
                case "+" ->
                    tot = num1 + num2;
                case "-" ->
                    tot = num1 - num2;
                case "*" ->
                    tot = num1 * num2;
                case ":" ->
                    tot = num1 / num2;
                default -> {

                }
            }
        }
        return tot;
    }
}
