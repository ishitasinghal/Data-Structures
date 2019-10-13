//implementing stacks using queues
import java.util.LinkedList;
import java.util.Queue;
class Squeue
{
	Queue<Integer> q = new LinkedList<Integer>();
	//inserting in the queue
	void push(int item)
	{
		int size=q.size();
		q.add(item);
		for(int i=0;i<size;i++)
		{
			int x=q.remove();
			q.add(item);
		}
	}
	
	//removing the top element 
	int pop()
	{
		if(q.isEmpty())
		{
			System.out.print("No elements");
			return -1;
		}
		int x=q.remove();
		return x;
	}
	
	//returning the top element of the stack
	int top()
	{
		if(q.isEmpty())
			return -1;
		return q.peek();
	}
	
	//checking whether element is present in the stack or not 
	boolean isempty()
	{
		return q.isEmpty();
	}
	
	public static void main(String args[])
	{
		Squeue s = new Squeue();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println("Top element is "+ s.top());
		s.pop();
		s.push(4);
		s.push(5);
		s.push(7);
		s.pop();
		System.out.print("Top element is "+s.top());
	}
}
