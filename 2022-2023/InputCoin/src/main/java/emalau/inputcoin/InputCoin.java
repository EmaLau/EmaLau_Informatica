package emalau.inputcoin;

/**
 *
 * @author emalau
 */
public class InputCoin {

    public static void main(String[] args) {
        int centesimi = 0;
        double euro = 0.0, totale;
        boolean ok;
        String chi = "";
        ConsoleInput keyboard = new ConsoleInput();
        System.out.println("Quanti centesimi hai?");
        ok = false;
        while(!ok){
            try{
                centesimi = keyboard.readInt();
                ok = true;
            }catch(java.io.IOException exception){
                
            }
        }
    }
}
