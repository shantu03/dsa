#include<iostream>
#include<stack>
using namespace std;

int main()
{
    stack<char >sh; //HAVE TO DECLARE DATA TYPE IN <> AND AFTER THAT DECLEAR VARIABLE NAME
    char pp[]={'f','q','i','a','u'};
    cout<<"actual format is :"<<endl;
    for(int i =0;i<5;i++)
    {
        cout<<pp[i]<<"\t";
    }

    cout<<endl<<"After Stack :"<<endl;

    for(int i=0;i<5;i++)
    {
        sh.push(pp[i]);
    }

    while(!sh.empty())
    {
        int x= sh.top();
        sh.pop();
        cout<<char(x)<<"\t";
    }

}