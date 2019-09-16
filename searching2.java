//searching an element in the linked list by recursive approach
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

public class Itersearch
{
    Node head;
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
    
    public boolean search(Node head, int item)
    {
        if(head==null)
        return false;
        
        if(head.data==item)
        {
            return true;
        }
        
        return(search(head.next, item));
    }
    
    public static void main(String args[])
    {
        Itersearch is = new Itersearch();
        is.insert(98);
        is.insert(54);
        is.insert(46);
        is.insert(64);
        is.insert(74);
        is.insert(63);
        is.insert(9);
        
        // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Enter the element u wanna search!");
        // int num = Integer.parseInt(br.readLine());
        System.out.println("Data present =  "+ is.search(is.head, 64));
        
    }
}
