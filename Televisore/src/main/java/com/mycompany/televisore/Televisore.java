package com.mycompany.televisore;

import java.util.Scanner;

public class Televisore {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Televisore_Class tv = new Televisore_Class();
        System.out.println("Inserisci lo stato del tevisore se è 'acceso' o 'spento', se è spento verrà acceso in automatico");
        tv.set_acceso(cin.next());
        System.out.println("inserisci il colore del tuo televisore");
        tv.set_colore(cin.next());
        System.out.println("Inserisci quanti pollici è il tuo televisore");
        tv.set_pollici(cin.nextInt());
        System.out.println("Inserisci il tipo di schermo del tuo televisore, es LCD, OLED etc");
        tv.set_schermo(cin.next());
        System.out.println("Quale canale vuoi impostare? 0-99");
        tv.set_canale(cin.nextInt());
        System.out.println("Che volume vuoi impostare? 0-100");
        tv.set_volume(cin.nextInt());
        System.out.println("quanti nits di luminosità vuoi impostare? 100-1000");
        tv.set_luminosita(cin.nextInt());

        System.out.println("Il tuo Televisore è acceso ed è di colore: " + tv.get_colore() + ", lo schermo dei tuo televisore è " + tv.get_schermo() + ", ed è grande " + tv.get_pollici() + " pollici, hai impostato il canale " + tv.get_canale() + ", il livello del volume è di " + tv.get_volume() + " e la luminosità è impostata su " + tv.get_luminosita() + "nits");

    }
}