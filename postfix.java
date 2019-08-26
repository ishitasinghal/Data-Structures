import java.util.*;
class Postfix{
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
        
        
    }
}
