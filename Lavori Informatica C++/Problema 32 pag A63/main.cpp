#include <iostream>
using namespace std;

int main(int argc, char** argv) {
	int s, c, v;
	s= 0;
	c= 0;
	cout<<"Inserire V"<<endl;
	cin>>v;
	while(v>0)
	{
		c++;
		s == s+v;
		cout<<"Inserire V"<<endl;
		cin>>v;
	}
	cout<<c;
	cout<<s;
	return 0;
}
