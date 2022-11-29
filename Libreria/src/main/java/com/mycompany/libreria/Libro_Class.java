package com.mycompany.libreria;

/**
 *
 * @author Emanuele Lauro
 */
public class Libro_Class {

    //Attributes
    private String titolo;
    private String autore;
    private int numeroPagine;
    private static double costoPagina = 0.05;
    final double COSTO_FISSO = 5.5;

    public Libro_Class(String titolo, String autore, int numeroPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public Libro_Class(Libro_Class libro) {
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.numeroPagine = libro.getNumeroPagine();
    }

    //Metods
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public void setNumeroPagine(int pagine) {
        this.numeroPagine = pagine;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public double prezzo() {
        return COSTO_FISSO + numeroPagine * costoPagina;
    }

    public static void setCostoPagina(double costo) {
        costoPagina = costo;
    }

}
