//moving last element to the front of the linked list
public class Lasttofront
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    //function to insert an element into a list
    void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
   //function to display the list 
    void print()
    {
        Node h = head;
        while(h!=null)
        {
            System.out.print("h.data"+" ");
            h=h.next;
        }
        System.out.println();
    }
    //function to move the last element to the front
    void frontmove()
    {
        if(head==null || head.next==null)
        return;
        
        Node 
    }
}
