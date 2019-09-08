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
    
    //function to insert after a given node
    public void insert(Node pre_node, int element)
    {
        if(pre_node==null)
        {
            System.out.println("The previous node can't be  null!");
            return;
        }
        Node new_node = new Node(element);
        new_node.next=pre_node.next;
        pre_node.next=new_node;
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
        Insertinbet ib = new Insertinbet();
        ib.head=new Node(10);
        Node one = new Node(20);
        Node two = new Node(30);
        Node three = new Node(40);
        
        ib.head.next=one;
        one.next=two;
        two.next=three;
        
        ib.print();
        //ib.insert(two, 25);
        ib.print();
        
    }
}
