#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  float x,y,x1,y1;
  std::cin>>x>>y>>x1>>y1;
  int q=y1/6;
  int r=(int(y1)%6);
  float to=x/6;
  std::cout<<to;
  float tof=q+r*0.1;
  std::cout<<fixed<<setprecision(1)<<"\n"<<tof;
  float cr=x1/tof;
  std::cout<<fixed<<setprecision(1)<<"\n"<<cr;
  float rr=y/to;
  std::cout<<fixed<<setprecision(1)<<"\n"<<rr;
  if(rr<cr)
  {
    std::cout<<"\nEligible to Win";
  }
  else
  {
    std::cout<<"\nNot Eligible to Win";
  }
}