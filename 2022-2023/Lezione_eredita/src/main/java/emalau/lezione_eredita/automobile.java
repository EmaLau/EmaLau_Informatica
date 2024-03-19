package emalau.lezione_eredita;

/**
 *
 * @author emalau
 */
public class automobile extends veicolo {

    private String modello;

    public automobile(String mod) {
        this.modello = mod;
    }

    public automobile(String veicolo, int num_ruote, String mod) {
        super(veicolo, num_ruote);
        this.modello = mod;
    }

    public void set_modello_auto(String mod) {
        this.modello = mod;
    }

    public String get_modello_auto() {
        return this.modello;
    }

    public void set_auto(String veicolo, int num_ruote) {
        set_numero_ruote(num_ruote);
        set_tipo_veicolo(veicolo);
    }

}
