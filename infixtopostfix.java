#application of stacks

import java.util.*;
public class Postfix
{
    static int postfix(String exp)
    {
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<exp.length(); i++)
        {
            char c = exp.charAt(i);
            if(Character.isDigit(c))
            {
                stk.push(c-'0');  //this converts the character to integer
            }
            else
            {
                int v1 = stk.pop();
                int v2 = stk.pop();
                
                switch(c)
                {
                    case '+':
                        stk.push(v1+v2);
                        break;
                    case '-':
                        stk.push(v2-v1);
                        break;
                    case '*':
                        stk.push(v2*v1);
                        break;
                    case '/':
                        stk.push(v2/v1);
                        break;
                }
            }
        }
        
        return stk.pop();
    }
    
    public static void main(String args[])
    {
        String exp="10+3*5/16-4"; 
        System.out.println("postfix evaluation: "+postfix(exp)); 
    }
}
