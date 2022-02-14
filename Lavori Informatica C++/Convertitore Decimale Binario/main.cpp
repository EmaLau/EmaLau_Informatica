#include <iostream>
#include <math.h>

using namespace std;

int main(int argc, char** argv) {
	int n;
	string b;
	b="";
	cout<<"numero da convertire"<<endl;
	cin>>n;
	while(n>0){
		if(n%2==0)
			b='0'+b;
		else
			b='1'+b;
		n=n/2;
	}
	cout<<n;
	return 0;
}
