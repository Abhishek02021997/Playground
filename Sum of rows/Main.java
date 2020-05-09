#include<iostream>
using namespace std;
int main()
{
int a[10][10],i,j,sum=0,m,n;
  cin>>m>>n;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  
  
  for(i=0;i<m;i++)
     
  {
    for(j=0;j<n;j++)

   sum=sum+a[i][j]; 
     cout<<sum<<"\n";
   sum=0;
  }
}