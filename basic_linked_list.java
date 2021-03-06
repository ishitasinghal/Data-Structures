//basic linkeed-list program
public class Linkedlist
{
    Node head; 
    static class Node
    {
        int data;
        Node next;  //next is by default initialized by null
        Node(int d)  //parameterized constructor to initialize vlaues of Node class data members
        {
            data=d;
            next=null;
        }
    }
    
    //function to print the linked list.
    void print()
    {
        Node n= head;
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n=n.next;
        }
    }
    
    public static void main(String args[])
    {
        Linkedlist ls=new Linkedlist();
        ls.head=new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        
        //here basically the three nodes have been made in which each points to null ls.head is the first one
        ls.head.next = two;
        two.next=three;  //next pointer of the second node now points to the third node
        ls.print();
    }
}


//practice

public class Linkedlist
{
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    
    void print()
    {
        Node n =head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n= n.next;
        }
    }
    
    public static void main(String args[])
    {
        Linkedlist ls= new Linkedlist();
        ls.head=new Node(1);
        Node one = new Node(23);
        Node two = new Node(87);
        Node three = new Node(76);
        Node four = new Node(100);
        
        ls.head.next=one;
        one.next=two;
        two.next=three;
        three.next=four;
        
        ls.print();
    }
}
