//inserting inside a linked list

public class Insertionatfront
{
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    //inserting a node at front of the list
    public void push(int element)
    {
        Node new_node = new Node(element);   //making the new node
        new_node.next=head;          //next becomes the head
        head=new_node;   //now head points to the new node
    }
    
    public void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    
    public static void main(String args[])
    {
        Insertionatfront iaf = new Insertionatfront();
        iaf.head = new Node(1);
        
        Node one = new Node(2);
        Node two = new Node(3);
        Node three = new Node(4);
        Node four = new Node(5);
        
        iaf.head.next=one;
        one.next=two;
        two.next=three;
        three.next=four;
        
        iaf.print();
        iaf.push(100);
        System.out.println();
        iaf.print();
        
    }
}
