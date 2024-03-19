package com.mycompany.es_33;

public class Persona {

    //Attributes
    private String nome;
    private int eta;
    private String sesso;
    private String professione;

    //Metods
    public Persona(String nome, int eta, String sesso, String professione) {
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.professione = professione;
    }

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    public String getSesso() {
        return sesso;
    }

    public String getProfessione() {
        return professione;
    }

    public String chiSei() {
        return "Sono una persona di nome: " + nome + ", sesso: " + sesso + ", età: " + eta + ", professione: " + professione;
    }

}
