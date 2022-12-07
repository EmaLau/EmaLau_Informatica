package com.mycompany.libreria;

/**
 *
 * @author Emanuele Lauro
 */
public class Book_Class {

    //Attributes
    private String titolo;
    private String autore;
    private String produttore;
    private int numeroPagine;
    private String spn;

    /*
    private static double costoPagina = 0.05;
    final double COSTO_FISSO = 5.5;
     */
    //Costructors
    public Book_Class(String Titolo, String Autore, int Pagine, String Spn, String produttore) {
        this.titolo = Titolo;
        this.autore = Autore;
        this.numeroPagine = Pagine;
        this.spn = Spn;
        this.produttore = produttore;
    }

    public Book_Class(Book_Class Book) {
        this.titolo = getTitolo();
        this.autore = getAutore();
        this.spn = getSpn();
        this.numeroPagine = getNumeroPagine();
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

    public void setSpn(String imei) {
        this.spn = imei;
    }

    public String getSpn() {
        return spn;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setNumeroPagine(int pagine) {
        this.numeroPagine = pagine;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    /*
    public double prezzo() {
        return COSTO_FISSO + numeroPagine * costoPagina;
    }

    public static void setCostoPagina(double costo) {
        costoPagina = costo;
    }
     */
}
