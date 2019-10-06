//reversing a linked list 
public class Listrev
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            next=null;
            data=d;
        }
    }
    Node rev(Node node)
    {
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev = current;
            current=next;
        }
        node=prev;
        return node;
    }
    void print(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
    public static void main(String args[])
    {
        Listrev lr=new Listrev();
        lr.head=new Node(23);
        lr.head.next=new Node(34);
        lr.head.next.next=new Node(67);
        lr.head.next.next.next=new Node(100);
        lr.head.next.next.next.next=new Node(97);
        System.out.println("Initial linked List");
        lr.print(head);
        head=lr.rev(head);
        System.out.println("");
        System.out.println("Reversed List");
        lr.print(head);
    }
}
