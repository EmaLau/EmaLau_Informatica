package emalau.libreria_eredita;

/**
 *
 * @author emalau
 */
public class Mensola_Class extends Book_Class {

    //Attributes
    private int max_volumi = 15;
    private Book_Class volumi[];

    //Contructor
    public Mensola_Class() {
        volumi = new Book_Class[max_volumi];
    }

    public Mensola_Class(Mensola_Class mensola_class) {
        int posizione;
        volumi = new Book_Class[max_volumi];
        for (posizione = 0; posizione < max_volumi; posizione++) {
            if (mensola_class.getVolume(posizione) != null) {
                volumi[posizione] = mensola_class.getVolume(posizione);
            }
        }
    }

    //metods
    public int setVolume(Book_Class book_class, int posizione) {
        if ((posizione < 0) || (posizione >= max_volumi)) {
            return -1;
        }
        if(volumi[posizione] != null){
            return -2;
        }
        volumi[posizione] = book_class;
        return posizione;
    }
    
    public Book_Class getVolume(int posizione){
        if((posizione < 0) || (posizione>= max_volumi)){
            return null;
        }
        return volumi[posizione];
    }
    
    public int rimuoviVolume(int posizione){
        if((posizione < 0) || (posizione >= max_volumi)){
            return -1;
        }
        if(volumi[posizione] == null){
            return -2;
        }
        volumi[posizione] = null;
        return posizione;
    }
    public int getNumMaxVolumi(){
        int posizione, n =0;
        for(posizione = 0; posizione < max_volumi; posizione++){
            if(volumi[posizione] != null){
                n++;
            }
        }
        return n;
    }
}
