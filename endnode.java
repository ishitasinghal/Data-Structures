//fetcing the nth node from the end
public class Endnode
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
    
    //function to fetch the nth node
    public void noden(int n)
    {
        int len=0;
        Node temp=head;
        //counting number of nodes in the linked list
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        
        if(len<n)
        {
            return;
        }
        
        temp=head;
        for(int i=1;i<len-n+1;i++)
        {
            temp=temp.next;
        }
        System.out.println("The data is "+ temp.data);
    }
    
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
    
    public static void main(String args[])
    {
        Endnode en = new Endnode();
        en.insert(21);
        en.insert(34);
        en.insert(67);
        en.insert(68);
        en.insert(98);
        en.insert(56);
        
        en.noden(2);
    }
}
