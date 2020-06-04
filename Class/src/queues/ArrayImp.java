package queues;
class QueueImp{
	final int size=10;
	int arr[]=new int[size];
	int front=-1;
	int rear=-1;
	void enqueue(int data)
	{
		if(this.isEmpty())
		{
			front++;
			rear++;
			arr[rear]=data;
		}
		else if(rear==size-1)
		{
			System.out.println("Queue is full");
		}
		else 
		{
			rear++;
			arr[rear]=data;
		}
		
	}
	int dequeue()
	{
		if(this.isEmpty())
		{
			System.out.println("Nothing to dequeue");
		}
		
		if(front==rear)
		{
			int x =arr[front];
			front=-1;
			rear=-1;
			return x;
		}
		int x=arr[front];
		front++;
		return x;
	}
	int peek()
	{
		if(this.isEmpty())
		{
			System.out.println("Nothing to dequeue");
			return -1;
		}
		return arr[front];
	}
	boolean isEmpty()
	{
		if(front==-1 &&rear==-1)
		{
			return true;
		}
		return false;
	}
}
public class ArrayImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImp q=new QueueImp();
		System.out.println(q.isEmpty());
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
	}

}
