#include<iostream>
int fibonnaci(int);
int main()
{
  int a,b,c;
  std::cin>>a;
  c=a;
  c--;
  b=fibonnaci(c);
  std::cout<<"The term "<<a<<" in the fibonacci series is "<<b;
}
int fibonnaci(int a)
{ 
if(a<=1)
  return a;
 else
   return (fibonnaci(a-1)+fibonnaci(a-2));

}