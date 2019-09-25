//swapping pairwise nodes
public class Pairnodes
{
    Node head;
    class Node
    {
        Node next;
        int data;
        next=null;
        Node(int d)
        {
            data=d;
        }
    }
    
    void pairswap()
    {
        Node temp = head;
        while(temp!=null && temp.next!=null)
        {
            int t = temp.data;
            temp.data = temp.next.data;
            temp.next.data = t;
            temp = temp.next.next;
            
            //here we simply swapped the nodes
        }
    }
    
    void insert(int element)
    {
        
    }
    
}
