//swapping nodes of the linked list
class LinkedList
{
	Node head;
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
	
	
	
	public static void main(String args[])
	{
		LinkedList dn = new LinkedList();
		dn.insert(10);
		dn.insert(20); 
        dn.insert(13); 
        dn.insert(13); 
        dn.insert(11); 
        dn.insert(11); 
        dn.insert(11); 
		
        System.out.println("BEFORE REMOVAL: ");
        dn.print();
        dn.duplicates();
        System.out.println("AFTER REMOVAL: ");
        dn.print();
	}
}
