/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esercizio_2;


import java.util.*;

/**
 *
 * @author emanuelelauro
 */
public class Esercizio_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eta;
        System.out.println("Inserisci la tua età");
        eta = input.nextInt();
        if(eta >= 18)
            System.out.println("La tua età è maggiore di 18, hai "+eta+" Anni");
        else
            System.out.println("La tua età è minore di 18, hai "+eta+" Anni");
    }
}
