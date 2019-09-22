//removing duplicates from the linkedlist
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
	
	void duplicates()
	{
		Node current=head;
		while(current!=null)
		{
			Node temp=current;
			while(temp!=null && temp.data==current.data )
			{
				temp=temp.next;
			}
			current.next=temp;
			current=current.next;
		}
	}
	
	void insert(int element)
	{
		Node n = new Node(element);
		n.next=head;
		head=n;
	}
	
	void print()
	{
		Node no=head;
		while(no!=null)
		{
			System.out.print(np.data+" ");
			no=no.next;
		}
		System.out.println();
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
