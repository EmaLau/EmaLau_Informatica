#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int main(int argc, char** argv) {
	int v;
	float f, s;
	char cs1;
	string cs, e;

	cout<<"Inserire la velocità del veicolo"<<endl;
	cin>>v;
	cout<<"Inserire le condizioni stradali dell'asfalto ruvido, liscio, bagnato, ghiacciato."<<endl;
	cin>>cs;
	if(cs == "ghiacciato")
		cs1= 'G';
	else if (cs == "bagnato")
		cs1= 'B';
	else if (cs=="liscio")
		cs1= 'L';
	else if (cs=="ruvido")
		cs1= 'R';
	else if(cs!="ghiacciato", "bagnato", "liscio", "ruvido")
		cs1= 'E';
	switch(cs1)
	{
		case 'G':
		{  
			f = 0.1;
			break;
		} 
	
		case 'B' : 
		{
			f = 0.4;
			break;
		}
		case 'L':
		{
			f = 0.5;
			break;
		}
		case 'R' :
		{
			f= 0.6;
			break;
		}
		case 'E':
		{
			e= "Error";
		}
	}
	if(f){
	s=(v*v)/250*f;
	cout<<s;
	}else{
		cout<<e;
	}
	return 0;
}
