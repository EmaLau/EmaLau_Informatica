package com.mycompany.pila_esercizio;

/**
 *
 * @author emalau
 */
public class Pila {

    private Nodo head;

    public Pila() {
        head = null;
    }

    public Nodo creaNodo(Invitato persona, Nodo link) {
        Nodo newNodo = new Nodo(persona);
        newNodo.setLink(link);
        return newNodo;
    }

    public void push(Invitato persona) {
        Nodo p;
        p = creaNodo(persona, head);
        head = p;
    }

    public Invitato pop() {
        Nodo p;
        if(head == null)
            return null;
        p = head;
        head = head.getLink();
        return p.getInfo();
    }

    public String toString() {
        Nodo p = head;
        String pila = new String("Head ->");
        if (p == null) {
            return pila + " null";
        }
        while (p != null) {
            pila = pila + "[" + p.getInfo().toString() + "|";
            if (p.getLink() == null) {
                pila = pila + "null]";
            } else {
                pila = pila + "+]-->";
            }
            p = p.getLink();
        }
        return pila;
    }

}
