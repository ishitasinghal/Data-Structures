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
            next=null;
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
        while(temp!=null)
        {
            c=c+1;
            temp=temp.next;
        }
        return c;
    }
    
    public static void main(String args[])
    {
        Iternodes in = new Iternodes();
        in.insert(98);
        in.insert(54);
        in.insert(46);
        in.insert(64);
        in.insert(74);
        in.insert(63);
        in.insert(9);
        
        System.out.println("The number of nodes in the linked list are:  "+ in.count());
    }
}
