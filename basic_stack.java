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
            a[++top]=e;
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
            int x=a[top--];
            return x;
        }
    }
}
public static void main(String args[])
{
    Stackk s = new Stackk(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.peek());
}
