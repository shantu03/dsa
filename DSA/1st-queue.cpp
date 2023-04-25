#include<iostream>
#include<queue>
using namespace std;
int main()
{
    queue<char>sh;
    char pp[]={'f','e','a','c','u'};
    cout<<"before queue :\n";
        for(int i=0;i<5;i++)
    {
        cout<<pp[i]<<"\t";
    }
        cout<<"\n after queue :\n";

    for(int i=0;i<5;i++)
    {
        sh.push(pp[i]);
    }
    
    while(!sh.empty())
    {
        int x =sh.front();
        sh.pop();
        cout<<char(x)<<"\t";
    }
}