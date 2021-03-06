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
        lr.head=new Node(10);
        lr.head.next=new Node(20);
        lr.head.next.next=new Node(30);
        lr.head.next.next.next=new Node(40);
        lr.head.next.next.next.next=new Node(50);
        System.out.println("Initial linked List");
        lr.print(head);
        head=lr.rev(head);
        System.out.println("");
        System.out.println("Reversed List");
        lr.print(head);
    }
}
