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

Node *deleteBegin(Node *head)
{
    if(head==NULL)
    {
        return NULL;
    }
    Node *temp=head->next;
    delete head;     //Deallocating head
    return temp;
}

int main()
{
    Node *head= NULL;
    head = insertBegin(head, 30);
    head = insertBegin(head, 20);
    head = insertBegin(head, 40);
    cout<<"Before Deletion:\n";
    printList(head);
    head = deleteBegin(head);
    head = deleteBegin(head);
    cout<<"\nAfter Deletion:\n";
    printList(head);
    return 0;
}