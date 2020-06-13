#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s[5];
  int a;
  cin>>s;
  cin>>a;
  char f[]="front";
  char r[]="rear";
  if((a==1 && !strcmp(s,r))||(a==0 && !strcmp(s,f)))
  {
    cout<<"Right Handed";
  }
  else
  {
    cout<<"Left Handed";
  }
}