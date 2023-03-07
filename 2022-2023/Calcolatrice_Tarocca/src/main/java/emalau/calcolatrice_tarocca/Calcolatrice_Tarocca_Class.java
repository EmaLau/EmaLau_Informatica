package emalau.calcolatrice_tarocca;

/**
 *
 * @author emalau
 */
public class Calcolatrice_Tarocca_Class {

    private int num1;
    private int num2;
    private String total;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public String getTotal() {
        try {
            return Integer.toString(num1 / num2);
        } catch (ArithmeticException exception) {
            return "impossibile fare " + num1 + "/" + num2;
        }
    }

}
