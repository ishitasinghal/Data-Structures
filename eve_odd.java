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
        
        while(last.next!=nul)
        end = end.next;
        
        Node n = end;
        while(curr.data%2 !=0 && curr!=end)
        {
            new_last = curr;
            curr = curr.next;
            new_last.next.next = null;
            new_last = new_last.next;
        }
        if(curr.data%2==0)
        {
            head = curr;
            while(curr!=end){
                if(curr.data%2==0)
                {
                    prev = curr;
                    curr = curr.next;
                }
                else
                {
                    prev.next = curr.next;
                }
            }
        }
    }
}
