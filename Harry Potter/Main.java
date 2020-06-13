#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char x[4];
  cin>>x;
  int res=(int)x[0]+(int)x[3]-2*48;
  std::cout<<res;
}