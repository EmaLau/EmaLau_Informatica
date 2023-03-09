package emalau.try_catch_divisione;

/**
 *
 * @author emala
 */
public class try_catch_class {

    private String num1;
    private String num2;
    private int numero1;
    private int numero2;

    public try_catch_class() {
    }

    public try_catch_class(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getNum2() {
        return num2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        try{
            numero1 = Integer.parseInt(num1);
        }catch(NumberFormatException ex){
        }
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

}
