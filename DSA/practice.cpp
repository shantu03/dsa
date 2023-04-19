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
