//implementing queue by array
//deletion takes place from the front
class Queue
{
 int front, rear, size;
 int length;
 int array[];
 
 Queue(int length)
 {
     this.length = length;
     front = this.size=0;
     rear= length-1;
     array = new int[this.length];
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
    	 return;
     this.rear = (this.rear + 1)%this.length; 
     this.array[this.rear] = element; 
     this.size = this.size + 1; 
     System.out.println(element+ " enqueued to queue"); 
 }
 
 //dequeue function queue to delete an element
 int dequeue()
 {
     if(isempty(this))
     return Integer.MIN_VALUE;
     int element = this.array[this.front];
     this.front = (this.front+1)%this.length;
     this.size = this.size=1;
     return element;
 }
 
 //getting the front of the queue
 int front()
 {
     if(isempty(this))
     {
         return Integer.MIN_VALUE;
     }
     return this.array[this.front];
 }
 
 //getting the rear of the queue
 int rear()
 {
     if(isempty(this))
     {
         return Integer.MIN_VALUE;
     }
     return this.array[this.rear];
 }
}
public class Mainc
{
 public static void main(String args[])
 {
     Queue q = new Queue(500);
     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
     q.enqueue(4);
     q.enqueue(5);
     q.enqueue(6);
     q.enqueue(7);
     q.enqueue(8);
     q.enqueue(9);
     
     System.out.println("## BEFORE ##");
     System.out.println( q.front()+ "Front element");
     System.out.println("Rear element"+q.rear());
     System.out.println("## AFTER ##");
     q.dequeue();
     System.out.println("Front element"+q.front());
     System.out.println("Rear element"+q.rear());
 }
}
