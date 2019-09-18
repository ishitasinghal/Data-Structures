//finding middle
public class Middle
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
    
    void middlele()
    {
        Node ptr1=head;
        Node ptr2=head;
        if(head!=null)
        {
            while(ptr2!=null && ptr2.next!=null)
            {
                ptr2 = ptr2.next.next;  //going two elements ahead
                ptr1 = ptr1.next;
            }
            System.out.println("=*=MIDDLE ELEMENT=*="+ ptr1.data);
        }
    }
    
    void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
    
    void print()
    {
        Node no=head;
        while(no!=null)
        {
            System.out.print(no.data+" ");
            no=no.next;
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Middle m = new Middle();
        m.insert(1);
        m.insert(2);
        m.insert(3);
        m.insert(4);
        m.insert(5);
        //m.insert(6);
        //when the number of elements is even, it returns the second element of the two middle elements.
        m.print();
        
        m.middlele();
    }
}
