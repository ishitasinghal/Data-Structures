//user made linked list
import java.io.*;
import java.util.*;

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

public class UserList
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many elements u wanna insert : ");
        int n = Integer.parseInt(br.readLine());
        UserList ul = new UserList();
        for(int i =0; i<n; i++)
        {
            int num = Integer.parseInt(br.readLine());
            ul.insert(num);
        }
        
        ul.print();
    }
}
