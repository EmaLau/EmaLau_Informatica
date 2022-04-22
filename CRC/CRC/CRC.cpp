/*Il software deve:
Punto 1 del libro
- dare la scelta di quanti bits trasmettere (da 8 a 32)
- generare una sequenza random di bits da trasmettere
- stampare i dati originali e il polinomio M(x)

Punto 2
- dare la scelta di quale polinomio divisore G(X) utilizzare (stampando i
polinomi riportati dal libro) Punto 3
- generare e stampare il polinomio D(x)Punto 4
- calcolare e stampare il resto della divisione in modulo 2 fra G(X) e D(x)

- definire e stampare il codeword da trasmettere

- generare casualmente due posizioni di bits nei dati da trasmettere, per ognuna
delle due posizioni decidere casualmente, con probabilita' fra 0.1 e 0.3 (valore
esatto scelto da voi) se introdurre un errore invertendo il bit in quella
posizione
- stampare se sono stati introdotti errori e in quale posizione

- scrivere funzione prende in input la codeword/k e stampa se rileva errori o
meno, immediatamente al di sotto della stampa degli errori eventualmente
introdotti del punto precedente
*/


#include <iostream>
#include <string>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

using namespace std;





//Amir e Emanuele
string genera_sequenza_bits_da_trasmettere(int nr_bits) {
    string bits(""); //creando la classe string bits
    int random_bit_value = 0;
    srand(time(NULL));

    for (int i = 0; i < nr_bits; i++) {
        random_bit_value = rand() % 2;
        bits.append(to_string(random_bit_value));
    }
    return bits;
}




int main()
{
    // Emanuele e Amir
    int nr_bits_da_trasmettere, i, somma;
    //cout << "Inserire lunghezza bits da 8 a 32: "; cin >> nr_bits_da_trasmettere;
    nr_bits_da_trasmettere = 8; //Da sistemare dopo
    if (nr_bits_da_trasmettere > 7 && nr_bits_da_trasmettere < 33) 
        cout << "numero bits da trasmettere: " << nr_bits_da_trasmettere << endl;
    else {
        cout << "Numero bits fuori range (8-32): " << nr_bits_da_trasmettere << endl;
        system("pause");
    }
    //Amir e Emanuele
    string Mx("");
    //Emanuele

    Mx = genera_sequenza_bits_da_trasmettere(nr_bits_da_trasmettere);
    cout << ("Bits da trasmettere (generati casualmente): ") << endl;
    for (i = 0; i < nr_bits_da_trasmettere; i++)
        cout << Mx[i];
    cout << endl;


    int bits_zero_da_aggiungere_in_coda = 0;

    switch (nr_bits_da_trasmettere)
    {
    case 8:
        bits_zero_da_aggiungere_in_coda = 3;
        cout << "G(x)=x^3+x+1" << endl;
        for (i = nr_bits_da_trasmettere; i < nr_bits_da_trasmettere + bits_zero_da_aggiungere_in_coda; i++) {
            Mx[i] = 0;
        }
        break;
    default:
        cout << "Caso ancora non implementato";
        break;
    }

    for (i = 0; i < nr_bits_da_trasmettere + bits_zero_da_aggiungere_in_coda; i++) {
        if (i == nr_bits_da_trasmettere)
            cout << "-";
        cout << Mx[i];
    }
    cout << endl;




    
}
