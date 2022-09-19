package com.mycompany.televisore;

public class Televisore_Class {

    //Attributes
    private int pollici;
    private String schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminosita;
    private boolean acceso;
    //Metods
    public void set_acceso(String acceso) {
        if ("acceso".equals(acceso)) {
            this.acceso=true;
        } else {
            System.out.println("Il tuo televisore è stato acceso");
            this.acceso = true;
        }
    }

    public boolean get_acceso() {
        return acceso;
    }

    public void set_pollici(int pollici) {
        this.pollici = pollici;
    }

    public int get_pollici() {
        return pollici;
    }

    public void set_schermo(String schermo) {
        this.schermo = schermo;
    }

    public String get_schermo() {
        return schermo;
    }

    public void set_canale(int canale) {
        if (canale < 99 && canale > 0) {
            this.canale = canale;
        } else {
            System.out.println("canale non disponibile, sei stato impostato al canale " + this.canale);
        }
    }

    public int get_canale() {
        return canale;
    }

    public void set_volume(int volume) {
        this.volume = 50;
        if (volume < 100 && volume > 0) {
            this.volume = volume;
        } else {
            System.out.println("Non puoi impostare il volume maggiore di 100 e meno di 0, sei stato impostato a " + this.volume);
        }
    }

    public int get_volume() {
        return volume;
    }

    public void set_luminosita(int luminosita) {
        this.luminosita = 500;
        if (luminosita < 1000 && luminosita > 100) {
            this.luminosita = luminosita;
        } else {
            System.out.println("Non puoi impostare più di 1000 nits e meno di 100 nits sei stato impostato a  " + this.luminosita);
        }
    }

    public int get_luminosita() {
        return luminosita;
    }

    public void set_colore(String colore) {
        this.colore = colore;
    }

    public String get_colore() {
        return colore;
    }

    public String TelevisoreUscita() {
        return "Il tuo Televisore è acceso ed è di colore: " + colore + ", lo schermo dei tuo televisore è " + schermo + ", ed è grande " + pollici + " pollici, hai impostato il canale " + canale + ", il livello del volume è di " + volume + " e la luminosità è impostata su " + luminosita + "nits";
    }
}
