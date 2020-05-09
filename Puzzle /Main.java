#include<iostream>
int main()
{
    int a[10][10],b[10][10] ,m,n,i,j;
  std::cin>>m>>n;
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
    std::cin>>a[i][j];
  
 for(i=0;i<2*m;i++)
    for(j=0;j<2*n;j++)
    b[i][j]=a[j][i];
  
  for(i=0;i<n;i++)
   {
    for(j=0;j<m;j++)
   {
     std::cout<<b[i][j]<<" ";
    }
        std::cout<<"\n";
   }
}