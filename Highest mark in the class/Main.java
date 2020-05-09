#include<iostream>
int main()
{
  int n,i,max=0;
  std::cin>>n;
  int marks[20];
  for(i=0;i<n;i++)
  {
  std::cin>>marks[i];
  }
  max=marks[0];
    for(i=1;i<n;i++)
    {  if(marks[i]>max)
       max=marks[i]; 
    }
  std::cout<<max;
}