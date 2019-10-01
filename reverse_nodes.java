//reversing a stack that is bottom element to be inseted at the top and vice-versa.
import java.util.Stack;
public Class Revstack
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
}
