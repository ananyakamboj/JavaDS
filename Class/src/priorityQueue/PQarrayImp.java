package priorityQueue;

class PQArray{
	final int size=10;
	int arr[]=new int[size];
	int nItems=0;
	
	public void insert(int data)
	{
		if(this.isEmpty()) {
			arr[0]=data;
			nItems++;
			return;
		}
		else if(this.isFull())
		{
			System.out.println("Array is full");
			return;
		}
		int i;
		for(i=nItems-1;i>=0;i--)
		{
			if(data<arr[i])
			{
				arr[i+1]=arr[i];
			}
			else
			{
				break;
			}
		}
		arr[i+1]=data;
		nItems++;
		
	}
	public int remove()
	{
		return arr[nItems--];
	}
	public int peek()
	{
		return arr[nItems-1];
	}
	public boolean isEmpty()
	{
		return nItems==0;
	}
	public boolean isFull()
	{
		return nItems==size;
	}
	void print()
	{
		for(int i=0;i<nItems;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class PQarrayImp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PQArray pq=new PQArray();
		pq.insert(3);
		pq.print();
		pq.insert(5);
		pq.print();
		pq.insert(9);
		pq.print();
		pq.insert(1);
		pq.print();
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		pq.print();
	}

}
