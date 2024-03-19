#include <iostream>
#include <math.h>
using namespace std;

int main(int argc, char** argv) {
	int x, x2, x1;
	//a = tipo, b = affollato, c = tempo
	int a, b, c;
	cout<<"Mettere il tipo di abbonamento"<<endl;
	cout<<"Zona Centrale, Periferica e Entrambi"<<endl;
	cin>>a;
	cout<<"In questo momento è l'ora di punta?"<<endl;
	cout<<"Si o No"<<endl;
	cin>>b;
	cout<<"Mettere la durata dell'abbonamento"<<endl;
	cout<<"Settimanale, Mensile oppure Annuale"<<endl;
	cin>>c;
	if (a==1)
	{
		if(c==7)
		{
		x = 10;
		}else{
			if(c==30)
			{
				x=30;
			}else{
				x=250;
			}
		}
	}else if(a==2){
		if(c==7){
			x=5;
		}else{
			if(c==7){
				x=20;
			}else{
			x=150;	
			}
		}
	}else if(c==7){
		x=15;
		}else if (c==30){
		x=40;	
		}else{
			x==300;
		}
	if(b==1){
		x2=x;
	}else{
		x1=(x*20)/100;
		x2=x-x1;
	}
	cout<<x2;
	return 0;
}
