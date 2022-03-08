#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int somma, a, i=0;
	for (; somma<1000; i++) {
		cout<<"Metti il numero "<<i+1<<endl;
		cin>>a;
		somma=a+somma;
		cout<<"la somma e':"<<somma<<endl;
	}
	if(somma=1000){
		cout<<"La somma supera il numero 1000 attualmente la somma totale e' "<<somma<<endl;
	}else{
	cout<<"il numero e' stato messo "<<i<<" volte"<<endl;
	cout<<"La somma totale e' "<<somma<<endl;
	}
	return 0;
}
