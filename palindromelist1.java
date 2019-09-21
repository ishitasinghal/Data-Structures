//palindrome linked list
import java.io.*;
import java.util.*;
class LinkedList
{
	class Node
	{
		char data;
		Node next;
		Node(char d)
		{
			data=d;
			next=null;
		}
	}
	
	static boolean palindrome(Node head) 
	{
		Node slowptr = head;
		boolean palin=true;
		Stack<Character> st = new Stack<Character>();
		while(slowptr!=null)
		{
			st.push(slowptr.data);
			slowptr=slowptr.next;
		}
		while(head!=null)
		{
			char c = st.pop();
			if(head.data==c)
			{
				palin=true;
			}
			else
			{
				palin = false;
				break;
			}
			head = head.next;
		}
		return palin;
	}
	
	public static void main(Stirng args[])
	{
		Node one = new Node('a');
		Node two = new Node('b');
		Node three = new Node('c');
		Node four = new Node('d');
		Node five = new Node('c');
		Node six = new Node('b');
		Node seven = new Node('a');
		one.next = two; 
        two.next = three; 
        three.next = four; 
        four.next = five; 
        five.next = six; 
        six.next = seven; 
        
        boolean check = palindrome(one);
        System.out.println("Palindrome ? "+check);
	}
}
