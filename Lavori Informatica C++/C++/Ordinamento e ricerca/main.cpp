#include <iostream>
using namespace std;

void scambio (int &x, int &y){
	int z;
	z=x;
	x=y;
	y=z;
};
void exchangeShort (int vet[], int b){
	int i, j;
	for( i=0; i<b-1; i++)
		for(j=j+1; j<b; j++)
			if(vet[i]>vet[j])
				scambio(vet[i], vet[j]);
};

int main(int argc, char** argv) {
	int vet, i, b;
	cout<<"Quanti numeri devi riordinare?"<<endl;
	cin>>b;
	for(i=0; i<b; i++){
		cout<<"Inserisci un numero"<<endl;
		cin>>vet;
	};
	exchangeShort(vet, b);
	for(i=0; i<b; i++){
		cout<<vet<<endl;
	};
	return 0;
}
