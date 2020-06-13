#include<iostream>
using namespace std;
int main()
{
  int x,y,a,c;
  cin>>x>>y;
  cout<<"Enter first number : Enter second number : Menu\n";
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  cin>>a;
  switch(a){
    case 1: c=x+y;
      		cout<<c;
      		break;
    case 2:c=x-y;
      		cout<<c;
      		break;
    case 3:c=x*y;
      		cout<<c;
      		break;
    case 4:c=x/y;
      		cout<<c;
      		break;
    case 5: c=x%y;
      		cout<<c;
      		break;
    default:cout<<"Invalid operation";
      		exit(0);
  }
}