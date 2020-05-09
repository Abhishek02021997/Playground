#include <bits/stdc++.h>
#include<string>
#include<iostream>
using namespace std;
int main()
{
   std:: string str;
  string a;
  std::getline(std:: cin,str);
  cin>>a;
    reverse(str.begin(), str.end());
    if(a==str)
      cout<<"It is correct";

else
cout<<"It is wrong";

}