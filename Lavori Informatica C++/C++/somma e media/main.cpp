#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int n, n2;
	float media=0, somma=0;
	cout<<"quanti numeri vuoi mettere in input?"<<endl;
	cin>>n;
	for (int i=0; i<n; i++) {
		//richiesta numero
		cout<<"Inserire il numero "<<i+1<<endl;
		cin>>n2;
		//somma attuale
		cout<<"La somma attuale e' "<<endl;
		cout<<n2<<"+"<<somma<<"=";
		somma=n2+somma;
		cout<<somma<<endl;
		//la media attuale
		media=somma/(i+1);
		cout<<"la media attuale e' "<<endl;
		cout<<media<<endl;
	}
	cout<<"--------------------------------"<<endl;
	//somma totale
	cout<<"La somma totale e' "<<endl;
	cout<<somma<<endl;
	//media totale
	media = somma/n;
	cout<<"la media totale e' "<<endl;
	cout<<media<<endl;
	return 0;
}
