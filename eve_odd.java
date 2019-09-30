//playing eve odd with the list
public class Eveodd
{
    Node head;
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
    
    public void seperator()
    {
        Node last = head;
        Node prev = null;
        Node curr = head;
        
        while(last.next!=null)
        last = last.next;
        
        Node n = last;
        while(curr.data%2 !=0 && curr!=last)
        {
            n = curr;
            curr = curr.next;
            n.next.next = null;
            n = n.next;
        }
        if(curr.data%2==0)
        {
            head = curr;
            while(curr!=last){
                if(curr.data%2==0)
                {
                    prev = curr;
                    curr = curr.next;
                }
                else
                {
                    prev.next = curr.next;
                    curr.next = null;
                    n.next=curr;
                    n=curr;
                    curr=prev.next;
                }
            }
        }
        else
        prev=curr;
        if(n!=last && last.data%2!=0)
        {
            prev.next=last.next;
            last.next=null;
            n.next=last;
        }
    }
    void insert(int element)
    {
        Node no = new Node(element);
        no.next=head;
        head=no;
    }
    void print()
    {
        Node nod = head;
        while(nod.next!=null)
        {
            System.out.print(nod.data+" ");
            nod=nod.next;
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Eveodd eo = new Eveodd();
        eo.insert(11);
        eo.insert(99);
        eo.insert(84);
        eo.insert(93);
        eo.insert(72);
        eo.insert(64);
        eo.insert(43);
        eo.insert(2);
        eo.insert(14);
        eo.insert(3);
        
        System.out.println("Origional Linked List"); 
        eo.print();
        eo.seperator();
        System.out.println("Final Linked List");
        eo.print(); 
        
    }
}
