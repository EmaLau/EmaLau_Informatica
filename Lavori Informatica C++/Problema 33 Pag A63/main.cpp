#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int c, k, n, v;
	cout<<"Inserire K"<<endl;
	cin>>k;
	cout<<"Inserire n"<<endl;
	cin>>n;
	while(n>0)
	{
		cout<<"Inserire V"<<endl;
		cin>>v;
		if(v>k)
		c++;
		n--;
	}
	cout<<c;
	return 0;
}
