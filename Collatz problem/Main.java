#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,count=0;
  cin>>a;
  cout<<a<<"\n";
    while(a>1)
    {
      if(a%2==0)
      {
        a=a/2;
        cout<<a<<"\n";
        count++;
    }
      else
      {
        a=3*a+1;
        cout<<a<<"\n";
        count++;
      }
  }
 cout<<count;
 }