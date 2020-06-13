#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x=0,t=0;
  float y;
  do{
    cin>>x;
    if(x<0)
    {
      y=y-1;
      break;
    }
    else
    {
      if(x%2!=0)
      {
        t++;
        y=y+1;
      }
      else{
        y=y-0.5;
      }
    }
    
  }while (t<3);
  std::printf("%.1f",y);
}