//reversing a linked list 
public class Listrev
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        NOde(int d)
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
}
