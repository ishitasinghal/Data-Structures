//counting nodes of a linked list by recursive approach
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

public class Recurnodes
{
    Node head;
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next = head;
        head=n;
    }
    
    //recursive approach
    public int count(Node no)
    {
        if(no==null)
        return 0;
        
    return(1+count(no.next));
    }
    
    //this is simply a wrapper class over the recursive count class
    public int wrappercount()
    {
        return(count(head));  //this passes head to the count function
    }
    
    public static void main(String args[])
    {
        Recurnodes rn = new Recurnodes();
        rn.insert(65);
        rn.insert(43);
        rn.insert(56);
        rn.insert(87);
        rn.insert(98);
        rn.insert(9);
        rn.insert(78);
        
        System.out.println("The number of nodes is : "+rn.wrappercount());
    }
}
