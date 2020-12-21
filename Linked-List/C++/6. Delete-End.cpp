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

Node *insertEnd(Node *head, int x)
{
    Node *temp=new Node(x);
    if(head == NULL)
    {
        return temp;
    }
    Node *curr=head;
    while(curr->next!=NULL)
    {
        curr=curr->next;
    }
    curr->next=temp;
    return head;
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

Node *delLast(Node *head)
{
    if(head==NULL)
        return NULL;
    if(head->next==NULL)
    {
        delete head;
        return NULL;
    }
    Node *curr = head;
    while(curr->next->next!=NULL)
    {
        curr=curr->next;
    }
    delete (curr->next);
    curr->next=NULL;
    return head;
}


int main()
{
    Node *head= NULL;
    head = insertEnd(head, 30);
    head = insertEnd(head, 20);
    head = insertEnd(head, 40);
    cout<<"Before Deletion:\n";
    printList(head);
    delLast(head);
    delLast(head);
    cout<<"\nAfter Deletion:\n";
    printList(head);
    return 0;
}