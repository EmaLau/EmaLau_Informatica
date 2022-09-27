package com.mycompany.televisore;

public class Televisore_Class {

    //Attributes
    private int pollici;
    private String Schermo;
    private String colore;
    private int canale;
    private int volume;
    private int luminosita;
    private boolean acceso;
    
    public Televisore_Class(int pollici1, String schermo1, String colore1, int canale1, int volume1, int luminosita1, boolean on) {
    this.pollici = pollici1;
    this.Schermo = schermo1;
    this.colore = colore1;
    this.canale = canale1;
    this.volume = volume1;
    this.luminosita = luminosita1;
    this.acceso = on;
    }
    
    //Metods
    
    public void set_acceso(String acceso) {
        if ("acceso".equals(acceso)) {
        } else {
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

    public void set_schermo(String schermo1) {
        this.Schermo = schermo1;
    }

    public String get_schermo() {
        return Schermo;
    }

    public void set_canale(int canale) {
        if (canale < 99 && canale > 0) {
            this.canale = canale;
        }
    }

    public int get_canale() {
        return canale;
    }

    public void set_volume(int volume) {
        this.volume = 50;
        if (volume < 100 && volume > 0) {
            this.volume = volume;
        }
    }

    public int get_volume() {
        return volume;
    }

    public void set_luminosita(int luminosita) {
        this.luminosita = 500;
        if (luminosita < 1000 && luminosita > 100) {
            this.luminosita = luminosita;
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

}
