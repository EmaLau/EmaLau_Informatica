#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int a[10];
	int massimo, minimo, posm, posn, i;
	//richiesta valori
	cout<<"Inserire valori con numero intero"<<endl;
	for(i=0; i<10; i++){
		cout<<"Inserire valore "<<i<<endl;
		cin>>a[i];
	}
	//calcolo massimo e cerca della posizione del numero massimo
	massimo=a[0];
	for(i=1; i<10; i++){
		if(a[i]>massimo){
			massimo=a[i];
			posm=i;
		}
	}
	//calcolo minimo e cerca della posizione del numero minimo
	minimo=a[0];
	for(i=0; i<10; i++){
		if(a[i]<minimo){
			minimo=a[i];
			posn=i;
		}
	}
	//stampa massimo e minimo con relative posizioni
	cout<<"Il numero massimo e' "<<massimo<<" la sua posizione e' "<<posm<<endl;
	
	cout<<"Il numero minimo e' "<<minimo<<" la sua posizione e' "<<posn<<endl;
	return 0;
}
