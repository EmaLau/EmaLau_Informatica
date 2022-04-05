#include <iostream>
#include <string>
using namespace std;
	
	
	struct libro{
		int codice;
		int pagine;
		float costo;
		char autore[50];
		char titolo[50];
	};
int main(int argc, char** argv) {
	int n, i;
	float totale;
	cout<<"Quanti libri devi dichiarare?"<<endl;
	cin>>n;
	libro libri[n];
	for(i=0; i<n; i++){
		cout<<"Libro "<<i+1<<endl;
		cout<<"Inserire titolo del libro"<<endl;
		cin>>libri[i].titolo;
		cout<<"Inserire autore del libro"<<endl;
		cin>>libri[i].autore;
		cout<<"inserire codice del libro"<<endl;
		cin>>libri[i].codice;
		cout<<"Inserire pagine del libro"<<endl;
		cin>>libri[i].pagine;
		cout<<"Inserire costo libro"<<endl;
		cin>>libri[i].costo;
		
	}
	for(i=0; i<n; i++){
		if(libri[i].titolo[0]>libri[i+1].titolo[0]){
			app= libri[i].titolo[0];
			libri[i].titolo[0] = libri[i+1].titolo[0];
			libri[i+1].titolo[0]=app;
		}
	}
	for(i=0; i<n; i++){
		cout<<"Libro "<<i+1<<endl;
		cout<<"Titolo "<<libri[i].titolo<<endl;
		cout<<"Autore "<<libri[i].autore<<endl;
		cout<<"Identificativo del libro "<<libri[i].codice<<endl;
		cout<<"pagine del libro "<<libri[i].pagine<<endl;
		cout<<"Costo del libro "<<libri[i].costo<<endl;
		totale=libri[i].costo+totale;
	}
	cout<<"Costo totale dei libri "<<totale<<endl;
	return 0;
}
