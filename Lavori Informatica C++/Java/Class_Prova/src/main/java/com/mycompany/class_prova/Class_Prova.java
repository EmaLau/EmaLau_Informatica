/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.class_prova;

/**
 *
 * @author EmaLau
 */

import java.util.Scanner;

public class Class_Prova {

    public static void main(String[] args) {
        String eta;
        String nome;
        Scanner myobj = new Scanner(System.in);
       
        System.out.println("Inserisci il nome");
        String Nome_utente = myobj.nextLine();
        if(Nome_utente == "Chiara"){
            System.out.println("Non so cosa scrivere.");
        }
    }
}
