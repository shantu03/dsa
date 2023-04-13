#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node *next;
    node(int data)
    {
        this->data=data;
        this->next=NULL;

    }

};
int main()
{
    node *head=new node(5);
    node *tail=head;
    for(int i=0;i<4;i++)
    {
        tail->next=new node(6+i);
        tail=tail->next;
    }
    while(head!=NULL)
    {
        cout<<head->data<<"\t";
        head=head->next;
    }
}