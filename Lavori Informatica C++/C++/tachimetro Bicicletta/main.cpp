#include <iostream>
using namespace std;

double velocita(int g, float d){
	return 3.1416* d * g *6;
}

int main(int argc, char** argv) {
	int giri;
	float diametro;
	cout<<"Inserisci diametro routa in metri"<<endl;
	cin>>diametro;
	cout<<"Inserisci numero giri ruota in 10 secondi"<<endl;
	cin>>giri;
	cout<<"Velocita' calcolata: "<<velocita(giri, diametro)*6.0/100.0<<" km/h"<<endl;	
	return 0;
}
