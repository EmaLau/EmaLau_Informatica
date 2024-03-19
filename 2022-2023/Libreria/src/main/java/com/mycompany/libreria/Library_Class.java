package com.mycompany.libreria;

/**
 *
 * @author Emanuele Lauro
 */
public class Library_Class {

    //Attributes
    public static final int max_volumi = 20;
    private Book_Class volumi[];

    //Costructor
    public Library_Class() {
        volumi = new Book_Class[max_volumi];
    }

    public Library_Class(Library_Class library_class) {
        int posizione;
        volumi = new Book_Class[max_volumi];
        for (posizione = 0; posizione < max_volumi; posizione++) {
            if (library_class.getVolume(posizione) != null) {
                volumi[posizione] = library_class.getVolume(posizione);
            }
        }
    }

    //Metods
    public int setVolume(Book_Class book_class, int posizione) {
        if ((posizione < 0) || (posizione >= max_volumi)) {
            return -1;
        }
        if (volumi[posizione] != null) {
            return -2;
        }
        volumi[posizione] = book_class;
        return posizione;
    }

    public Book_Class getVolume(int posizione) {
        if ((posizione < 0) || (posizione >= max_volumi)) {
            return null;
        }
        return volumi[posizione];

    }

    public int rimuoviVolume(int posizione) {
        if ((posizione < 0) || (posizione >= max_volumi)) {
            return -1;
        }
        if (volumi[posizione] == null) {
            return -2;
        }
        volumi[posizione] = null;
        return posizione;
    }

    public int getNumMaxVolumi() {
        return max_volumi;
    }

    public int getNumVolumi() {
        int posizione, n = 0;
        for (posizione = 0; posizione < max_volumi; posizione++) {
            if (volumi[posizione] != null) {
                n++;
            }
        }
        return n;
    }

}
