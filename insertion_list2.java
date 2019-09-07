//insertion into a linked list after a given node.

public class Insertinbet
{
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            d=data;
            next=null;
        }
    }
    
    public static void main(String args[])
    {
        Insertinbet ib = new Insertinbet();
        ib.head=new Node(10);
        Node one = new Node(20);
        Node two = new Node(30);
        Node three = new Node(40);
        
        ib.head.next=one;
        one.next=two;
        two.next=three;
        
        
    }
}
