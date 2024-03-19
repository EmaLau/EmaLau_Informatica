package emalau.lezione_eredita;

/**
 *
 * @author emalau
 */
public class veicolo {

    private String tipo_veicolo;
    private int numero_ruote;

    public veicolo() {

    }

    public veicolo(String tipo_veicolo, int num_ruote) {
        this.tipo_veicolo = tipo_veicolo;
        this.numero_ruote = num_ruote;
    }

    public void set_tipo_veicolo(String tipo_veicolo) {
        this.tipo_veicolo = tipo_veicolo;
    }

    public String get_tipo_veicolo() {
        return this.tipo_veicolo;
    }

    public void set_numero_ruote(int num_ruote) {
        this.numero_ruote = num_ruote;
    }

    public int get_numero_ruote() {
        return this.numero_ruote;
    }
}
