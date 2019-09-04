//this program is to implement two stacks using a sinlge array.
//for this, we r using a space efficient approach by pushing the elements from the extreme corners of the array, which would utilize the array space efficiently.

public class Twoinone
{
    int size;
    int top1, top2;
    int arr[];
    
    
    //parameterized constructor to assign values to data members
    Twoinone(int n)
    {
        size = n;
        arr = new int[n];
        top1=-1;
        top2=size;
    }
    
    //function to push an element in stack1
    void push1(int e)
    {
        if(top1<top2-1)//this checks that there is still space left for stack1
        {
            top1++;
            arr[top1]=e;
        }
        else
        {
            System.out.println("Stack is full!!");
            System.exit(1);   //this exit code indicates unsuccessul termination
        }
    }
    
    //function to push in stack2
    void push2(int e)
    {
        if(top2>top1+1)
        {
            top2--;
            arr[top2]=e;
        }
        else
        {
            System.out.println("Stack is full !!");
            System.exit(1);
        }
    }
    
    //method to pop from stack1
    int pop1()
    {
        if(top1>=0)
        {
            int x =arr[top1];
            top1--;
            return x;
        }
        else
        {
            System.out.println("Stack is empty!!");
            System.exit(1);
        }
        return 0;
    }
    
    int pop2()
    {
        if(top2<size)
        {
            int x=arr[top2];
            top2++;;
            return x;
        }
        else
        {
            System.out.println("Stack is empty!!");
            System.exit(1);
        }
        return 0;
    }
    
    //finally implementing the main part
    public static void main(String args[])
    {
        Twoinone to = new Twoinone(5);
        to.push1(95);
        to.push2(97); 
        to.push2(93); 
        to.push1(90); 
        to.push2(96); 
        System.out.println("Popped element from stack1 : "+to.pop1());
        to.push2(95);
        System.out.println("Popped element from stack2 : "+to.pop2());
    }
    
}
