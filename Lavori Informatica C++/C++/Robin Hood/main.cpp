#include <iostream>
using namespace std;
double robinHood(float &a, float &b){
	a=(a+b)/2;
	b=a;
}
int main(int argc, char** argv) {
	float x, y;
	cout<<"Quanti soldi ha il primo uomo a cui Robin deve dare i soldi?"<<endl;
	cin>>x;
	cout<<"Quanti soldi ha il secondo uomo a cui Robin deve dare i soldi?"<<endl;
	cin>>y;
	cout<<"x ha il valore di "<<x<<endl;
	cout<<"y ha il valore di "<<y<<endl;
	robinHood(x,y);
	cout<<x<<"-"<<y;
	return 0;
}
