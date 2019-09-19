//program to count keys in a linked list using recursion
import java.io.*;
import java.util.*;
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

class LinkedList
{
	static int c=0; //initializing global variable to count 
	static Node insert(Node head, int element)
	{
		Node n = new Node(element);
		n.next=head;
		head=n;
		return head;
	}
	
	static int count(Node head, int key)
	{
		if(head==null)
			return c;
		if(head.data==key)
			c++;
		return(count(head.next, key));
	}
	
	public static void main(String argd[])
	{
		Node head=null;
		head=insert(head, 100);
		head=insert(head, 99);
		head=insert(head, 100);
		head=insert(head, 98);
		head=insert(head, 100);
		head=insert(head, 100);
		head=insert(head, 100);
		head=insert(head, 97);
		
		System.out.println("Count of 100 is "+count(head, 100));
	}
}
