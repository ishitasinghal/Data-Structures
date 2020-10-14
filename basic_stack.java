#basic stack implementation in java
public class Stackk
{
    static final int MAX=1000;
    int top;
    int starr[] = new int[MAX];
    
    void isEmpty()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
    }
    
    public void push(int e)
    {
        if(top>=(MAX-1))
        {
            System.out.println("Stack overflow");
        }
        else
        {
            starr[++top]=e;
        }
    }
    
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack underfloe");
            return 0;
        }
        else
        {
            int x=starr[top--];
            return x;
        }
    }
    
    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int a=starr[top];
            return a;
        }
    }

public static void main(String args[])
{
    Stackk s = new Stackk(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        
}
}
