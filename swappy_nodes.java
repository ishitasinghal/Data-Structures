//swapping pairwise nodes
public class Pairnodes
{
    Node head;
    class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
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
        Node n = new Node(element);
        n.next=head;
        head = n;
    }
    
    void print()
    {
        Node h=head;
        while(h!=null)
        {
            System.out.print(h.data+" ");
            h=h.next;
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Pairnodes pn = new Pairnodes();
        pn.insert(1);
        pn.insert(2);
        pn.insert(3);
        pn.insert(4);
        pn.insert(5);
        pn.insert(6);
        pn.insert(7);
        //for odd numbered list of elements the lst element remains the same
        //pn.insert(8);
        
        System.out.println("Initial list: "); 
        pn.print(); 
  
        pn.pairswap(); 
  
        System.out.println("Final list "); 
        pn.print(); 
        
    }
}
