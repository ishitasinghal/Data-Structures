//fetching node from the provided key
class Node
{
    Node next;
    int data;
    
    Node(int d)
    {
        data=d;
        next=null;
    }
}

public class Fetchnode
{
    Node head;
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head = n;
    }
    
    public int fetch(int key)
    {
        Node present = head;
        int count=0;
        
        while(present!=null)
        {
            if(count==key)
            return(present.data);
            count++;
            present=present.next;
        }
        assert(false);     //wrong choice
        //assert statement is used to declare an expected boolean condition in a program
        return 0;
        
    }
    
    public static void main(String args[]) 
    { 
        Fetchnode fl = new Fetchnode(); 
        fl.insert(20); 
        fl.insert(645); 
        fl.insert(1436); 
        fl.insert(35); 
        fl.insert(23); 
        System.out.println("Element at index 2 is "+fl.fetch(2)); 
    } 
}
