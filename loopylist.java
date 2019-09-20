//program to check for loops in the list
import java.io.*;
import java.util.*;
class LinkedList
{	static Node head;
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
	 
	public static void insert(int element)
	{
		Node n = new Node(element);
		n.next=head;
		head=n;
	}
	
	static boolean loop(Node h)
	{
		HashSet<Node> set = new HashSet<Node>(); //hashset prevents duplicacy
		while(h!=null)
		{
			if(set.contains(h)) //if a node is alrdy present in the hashset
				return true;
			set.add(h);
			h=h.next;
		}
		return false;
	}
	
	public static void main(String argd[])
	{
		LinkedList ll = new LinkedList();
		ll.insert(10);
		ll.insert(40);
		ll.insert(45);
		ll.insert(10);
		
		//we delibrately make a loop to test the code
		ll.head.next.next.next.next = ll.head;
		if(loop(head))
			System.out.println("Looped!! Trapped");
		else
			System.out.println("No loop!");

		
		System.out.println("Count of 100 is "+count(head, 100));
	}
}
