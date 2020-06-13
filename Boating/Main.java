#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,x,y;
  std::cin>>w>>x>>y;
  int res=(x*75)+(y*30);
  if(res<w)
  {
    std::cout<<"Boat is stable";
  }
  else
  {
    std::cout<<"Boat will drow";
  }
  
}