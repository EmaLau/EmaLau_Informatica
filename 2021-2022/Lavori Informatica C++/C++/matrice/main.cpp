#include <iostream>
using namespace std;




int main(int argc, char** argv) {
	float t[5][5];
	int r=0, c=0;
	float somma_diagonale = 0.0;
	float somma_superiore = 0.0;
	float somma_inferiore = 0.0;
	float somma_totale = 0.0;
	for(int i=0; i<4; i++){
		cout<<"Inserire un numero|Colonna "<<i<<endl;
		cin>>t[r][c];
		for(int j=0; j<4; j++){
		cout<<"Inserire un numero|Riga "<<j<<endl;
		cin>>t[r][c];
				somma_totale=somma_totale+t[r][c];
			if(i==j){ //somma diagonale
				somma_diagonale=somma_diagonale+t[r][c];
			}else{
				if(i<j){//somma superiore
					somma_superiore=somma_superiore+t[r][c];
				}else{//somma inferiore
					somma_inferiore=somma_inferiore+t[r][c];
				}
			}
		}
	}
	cout<<"Somma totale "<<somma_totale<<endl;
	cout<<"Somma diagonale "<<somma_diagonale<<endl;
	cout<<"Somma superiore "<<somma_superiore<<endl;
	cout<<"Somma inferiore "<<somma_inferiore<<endl;
	return 0;
}
