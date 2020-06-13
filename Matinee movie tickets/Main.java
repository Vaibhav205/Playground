#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  float y;
  cin>>x>>y;
  switch((int)y)
  {
    case 13:
    case 18:
    case 22:if(x>13)
    {
      cout<<"$5.00";
    }else{
      cout<<"$2.00";
    }
      break;
    default:if(x>13)
    {
      cout<<"$8.00";}
      else{
        cout<<"$4.00";}
  }
}