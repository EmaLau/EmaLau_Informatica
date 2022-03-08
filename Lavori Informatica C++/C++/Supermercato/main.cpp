/*Un supermercato effettua lo sconto in base l'importo totale della spesa. La tabella sconti è riportata di seguito. Scrivi un programma che, inserendo l'importo totale degli acquisti, visualizza lo sconto e l'importo netto da pagare. 


Spesa<50€  ---5%
Spesa<65€  ---6%
Spesa<80€  ---7%
Oltre 80€     ---10%*/
#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int acquisti;
	float netto;
	float somma;
	float sconto;
	float n;
	cout<<"Quanti articoli hai?"<<endl;
	cin>>acquisti;
	for (int i=0; i<acquisti; i++) {
	//richiesta numero
	cout<<"Inserire il prezzo dell'articolo numero "<<i+1<<endl;
	cin>>n;
	//somma attuale
	cout<<"La somma della spesa e' "<<endl;
	cout<<n<<"+"<<somma<<"=";
	somma=n+somma;
	cout<<somma<<endl;
	}
	if(somma<50){
		sconto=(somma*5)/100; //sconto 5%
	}else if(somma<=65){
		sconto=(somma*6)/100; //sconto 6%
	}else if(somma<=80){
		sconto=(somma*7)/100; //sconto 7%
	}else{
		sconto=(somma*10)/100; //sconto 10%
	}
	netto=somma-sconto;
	cout<<"Scontrino"<<endl;
	cout<<"La somma della sua spesa composta da "<<acquisti<<" articoli e': "<<somma<<"€"<<endl;
	cout<<"il prezzo con lo sconto e': "<<netto<<"€"<<endl;
	return 0;
}
