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
    q,add(q.peek());
  }
}

  
