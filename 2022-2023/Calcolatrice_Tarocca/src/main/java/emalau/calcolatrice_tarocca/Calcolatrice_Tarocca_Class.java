package emalau.calcolatrice_tarocca;

/**
 *
 * @author emalau
 */
public class Calcolatrice_Tarocca_Class {

    private double num1;
    private double num2;
    private String total;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public String getTotal() {
        try {
            return Double.toString(num1 / num2);
        } catch (ArithmeticException exception) {
            return "impossibile fare " + num1 + "/" + num2;
        }
    }

}
