//counting the number of keys in the linked list
class Keycount
{ 	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data = d; //using this pointer
			next=null;
		}
	}
	
	public void insert(int element)
	{
		Node n = new Node(element);
		n.next=head;
		head=n;
	}
	
	int countkey(int key)
	{
		Node present=head;
		int c=0; //initializing variable for count
		while(present!=null)
		{
			if(present.data==key)
			{
				c++;
			}
			present=present.next;
		}
		return c;
	}
	
	public static void main(String args[])
	{
		Keycount kn = new Keycount();
		kn.insert(100);
		kn.insert(99);
		kn.insert(98);
		kn.insert(97);
		kn.insert(100);
		kn.insert(99);
		kn.insert(100);
		kn.insert(96);
		kn.insert(100);
		kn.insert(98);
		System.out.println("Count of 100 in the key list is "+kn.countkey(100));
	}
}
