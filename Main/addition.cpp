#include<bits/stdc++.h>

using namespace std;

int main()
{
    int a;
    cin>>a;

    int b;
    cin>>b;
    char oper;
    cin>>oper;

    if(oper=='+')
    {
        cout<<a+b;
    }
    else if(oper=='-')
    {
        cout<<a-b;

    }
    else if(oper=='*')
    {
        cout<<a*b;
    }
    else if(oper=='/')
    {
        cout<<a/b;
    }
    else if(oper=='%')
    {
        cout<<a%b;
    }
    else
    {
        cout<<"Invalid arithmetic operators";
    }
}