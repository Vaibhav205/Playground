#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,a=0,b=1,t=0;
  cin>>x;
  if(x<3){
    if(x==1)
    {
      cout<<"0";
    }
    else{
      cout<<"1";
    }
  }
  else{
  for(int i=2;i<x;i++)
  {
    t=a;
    a=b;
    b=t+b;
  }
  }
  cout<<b;
}