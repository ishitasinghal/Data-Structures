//deleting a key at a given position
public class Posdel
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
    
    //inserting a node in the front of list
    public void insert(int element)
    {
        Node new_node=new Node(element);
        new_node.next=head;
        head=new_node;
    }
    
    public void delkey(int pos)    //position of the key to be deleted
    {
        if(head==null)
        return;
        
        Node temp=head;
        //if head is the key itself to be deleted
        if(pos==0)
        {
            head=temp.next; //head is changed
            return;
        }
        
        //we need to find the previous node so that position of pointers and all can be changed accordingly
        for(int i=0; temp!=null&&i<pos-1; i++)
        temp=temp.next;
        
        //if position given is greater than the number of nodes
        if(temp==null || temp.next==null)
        return;
        
        Node next=temp.next.next;    //storing the pointer of the next node to be deleted
        temp.next=next;  //free the deleted node from the list   
    }
    
    public void print()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
}

class Demo
{
    public static void main(String args[])
    {
        Posdel pd=new Posdel();
        pd.insert(10);
        pd.insert(20);
        pd.insert(30);
        pd.insert(4);
        pd.insert(50);
        pd.insert(60);
        
        System.out.println("Initially created list is ! ");
        pd.print();
        
        pd.delkey(3);
        System.out.println("Now the list is ! ");
        pd.print();
        
    }
}
