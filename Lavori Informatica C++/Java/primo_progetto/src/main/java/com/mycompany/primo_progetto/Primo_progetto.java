/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primo_progetto;

import java.util.Scanner;
        
        
public class Primo_progetto {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Inserire il nome");
        String nome = cin.nextLine();
        System.out.println("Inserire il Cognome");
        String cognome = cin.nextLine();
        System.out.println("Ciao "+nome+" "+cognome);
    }
}
