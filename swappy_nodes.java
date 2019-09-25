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
        Node n = new Node(element);
        n.next=head;
        head = n;
    }
    
    void print()
    {
        Node h;
        while(h!=null)
        {
            system.out.print(h.data+" ");
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
        pn.insert(8);
        
        System.out.println("Initial list: "); 
        pn.print(); 
  
        llist.pairWiseSwap(); 
  
        System.out.println("Linked List after calling pairWiseSwap() "); 
        llist.printList(); 
        
    }
}
