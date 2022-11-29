/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esercizio_1;



import java.util.*;
/**
 *
 * @author emanuelelauro
 */
public class Esercizio_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primo, secondo;
        System.out.println("Inserisci il primo numero");
        primo = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        secondo = input.nextInt();
        if(primo>secondo)
            System.out.println("Il primo numero è maggiore del secondo numero " + primo +" > "+secondo);
        else
            System.out.println("Il secondo numero è maggiore del primo numero " + primo + " < "+secondo);
    }
}
