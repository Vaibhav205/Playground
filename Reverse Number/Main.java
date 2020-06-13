#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,rev=0,rem=0;
  cin>>n;
  while(n>0)
  {
    rem=n%10;
    rev=rem+rev*10;
    n=n/10;
  }
  cout<<rev;
}