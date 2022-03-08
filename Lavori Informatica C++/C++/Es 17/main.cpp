#include <iostream>
using namespace std;

double velocita(int g, float d){
	return 3.1416 * d * g *6;
}

int main(int argc, char** argv) {
	int giri;
	float diametro;
	cout<<"Inserisci il diametro espresso in metri"<<endl;
	cin>>diametro;
	cout<<"Inserisci il numero di ruota fatti in 10s"<<endl;
	cin>>giri;
	cout<<"Velocita' calcoalta "<<velocita(giri, diametro)*6/100<<"km/h"<<endl;
	return 0;
}
