#include <iostream>
#include <cmath>
using namespace std;

int main(int argc, char** argv) {
	int n1, n2, n, c, i;
	n1 = 1;
	n2 = 1;
	n = 0;
	c = 2;
	cout<<"Quante volte devo calcolare Fibonacci?"<<endl;
	cin>>i;
	while(c<i)
	{
		n= n1+n2;
		cout<<","<<n;
		n1=n2;
		n2=n;
		c++;
	}
	return 0;
}
