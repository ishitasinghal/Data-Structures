//insertion into a linked list at the end.

public class Insertatend
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
    
    //function to insert after a given node
    public void insert(int element)
    {
        Node new_node = new Node(element);
        if(head==null)
        {
            head=new Node(element);  //condition of an empty list
            return;
        }
        
        new_node.next=null;
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        last.next = new_node;
        return;
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
        Insertatend ie = new Insertatend();
        ie.head=new Node(10);
        Node one = new Node(20);
        Node two = new Node(30);
        Node three = new Node(40);
        
        ie.head.next=one;
        one.next=two;
        two.next=three;
        
        ie.print();
        ie.insert(50);
        System.out.println();
        ie.print();
        
    }
}
