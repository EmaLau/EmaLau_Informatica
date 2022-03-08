#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int a, c, i, b, nmax=0, nmin=0;
	do{
	i++;
	cout<<"Inserisci il primo numero"<<endl;
	cin>>a;
	cout<<"Inserisci il secondo numero"<<endl;
	cin>>b;
	if(a>b){
		c=a;
		a=b;
		b=c;
	}
	//nmax
	if(a>nmax){
		nmax=a;
	}else if(b>nmax){
		nmax=b;
	}
	//nmin
	if(i==1){
	nmin=a;
	}else if(a<nmin && a!=0 && b!=0){
		nmin=a;
	}
	
	}while(0!=a && b);
	cout<<nmin<<"e' il numero piu' piccolo"<<endl;
	cout<<nmax<<"e' il numero piu' grande"<<endl;
	return 0;
}
