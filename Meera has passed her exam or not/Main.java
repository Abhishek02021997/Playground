#include<iostream>
int main()
{
 int arr[10],n,m,flag=0,i;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
std::cin>>arr[i];  
  }
 std::cin>>m;
  
   for(i=0;i<n;i++)
  { 
  if(m==arr[i])
  { flag=1;
     break;}
     else 
       flag=0;
   }
  if(flag==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}