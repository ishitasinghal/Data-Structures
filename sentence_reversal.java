//sentence reversal
import java.util.*;

public class Sentrev
{
    static void rev(String sen)
    {
        Stack<String> s = new Stack<>();
        String ar[] = sen.split(" ");
        for(int i=0;i<ar.length;i++)
        {
            s.push(ar[i]);
        }
        while(!s.empty())
        {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
    
    public static void main(String args[])
    {
        String sen = "Let the sentence be reversed.";
        rev(sen);
    }
}
