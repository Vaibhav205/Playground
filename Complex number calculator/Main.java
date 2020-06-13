#include<iostream>
#include<iomanip>
using namespace std;
void mul();
void add();
void sub();
struct com
{
  int x1, x2, y1, y2;
};
int main()
{
  struct com c;
  int n;
  cin >> n;
  switch(n)
  {
    case 1:add();
      		break;
    case 2:sub();
      		break;
    case 3:mul();
      		break;
    default:cout<< "Invalid choice";
      		exit(0);
  }
}

void add()
{
  com c;
  int x, y;
  cin >> c.x1 >> c.y1;
  cin >> c.x2 >> c.y2;
  x = c.x1 + c.x2;
  y = c.y1 + c.y2;
  cout << x << y << "i";
}

void sub()
{
  com c;
  int x, y;
  cin >> c.x1 >> c.y1;
  cin >> c.x2 >> c.y2;
  x = c.x1 - c.x2;
  y = c.y1 - c.y2;
  cout << x << showpos << y << "i";
}

void mul()
{
  com c;
  int x, y;
  cin >> c.x1 >> c.y1;
  cin >> c.x2 >> c.y2;
  x = c.x1 * c.x2 - c.y1 * c.y2;
  y = c.x1 * c.y2 + c.y1 * c.x2;
  cout << x << showpos << y << "i";
}