#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int x1=3,x2,y1=4,y2,res;
  std::cin>>x2>>y2;
  int x=abs(x1-x2);
  int y=abs(y1-y2);
  res=sqrt(pow(x,2)+pow(y,2));
  std::cout<<res;
}