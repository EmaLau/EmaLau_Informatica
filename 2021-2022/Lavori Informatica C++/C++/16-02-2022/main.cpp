/*creare una funzione che legga un vettore di n elementi e ne restituisca la somma di tutti gli elementi, il valore più piccolo e il valore più grande.
i risultati devono essere stampati a video.*/

#include <iostream>
using namespace std;

void minmag(int n, int i, int &nmin, int &nmag, int inserire[], int &somma){
	for(i=0; i<n; i++){
		somma=somma+inserire[i];
		if(nmag>inserire[i])
			nmag=inserire[i];
		else if(nmin<inserire[i])
			nmin=inserire[i];
	}
}



int main(int argc, char** argv) {
	int n, i, nmin, nmag, inserire, somma;
	cout<<"Quanti numeri vuoi mettere?"<<endl;
	cin>>n;
	for(i=0; i<n; i++){
		cout<<"Inserisci il numero"<<endl;
		cin>>inserire;
	};
	minmag(n, i, nmin, nmag, inserire, somma);
	cout<<nmin<<endl;
	cout<<nmag<<endl;
	cout<<somma;
	return 0;
}
