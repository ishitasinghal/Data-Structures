//moving last element to the front of the linked list
public class Lastoffront
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
            System.out.print(h.data+" ");
            h=h.next;
        }
        System.out.println();
    }
    //function to move the last element to the front
    void frontmove()
    {
        if(head==null || head.next==null)
        return;
        
        Node seclast =null;
        Node temp=head;
        
        while(temp.next!=null)
        {
            seclast = temp;
            temp=temp.next;
        }
        seclast.next=null;
        temp.next = head;
        head=temp;
    }
    
    public static void main(String args[])
    {
        Lastoffront lf = new Lastoffront();
        lf.insert(1);
        lf.insert(2);
        lf.insert(3);
        lf.insert(4);
        lf.insert(5);
        lf.insert(6);
        
        System.out.println("Initial list : ");
        lf.print();
        System.out.println("Final rearranged list ");
        lf.frontmove();
        lf.print();
    }
}
