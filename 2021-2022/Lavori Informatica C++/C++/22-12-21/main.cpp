#include <iostream>

using namespace std;

//Scrivi un programma che visualizza i numeri pari multipli di 2 compresi tra n e k dove n e k sono inseriti dall'utente
int main(int argc, char** argv) {
	int k, i;
	int n;
	cout<<"Inserisci il numero iniziale"<<endl;
	cin>>n;
	cout<<"Inserisci il numero finale"<<endl;
	cin>>k;
	while(n<k){
		
		//multiplo di 2
		if(n%2==1){
			n++;
		}else if(n%2==0){
			n=n+2;
		}
		cout<<", "<<n;
	}

	return 0;
}
