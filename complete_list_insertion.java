//complete insertion program for a linked list.
public class Completeinsertion
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
    
    //function to insert in front
    public void front(int element)
    {
        Node new_node = new Node(element);  //allocates new node
        new_node.next=head;  //new node becomes the head
        head=new_node;  //now head points the new node
    }
    
    //function to insert after a given specific node
    public void between(Node pre_node, int element)
    {
        if(pre_node == null)
        {
            System.out.println("Previous node can't be null !!");
            return;
        }
        
        Node new_node = new Node(element);
        new_node.next=pre_node.next;
        pre_node.next=new_node;
    }
    
    //function to insert at the end
    public void end(int element)
    {
        Node new_node = new Node(element);
        if(head==null)
        {
           head=new Node(element); //if list is empty
           return;
        }
        
        new_node.next=null;
        Node last=head;
        while(last.next!=null)  //traversal till the last node.
        {
           last=last.next;
        }
        
         last.next=new_node;
         return;
    }
    
    //print function
    public void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    
    //finally the main function
    public static void main(String args[])
    {
        Completeinsertion ci = new Completeinsertion();
        ci.end(5);  //start with empty list
        ci.front(2);
        ci.front(1);
        ci.end(6);
        ci.between(ci.head.next, 3);  //at the third position.
        System.out.println("\nCurrent Linked List: ");
        ci.print();
        
    }
    
}
