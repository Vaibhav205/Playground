#include<iostream>
using namespace std;
int main()   
{   
 int i, Number, Sum = 0,x,y ;  
  cin>>x>>y;
  Number=x+y;
 for(i = 1 ; i < Number ; i++)   
  {   
   if(Number % i == 0){   
     Sum = Sum + i ; }
  }    
 if ((Sum%Number)==0) {  
    cout<<"They can read the message";}   
 else{   
    cout<<"They can't read the message";   
 }   
}