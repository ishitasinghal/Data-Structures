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
}
