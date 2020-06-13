#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  float y,res=0.0;
  cin>>x>>y;
  if(x<4)
  {
    switch(x)
   {
    case 1:res=y*x;
      		printf("%.2f",res);
      		break;
    case 2:res=y*1.5;
      		printf("%.2f",res);
      		break;
    case 3:res=y*2.0;
      		printf("%.2f",res);
      		break;
  }  
  }
  else
  {
    std::cout<<"Number of items is more";
  }
}