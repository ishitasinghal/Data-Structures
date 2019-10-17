//finding reverse of queue for first given elements
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Reverse
{
static Queue<Integer> q;
static void reversefirstkele(int k)
{
  if(q.isEmpty()==true || k>q.size())
    return;
  if(k<=0)
    return;
  Stack<Integer> s = new Stack<Integer>();
  //pushing elements into the stack
  for(int i=0;i<k;i++)
    s.push(q.peek());
  q.remove();
}
 while(!stack.empty())
 {
   q.add(s.peek());
   s.pop();
 }
  for(int i=0;i<q.size()-k;i++)
  {
    q.add(q.peek());
    q.remove();
  }
}
static void print()
{
  while(!q.isEmpty())
  {
    System.out.print(q.peek()+" ");
    q.remove();
  }
}
public static void main(String args[])
{
  q=new LinkedList<Integer>();
  q.add(1);
  q.add(2);
  q.add(4);
  q.add(6);
  q.add(8);
  q.add(10);
  q.add(12);
  q.add(14);
  q.add(16);
  q.add(18);
  
  int k=5;
  reversefirstkele(k);
  print();
}
}


  
