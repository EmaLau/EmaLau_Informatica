package com.mycompany.televisore;

import java.util.Scanner;

public class Televisore {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Televisore_Class tv = new Televisore_Class();
        System.out.println("Inserisci lo stato del tevisore se è 'acceso' o 'spento'");
        tv.set_acceso(cin.next());
        System.out.println("inserisci il colore del tuo televisore");
        tv.set_colore(cin.next());
        System.out.println("Inserisci quanti pollici è il tuo televisore");
        tv.set_pollici(cin.nextInt());
        System.out.println("Inserisci il tipo di schermo del tuo televisore, es LCD, OLED etc");
        tv.set_schermo(cin.next());
        System.out.println("Quale canale vuoi impostare?");
        tv.set_canale(cin.nextInt());
        System.out.println("Che volume vuoi impostare?");
        tv.set_volume(cin.nextInt());
        System.out.println("quanti nits di luminosità vuoi impostare?");
        tv.set_luminosita(cin.nextInt());

        System.out.println(tv.TelevisoreUscita());
    }
}
