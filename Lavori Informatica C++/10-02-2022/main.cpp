#include <iostream>
#include <math.h>
using namespace std;

double secondi(int l){
	return 6.2832*sqrt(l/9.8);
}


int main(int argc, char** argv) {
	int l=0;
	cout<<"Inserire lunghezza pendolo espresso in metri"<<endl;
	cin>>l;
	cout<<"Velocita' in secondi dell'oscillazione del pendolo"<<secondi(l)<<endl;
	return 0;
}
