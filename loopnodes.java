//program to check for loops and count them in the list
import java.io.*;
import java.util.*;
class LinkedList
{	
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
	
	static int count(Node n)
	{
		int tot=1;
		Node temp = n;
		while(temp.next != n)
		{
			tot++;
			temp=temp.next;
		}
		return tot;
	}
	
	static int nodesinloop(Node no)
	{
		Node ptr1 = no, ptr2=no;
		while(ptr1!=null && ptr2!=null && ptr2!=null)
		{
			ptr1 = ptr1.next;       //moves a single node ahead
			ptr2 = ptr2.next.next;  //moves two nodes ahead
			
			//if both meet at the same point then there is a loop
			if(ptr1==ptr2)
			{
				return count(ptr1);
			}
		}
		return 0;
	}
	 
	static Node newnode(int element)
	{
		Node t = new Node(element);
		return t;
	}
	public static void main(String argd[])
	{
		Node head = newnode(1);
		head.next = newnode(2);
		head.next.next = newnode(3);
		head.next.next.next = newnode(4);
		head.next.next.next.next = newnode(5);
		head.next.next.next.next.next = newnode(6);
		
		
		//we delibrately make a loop to test the code
		head.next.next.next.next = head.next;
		System.out.println(nodesinloop(head));
		//let's try making another loop!
		head.next.next.next.next.next = head.next;
		System.out.println(nodesinloop(head));
		
	}
}
