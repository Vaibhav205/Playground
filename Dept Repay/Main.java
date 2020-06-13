#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,i,y;
  std::cin>>p>>i>>y;
  int si=(p*y*i)/100;
  float d=(si*2.0)/100;
  float f=si+p-d;
  std::cout<<si;
  std::cout<<"\n"<<si+p;
  std::cout<<"\n"<<d;
  std::cout<<"\n"<<f;
}