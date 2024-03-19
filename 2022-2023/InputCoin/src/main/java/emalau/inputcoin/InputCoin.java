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
        while (!ok) {
            try {
                centesimi = keyboard.readInt();
                ok = true;
            } catch (java.io.IOException exception) {
                System.out.println("Valore non corretto: " + "reinseriscilo!");
            } catch (NumberFormatException exception) {
                System.out.println("Valore non corretto: " + "reinseriscilo!");
            }
        }
        System.out.println("Supponiamo di avere altri 75 centesimi " + "di Euro, quanti Euro sono?");
        ok = false;
        while (!ok) {
            try {
                euro = keyboard.readDouble();
                ok = true;
            } catch (java.io.IOException exception) {
                System.out.println("Valore non corretto: " + "reinseriscilo!");
            } catch (NumberFormatException exception) {
                System.out.println("Valore non corretto: " + "reinseriscilo!");
            }
            if (ok) {
                if (euro != 0.75) {
                    System.out.println("I conti non tornano! Quanti Euro " + "sono 75 centesimi?");
                    ok = false;
                }
            }
        }
        System.out.println("A chi devi questi soldi?");
        try {
            chi = keyboard.readLine();
        } catch (java.io.IOException exception) {
        }
        totale = centesimi * 0.01 + euro;
        System.out.println("Devi " + totale + "� a " + chi);
    }
}
