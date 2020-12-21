#include<iostream>

using namespace std;

struct Node
{
    int data;
    Node *next;
    Node(int x) //Constructor
    {
        data=x;
        next=NULL;
    }
};

Node *insertBegin(Node *head, int x)
{
    Node *temp=new Node(x);
    temp->next=head;
    return temp;
}

void printList(Node *head)
{
    Node *curr=head;
    while(curr!=NULL)
    {
        cout<<(curr->data)<<" ";
        curr=curr->next;
    }
}

int main()
{
    Node *head= NULL;
    head = insertBegin(head, 30);
    head = insertBegin(head, 20);
    head = insertBegin(head, 40);
    printList(head);
    return 0;
}