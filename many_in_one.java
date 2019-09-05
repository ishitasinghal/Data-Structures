//program to implement k stacks from one array.
public class Manystack
{
    static class Kstack
    {
        int arr[]; //actual data to b stored in stacks
        int top[]; //to store indexes of top element
        int next[];  //next entry of all stacks
        int n,k;
        int free; //beginning index
        
        Kstack(int k1, int n1)
        {
            k=k1;
            n=n1;
            arr new int[n];
            top=new int[k];
            next=new int[n];
            
            for(int i=0;i<k;i++)   //initializing all stacks as empty
             top[i]=-1;
             
             free=0;
             for(int i=0;i<n;i++)
             next[i]=i+1;
             next[n-1]=-1;
        }
    }
}
