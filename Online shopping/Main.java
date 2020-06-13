#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z;
  int x1,y1,z1;
  int x2,y2,z2;
  cin>>x>>y>>z;
  cin>>x1>>y1>>z1;
  cin>>x2>>y2>>z2;
  int res=x-(x*y/100)+z;
  int res1=x1-(x1*y1/100)+z1;
  int res2=x2-x2*y2/100+z2;
  cout<<"In Flipkart Rs."<<res;
  cout<<"\nIn Snapdeal Rs."<<res1;
  cout<<"\nIn Amazon Rs."<<res2;
  if(res<res1&&res<res2||(res==res1&&res<res2))
  {
    cout<<"\nHe will prefer Flipkart";
  }
  else if(res1<res&&res1<res2)
  {
    cout<<"\nHe will prefer Snapdeal";
  }
  else
  {
    cout<<"\nHe will prefer Amazon";
  }
}