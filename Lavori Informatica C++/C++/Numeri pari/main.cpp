#include <iostream>

using namespace std;

int main(int argc, char** argv) {
	int n, m;
	cout<<"inserire il numero minimo"<<endl;
	cin>> n;
	cout<<"Inserire il numero massimo"<<endl;
	cin>> m;
	if(n%2 != 0)
		n++;
	while(n<m){
		cout<<","<<n;
		n=n+2;
	}
	return 0;
}
