#include <iostream>
#include <cmath>
using namespace std;

int main(int argc, char** argv) {
	int a, b, c, delta, x1, x2;
	string y;
	cout<<"Inserire la variabile a"<<endl;
	cin>>a;
	cout<<"Inserire la variabile b"<<endl;
	cin>>b;
	cout<<"Inserire la variabile c"<<endl;
	cin>>c;
	delta = (b*b)-(4*a*c);
	if(delta>0)
	{
		x1 = (-b+sqrt(delta))/2*a;
		x2 = (-b-sqrt(delta))/2*a;
		cout<<"x1="<<x1<<endl;
		cout<<"x2="<<x2<<endl;
	} else if(delta=0)
	{
		x1 = (-b+sqrt(delta))/2*a;
		x2 = (-b-sqrt(delta))/2*a;
		cout<<"x1="<<x1<<endl;
		cout<<"x2="<<x2<<endl;
	} else {
		cout<<"Non si può risolvere";
	}
	return 0;
}
