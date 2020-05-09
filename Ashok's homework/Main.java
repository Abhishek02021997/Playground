#include<iostream>
int main()
{
    int a,b,arr3[10][10],i,j;
  std::cin>>a>>b;
  int arr1[10][10];
  int arr2[10][10];
  
  for(i=0;i<a;i++)
 for(j=0;j<b;j++)
  std::cin>>arr1[i][j];
   

 for(i=0;i<a;i++)
 for(j=0;j<b;j++)
   std::cin>>arr2[i][j];
   

for(i=0;i<a;i++)
 for(j=0;j<b;j++) 
   arr3[i][j]=arr1[i][j]+arr2[i][j];
 

  for(i=0;i<a;i++)
  {for(j=0;j<b;j++)
    { 
  std::cout<<arr3[i][j]<<" ";
   
 }
  std::cout<<"\n";}
}