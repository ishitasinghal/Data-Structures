//program to complete the whole list
public class LinkedList
{
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    //function to delete the whole list
    public void delete()
    {
        head = null; //garbage collection happens on its own in java
    }
    
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
    
    public void print()
    {
        Node no=head;
        while(no!=null)
        {
            System.out.print(no.data+" ");
            no=no.next;
        }
    }
    
    public static void main(String args[])
    {
        LinkedList dl = new LinkedList();
        dl.insert(10);
        dl.insert(20);
        dl.insert(30);
        dl.insert(94);
        System.out.print("Initially the list is : ");
        dl.print();
        dl.delete();
        System.out.println("Deleted list is: ");
        dl.print();
    }
}
