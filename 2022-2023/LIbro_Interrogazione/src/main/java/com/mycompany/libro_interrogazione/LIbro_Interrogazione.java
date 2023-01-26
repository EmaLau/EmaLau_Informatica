package com.mycompany.libro_interrogazione;

public class LIbro_Interrogazione {

    public static void main(String[] args) {
        //Input dati
        String titolo = "Informatica";
        String autore = "D'Amico";
        String isbn = "385-...";
        String genere = "Fantasy";
        int n_page = 25;

        //Costruttori
        Libro_Class Libro = new Libro_Class(titolo, autore);
        Libro_Class Libro_2 = new Libro_Class(titolo, autore, isbn);
        Libro_Figlio_Class Libro_3 = new Libro_Figlio_Class(genere, n_page);
        
        System.out.print(Libro_3.get_genere());
    }
}
