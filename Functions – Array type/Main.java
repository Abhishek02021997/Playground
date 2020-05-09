#include<iostream>
using namespace std;
int main()
{
  int a[50],i,n,odd=0,even=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++)
    cin>>a[i];
   for(i=0;i<n;i++)
   {
  if(a[i]%2==0)
    even++;
     if(a[i]%2!=0)
       odd++;
   }
  if(even!=0 && odd==0)
    cout<<"The array is Even";
  if(odd!=0 && even==0)
    cout<<"The array is Odd";
   if(odd!=0 && even!=0)
    cout<<"The array is Mixed";
  
}