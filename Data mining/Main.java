#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int no,ne=0,pos=0;
  cin>>no;
  while(no>0)
  {
    int n=no%10;
    no=no/10;
    if(n%2==0)
    {
      pos=pos+n;
    }
    else{
      ne=ne+n;
    }
  }
  if(pos==ne)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}