#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int n, i;
	struct libro{
		int codice;
		int pagine;
		float costo;
	}libro;
	cout<<"Quanti libri devi dichiarare?"<<endl;
	cin>>n;
	for(i=0; i<n; i++){
		cout<<"Libro "<<i+1<<endl;
		cout<<"inserire codice libro"<<endl;
		cin>>libro.codice;
		cout<<"Inserire pagine del libro"<<endl;
		cin>>libro.pagine;
		cout<<"Inserire costo libro"<<endl;
		cin>>libro.costo;
	}
	for(i=0; i<n; i++){
		cout<<"Libro "<<i+1<<endl;
		cout<<"Identificativo del libro "<<libro.codice<<endl;
		cout<<"pagine del libro "<<libro.pagine<<endl;
		cout<<"Costo del libro "<<libro.costo<<endl;
	}
	return 0;
}
