// implementing queue by array
public class Queue
{
    int front, rear, size;
    int length;
    int array;
    
    Queue(int length)
    {
        this.length = length;
        front = this.size=0;
        rear= length-1;
        array = new int[this.capacity];
    }
    
    //checking if Queue doesn't have more space left.
    boolean isfull(Queue q)
    {
        return(q.size==q.length);
    }
    
    //checking if the queue is Empty.
    boolean isempty(Queue q)
    {
        return(q.size==0);
    }
    
    //enqueue function to insert the elemnrs in the queue
    void enqueue(int element)
    {
        if(isfull(this))
        {
            return;
            this.rear = (this.rear +1)%this.length;
            this.array[this.rear] = element;
            this.size = this.size+1;
            System.out.println(element+"Inserted into the queue");
        }
    }
}
