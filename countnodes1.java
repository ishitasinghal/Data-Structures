//counting nodes by iterative approach
public class Iternodes
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            netx=null;
        }
    }
    
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
    
    public int count()
    {
        Node temp=head;
        int c=0;   //initializing count variable
    }
}
