//reversing a stack that is bottom element to be inseted at the top and vice-versa.

import java.util.Stack;
public class Revstack
{
    static Stack<Character> st=new Stack<>();
    static void pushbottom(char c)
    {
        if(st.isEmpty())
        st.push(c);
        else
        {
            char ch =st.peek();
            st.pop();
            pushbottom(c);
            st.push(ch);
        }
    }
    
    static void reverse()
    {
        if(st.size()>0)
        {
            char ch = st.peek();
            st.pop();
            reverse();
            pushbottom(ch);
        }
    }
    
    public static void main(String args[])
    {
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        st.push('8');
        
        System.out.println("Initial stack: ");
        System.out.println(st);
        reverse();
        System.out.println("Final stack: ");
        System.out.println(st);
        
        
    }
}
