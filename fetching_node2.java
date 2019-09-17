//fetching the nth node using recursion
class LinkedList
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data; //using this pointer
		}
	}
	
	static Node insert(Node head, int element)
	{
		Node n = new Node(element);
		n.data=element; //putting teh data inside the node
		n.next=head;
		head=n;
		return head;
	}
	
	static int fnode(Node head, int key)
	{
		int count =1;
		if(count == key)
		{
			return(head.data);
		}
		return(fnode(head.next, key-1));
	}
	
	public static void main(String args[])
	{
		Node head=null;
		head=insert(head, 12);
		head=insert(head, 13);
		head=insert(head, 14);
		head=insert(head, 15);
		head=insert(head, 16);
		head=insert(head, 17);
		head=insert(head, 18);
		head=insert(head, 19);
		head=insert(head, 20);
		
		System.out.println("Item at index 5 is "+fnode(head, 5));
	}
}
