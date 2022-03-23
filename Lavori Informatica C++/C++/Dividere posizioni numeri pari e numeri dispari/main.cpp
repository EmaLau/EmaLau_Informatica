#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int n, pari, dispari, i, num;
	cout<<"Quanti numeri vuoi inserire?"<<endl;
	cin>>n;
	/*for(i=0; i<n; i++){
		cout<<"Inserisci un numero ";
		cin>>num;
	}*/
	for(i=0; i<n; i=i+2){
		pari=i;
		dispari=i-1;
	}
	cout<<"Numeri dispari"<<endl;
	cout<<dispari<<endl;
	cout<<"Numeri pari"<<endl;
	cout<<pari<<endl;
	return 0;
}
