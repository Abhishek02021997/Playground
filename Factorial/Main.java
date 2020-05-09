#include<iostream>
int fact(int);
int main()
{
  int a,b;
  std::cin>>a;
  b=fact(a);
  std::cout<<"The factorial of "<<a<<" is "<<b;
  return 0;
}
int fact(int a)
{
int m;
  if(a>0)
  { m=a*fact(a-1);
  return m;}
  else
   return 1;
}