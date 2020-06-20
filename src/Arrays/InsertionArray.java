//Array - Insert an element into array
package Arrays;
import java.util.*;
public class InsertionArray {
	static void insert(int arr[], int n,int e)
	{
		arr[n-1]=e;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the position:");
			int p=sc.nextInt();
			System.out.println("Enter the element:");
			int e=sc.nextInt();
			insert(arr,p,e);
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
}
}

