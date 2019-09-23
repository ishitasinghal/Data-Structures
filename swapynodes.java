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
	
	void swapnodes(int a, int b)   //a and b are the nodes.
	{
		if(a==b)
		{
			return; //nodes are same
		}
		Node preva = null, currenta=head;
		while(currenta!=null && currenta!=a)
		{
			preva = currenta;
			currenta = currenta.next;
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
