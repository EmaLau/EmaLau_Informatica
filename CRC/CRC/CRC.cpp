#include <iostream>
#include <stdlib.h>
#include <time.h>
#include <cstdlib>
#include <string>
#include <math.h>


using namespace std;



void genera_bits_da_trasmettere(int Mx[], int bits) {
    int valore_bit = 0;
    srand(time(NULL));
    for (int i = 0; i < bits; i++) {
        valore_bit = rand() % 2;
        Mx[i] = valore_bit;
    }
}



int main()
{
    int bit_da_trasmettere, i, somma;

    //cout << "Inserire bit da 8 a 32: ";
    //cin >> bit_da_trasmettere;
    bit_da_trasmettere = 8;//Da sistemare
    if (bit_da_trasmettere > 7 && bit_da_trasmettere < 33) {
        cout << "Bit corretti";
    }
    else {
        cout << "Bit scorretti";
        system("pause");
    }

    //Genera Bits
    int Mx[128];
    genera_bits_da_trasmettere(Mx, bit_da_trasmettere);


    cout << "Bit" << endl;
    cout << bit_da_trasmettere << endl;
    cout << "Bit generato" << endl;
    for (int i = 0; i < bit_da_trasmettere; i++) {
        cout << Mx[i];
    }
    cout << "" << endl;
    int bit_da_aggiungere_in_coda = 0;
    switch (bit_da_trasmettere) {
    case 8:
        bit_da_aggiungere_in_coda = 16;
        cout << "G(x)=x^16+x^12+x^5+1" << endl;
        for (i = bit_da_trasmettere; i < bit_da_trasmettere + bit_da_aggiungere_in_coda; i++) {
            Mx[i] = 0;
        }
        break;
    default:
        cout << "Caso ancora non implementato" << endl;
        break;
    }
    for (i = 0; i < bit_da_trasmettere + bit_da_aggiungere_in_coda; i++) {
        if (i == bit_da_trasmettere) {
            cout << "-";
        }
        cout << Mx[i];
    }
}
