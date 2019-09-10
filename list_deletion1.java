//deleting a key from a singly linked list
import java.io.*;
public class Dellist
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
    
    //when a key is provided, this func deletes the first occurence of the key
    public void firstdel(int key)
    {
        Node temp=head, prev=null; //head node stored
        //if the first node is the key itself
        if(temp!=null && temp.data==key)
        {
            head=temp.next;  //head changed
            return;
        }
        
        while(temp!=null && temp.data!=key)
        {
            prev=temp;
            temp=temp.next;
        }
        
        //if key is absent
        if(temp==null)
        return;
        
        prev.next=temp.next;
    }
    
    public void push(int element)
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
    
    public static void main(String args[])throws IOException
    {
        Dellist dl=new Dellist();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many elements u wanna put into the list?");
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            System.out.println("Continue");
            dl.push(i);
        }
        System.out.println("The list is: ");
        dl.print();
        System.out.println("Now enter the element u wanna remove from the list!!");
        int nu=Integer.parseInt(br.readLine());
        dl.firstdel(nu);
        System.out.println("After deleting the final list is :");
        dl.print();
        
        
    }
}
