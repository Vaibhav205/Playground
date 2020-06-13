#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,rem=0,rev=0,temp;
  int sum=0;
  cin>>a;
  temp=a;
  while(temp>=1)
  {
    sum+=temp%10;
    temp/=10;
  }
  if(a%sum==0)
  {
    cout<<"Harshad Number";
  }
  else{
    cout<<"Not Harshad Number";
  }
}