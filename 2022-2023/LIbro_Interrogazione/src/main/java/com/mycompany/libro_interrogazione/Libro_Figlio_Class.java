package com.mycompany.libro_interrogazione;

public class Libro_Figlio_Class {
    //Attributes
    private String genere;
    private int n_page;
    private Libro_Class Padre;
    //metods
    Libro_Figlio_Class(String genere, int n_page){
        this.genere = genere;
        this.n_page = n_page;
    }
    
    public String get_genere(){
        return genere;
    }
    
    public int get_n_page(){
        return n_page;
    }
    
     
    
     
}
