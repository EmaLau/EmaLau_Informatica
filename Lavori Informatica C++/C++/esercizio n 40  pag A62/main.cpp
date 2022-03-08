#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char** argv) {
	int n, p, s, d, md, c;
	c=1;
	cout<<"Inserire il numero dei valori di sequenza elaborata"<<endl;
	cin>>n;
	cout<<"Primo valore"<<endl;
	cin>>p;
	cout<<"Secondo valore"<<endl;
	cin>>s;
	d=s-p;
	md=s-p;
	n=n-2;
	while(n>=0)
	{
		p=s;
		cout<<"Inserire il valore successivo"<<endl;
		cin>>s;
	if(d=s-p){
		c=0;
		d=s-p;
		if(d>md){
			md=d;
			}
		}
	n--;
	}
	if(c=1){
		cout<<"Differenza costante"<<endl;
		cout<<d;
	}else{
		cout<<"massima differenza"<<endl;
		cout<<md;
	}
	
	return 0;
}
