//user made linked list
import java.io.*;
import java.util.*;
import java.lang.*;

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

public class Userlist()
{
    Node head;
    public void insert(int element)
    {
        Node n = new Node(element);
        n.next=head;
        head=n;
    }
    
    public void print()
    {
        Node no = head;
        while(no!=null)
        {
            System.out.println("Linked List : "+ no.data+" ");
            no=no.next;
        }
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(system.in));
        System.out.println("Enter how many elements u wanna insert : ");
        int n = Integer.parseInt(br.readLine());
        Userlist ul = new Userlist();
        for(int i =0; i<n; i++)
        {
            
        }
        
    }
}
