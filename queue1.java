//implementing queues using stacks
import java.util.*;
public class Queueviastack
{
    static class Queue
    {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();
        
        static void enQueue(int x)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(x);
        }
    }
}
