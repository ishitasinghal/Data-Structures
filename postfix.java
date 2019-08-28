import java.util.*;
public class Postfix{
    static int precedence(char ch) //function to get the precedence
    {
        switch(ch){
            case '+':
            case '-':
                return 1;
                
            case '*':
            case '/':
                return 2;
                
            case '^':
                return 3;
        }
        return -1;
                
    }
    
    static String converter(String exp){
        String result = new String("");
        Stack<Character> sk = new Stack<>(); 
        for(int i=0; i<exp.length(); i++)
        {
            char c=exp.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                result=result+c;
            }
            else if(c=='(')
            {
                sk.push(c);
            }
            else if(c==')')
            {
                while(!sk.isEmpty() && sk.peek() !='(') 
                {//peek fetches the first element
                result = result+sk.pop();
                }
                if(!sk.isEmpty() && sk.peek() !='(')
                {
                    return("Invalid Expression");
                }
                else
                sk.pop();
            }
            else
            {
                while(!sk.isEmpty() && precedence(c) <= precedence(sk.peek()))
                {
                    if(sk.peek() == '(')
                    {
                        return "Invalid Expression ";
                    }
                    result = result+sk.pop();
                }
                sk.push(c);
            }
        }
        while(!sk.isEmpty())
        {
            if(sk.peek() == '(')
            return "Invalid Expression";
            result = result+sk.pop();
        }
        return result;
    }
    public static void main(String args[])
    {
        String exp = "A*(B+C)*D";
        System.out.println(converter(exp));
    }
}
