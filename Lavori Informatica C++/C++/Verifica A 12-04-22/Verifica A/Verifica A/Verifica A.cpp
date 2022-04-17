/*Definire una struct casa per memorizzare i dati delle case da parte di un’agenzia
immobiliare, ogni casa è caratterizzata da :
Superficie in metri quadri della casa(numero intero),
la classe energetica(definita da una lettera, dove la A rappresenta la casa a minor
	consumo energetico la F quella a maggior consumo)
	costo in migliaia di euro.
	Chiedere all’utente i dati di quattro case, memorizzarle in un array e poi dire qual è
	quella col minor costo al metro quadro e quella con la migliore classe energetica(in
		caso di parità di livello di classe energetica si riporti quella più grande).
	Si alleghi al seguente documento il codice del progetto e i risultati ottenuti della
	simulazione richiesta.*/

#include <iostream>

using namespace std;



struct Case{
	int superficie;
	char consumo;
	float costo;
	float mq;
};


int main()
{
	//Input dati case
	int i;
	Case Casa[4];
	cout << "Inserisci i seguenti dati delle case" << endl;
	for (i = 0; i < 4; i++) {
		cout << "Inserisci la superficie in metri quadri della casa numero " << i + 1 << endl;
		cin >> Casa[i].superficie;
		cout << "Inserisci il grado energetico (da A a F) della casa numero " << i + 1 << endl;
		cin >> Casa[i].consumo;
		cout << "Inserisci il costo della casa numero " << i + 1 << endl;
		cin >> Casa[i].costo;
	}


	//Calcolo Prezzo al metro quadro
	
	for (i = 0; i < 4; i++) {
		Casa[i].mq = Casa[i].costo / Casa[i].superficie;
	}
	//Scambio per prezzo della casa e Grado Energetico
	Case app;
	for (i = 0; i < 3; i++) {
		for (int j = i + 1; j < 4; j++) {
			if (Casa[i].costo > Casa[j].costo) {
				app = Casa[i];
				Casa[i] = Casa[j];
				Casa[j] = app;
			}
			else if (Casa[i].costo == Casa[j].costo) {
				if (Casa[i].consumo > Casa[j].consumo) {
					app = Casa[i];
					Casa[i] = Casa[j];
					Casa[j] = app;
				}
			}
		}
	}


	//Output dati casa
	for (i = 0; i < 4; i++) {
		cout << "Dati casa numero" << i + 1 << endl;
		cout << "Superficie della casa" << endl;
		cout << Casa[i].superficie << endl;
		cout << "Grado consumo della casa" << endl;
		cout << Casa[i].consumo << endl;
		cout << "Costo della casa" << endl;
		cout << Casa[i].costo << endl;
		cout << "Costo a metro quadro della casa " << endl;
		cout << Casa[i].mq << endl;
	}
}