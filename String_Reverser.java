import java.util.*;

public class Stack
{
 int size;
 int top;
 char arr[];
 
 boolean Empty()
 {
     return (top<0);
 }
 
 Stack(int n)
 {
     size = n;
     top=-1;
     arr = new char[size];
 }
 
 void push(char e)
 {
     if(top>=size)
     {
         System.out.println("Stack is full!!");
         //return false;
     }
     else
     {
         arr[top] = e ;
         top++;
         //return true;
     }
 }
 
 char pop()
 {
     if(top==-1)
     {
         System.out.println("Stack is empty!!");
         return 0;
     }
     else
     {
         char re = arr[top];
         top--;
         return re;
     }
 }
 
}

public class Reverser
{
    public static void reverse(StringBuffer str)
    {
        Stack obj = new Stack(str.length());
        for(int i=0; i<str.length(); i++)
        {
            obj.push(str.charAt(i));
        }
        for(int j=0; j<str.length();j++)
        {
            char ch= obj.pop();
            str.setCharAt(j, ch);
            //the element being popped out from the top of stack is being set at the 0 and increasing index
        }
    }
    
    public static void main(String args[])
    {
        StringBuffer s = new StringBuffer("Anything to REverse");
        reverse(s);
        System.out.println("The reversed String is "+s);
    }
}
