#include <iostream>
#include<iomanip>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  struct student s;
  cin.getline(s.name,50);
  cin >> s.roll;
  cin>> s.marks;
  cout << endl << "Student Details" << endl;
  cout << "Name: " << s.name << endl;
  cout << "Roll: " << s.roll << endl;
  cout << "Marks: " << s.marks << endl;
  return 0;  
}