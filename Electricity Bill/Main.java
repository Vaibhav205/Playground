#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,res;
  std::cin>>x;
  if(x<=200)
  {
    res=x*0.5;
  }
  else if(x<=400)
  {
    res=x*0.65+100;
  }
  else if(x<=600)
  {
    res=x*0.8+200;
  }
  else
  {
    res=x*1.25+425;
  }
  std::cout<<"Rs."<<res;
}