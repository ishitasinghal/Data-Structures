//cpmplete insertion program for a linked list.
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
    
    //
    
    
}
