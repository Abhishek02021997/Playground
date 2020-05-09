#include<iostream>
using namespace std;
int main()
{
 int n,i,a[50],m,x;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  
  cin>>m;
  if(m<=n)
  { for(i=n;i>=m;i--)
  {
    a[i]=a[i-1];
  
  }
  cout<<"Enter the value to insert"<<"\n";
  cin>>x;
 a[m-1] =x;
  
  cout<<"Array after insertion is"<<"\n";
  
   for(i=0;i<n+1;i++)
  {
    cout<<a[i]<<"\n";
  }}
  
  else
    cout<<"Invalid Input";
}