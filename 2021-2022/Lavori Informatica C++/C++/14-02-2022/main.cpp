#include <iostream>
using namespace std;

double importo( double uno, double due, double tre){
	int impt;
	impt= uno+due+tre;
	return impt;
}


int main(int argc, char** argv) {
	double a, b, c, impt;
	cout<<"Inserire il primo importo"<<endl;
	cin>>a;
	cout<<"Inserire il secondo importo"<<endl;
	cin>>b;
	cout<<"Inserire il terzo importo"<<endl;
	cin>>c;
	cout<<importo(a, b, c)<<" ecco il tuo importo totale";
	return 0;
}
