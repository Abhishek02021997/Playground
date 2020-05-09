#include<iostream>
using namespace std;
int main()
{
  int i,n,a[10],x=0,y=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
  cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  if(a[i]%2==0)
    x=a[i]+x;
    if(a[i]%2!=0)
    y=a[i]+y;  
  }
  cout<<"The sum of the even numbers in the array is "<<x<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<y;
  
}