package Arrays;

import java.util.Scanner;

public class Searching {
	static int search(int arr[],int e)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==e)
			{
				j=i+1;
				break;
			}
		}
		return j;
	}
	public static void main(String[] args) {
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
			System.out.println("Element to be searched:");
			int e=sc.nextInt();
			int a=search(arr,e);
			if(a==0)
			{
				System.out.println("Element not found");
			}
			else {
				System.out.println(a);
			}
			
		}
	}

}
