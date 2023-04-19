#include<iostream>
#include<stack>
using namespace std;

int main()
{
    stack<int >sh; //HAVE TO DECLARE DATA TYPE IN <> AND AFTER THAT DECLEAR VARIABLE NAME
    int pp[] ={7,0,3,0,2,7,1,2,3,1,};
    cout<<"actual format is :"<<endl;
    for(int i =0;i<size(pp);i++)
    {
        cout<<pp[i]<<"   ";
    }

    cout<<endl<<"After Stack :"<<endl;

    for(int i=0;i<size(pp);i++)
    {
        sh.push(pp[i]);
    }
	cout<<"size of stack is   "<<size(sh)<<endl;
    while(!sh.empty())
    {
        int x= sh.top();
        sh.pop();
        cout<<(x)<<"   ";
    }
cout<<endl;
}
/*
practice-->


#include<stack>
#include<iostream>
int main()
{
std::stack<char>p;

char ii[] {'a','e','i','o','u'};

for(int i=0;i<std::size(ii);i++)
{
p.push(ii[i]);
}
while(!p.empty())
{
char k;
k=p.top();
p.pop();
std::cout<<k<<"  ";
}
std::cout<<std::endl;
}

*/
