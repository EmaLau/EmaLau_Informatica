package emalau.libreria_eredita;

/**
 *
 * @author emalau
 */
public class Book_Class {

    private String Autore;
    private String ISBN;
    private String Titolo;
    private int Pagine;
    private String Editore;

    public Book_Class() {

    }

    public Book_Class(String Autore, String ISBN, String Titolo, String Editore, int Pagine) {
        this.Autore = Autore;
        this.ISBN = ISBN;
        this.Titolo = Titolo;
        this.Editore = Editore;
        this.Pagine = Pagine;
    }

    public void setAutore(String Autore) {
        this.Autore = Autore;
    }

    public String getAutore() {
        return Autore;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setTitolo(String Titolo) {
        this.Titolo = Titolo;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setPagine(int Pagine) {
        this.Pagine = Pagine;
    }

    public int getPagine() {
        return Pagine;
    }

    public void setEditore(String Editore) {
        this.Editore = Editore;
    }

    public String getEditore() {
        return Editore;
    }
}
