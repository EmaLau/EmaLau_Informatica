package com.mycompany.libro_interrogazione;

public class Libro_Class {

    //Attribute
    private String titolo;
    private String isbn;
    private String autore;

    //Constructor
    Libro_Class() {

    }

    Libro_Class(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    Libro_Class(String titolo, String autore, String isbn) {
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
    }

    //Metods
    public String get_titolo(){
        return titolo;
    }
    public String get_isbn(){
        return isbn;
    }
    public String get_autore(){
        return autore;
    }
    
}
