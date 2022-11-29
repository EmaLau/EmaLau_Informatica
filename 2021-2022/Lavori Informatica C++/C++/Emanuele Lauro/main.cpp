#include <iostream>

using namespace std;


int main(int argc, char** argv) {
	int a;
	int b;
	int c;
	string y;
	cout<<"Inserire il primo numero "<<endl;
	cin>>a;
	cout<<"Inserire il secondo numero "<<endl;
	cin>>b;
	cout<<"Il totale tra i primi due numeri"<<endl;
	cout<<a+b<<endl;
	cout<<"Inserire il terzo numero"<<endl;
	cin>>c;
	cout<<"Il totale è"<<endl;
	cout<<a+b+c<<endl;
	cout<<"Vuoi continuare?"<<endl;
	cout<<"Si oppure no"<<endl;
	cin>>y;
	if (y=="si")
	{
	while(y=="si")
	{
	cout<<"Inserire il primo numero "<<endl;
	cin>>a;
	cout<<"Inserire il secondo numero "<<endl;
	cin>>b;
	cout<<"Il totale tra i primi due numeri"<<endl;
	cout<<a+b<<endl;
	cout<<"Inserire il terzo numero"<<endl;
	cin>>c;
	cout<<"Il totale è"<<endl;
	cout<<a+b+c <<endl;
	cout<<"Vuoi continuare?"<<endl;
	cout<<"Si oppure no"<<endl;
	cin>>y;
	}
}else{
	cout<<"Grazie per aver usato questo programma";
}
	return 0;
}
