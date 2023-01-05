package com.mycompany.televisore;

import java.util.Scanner;

public class Televisore {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Inserisci lo stato del tevisore se è 'acceso' o 'spento', se è spento verrà acceso in automatico");
        String acceso = cin.next();
        boolean on;
        if("acceso".equals(acceso)){
            on= true;
        }else{
            System.out.println("la tua tv sarà accesa");
            on= true;
        }
        System.out.println("inserisci il colore del tuo televisore");
        String colore = cin.next();
        System.out.println("Inserisci quanti pollici è il tuo televisore");
        int pollici = cin.nextInt();
        System.out.println("Inserisci il tipo di schermo del tuo televisore, es LCD, OLED etc");
        String schermo = cin.next();
        System.out.println("Quale canale vuoi impostare? 0-99");
        int canale = cin.nextInt();
        System.out.println("Che volume vuoi impostare? 0-100");
        int volume = cin.nextInt();
        System.out.println("quanti nits di luminosità vuoi impostare? 100-1000");
        int luminosita = cin.nextInt();
        Televisore_Class tv = new Televisore_Class(pollici, schermo, colore, canale, volume, luminosita, on);
        System.out.println("Il tuo Televisore è acceso ed è di colore: " + tv.get_colore() + ", lo schermo dei tuo televisore è " + tv.get_schermo() + ", ed è grande " + tv.get_pollici() + " pollici, hai impostato il canale " + tv.get_canale() + ", il livello del volume è di " + tv.get_volume() + " e la luminosità è impostata su " + tv.get_luminosita() + "nits");

    }
}
