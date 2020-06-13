package Arrays;

import java.util.Scanner;

public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1-D array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("Enter rows for 2-D array:");
		int r=sc.nextInt();
		System.out.println("Enter columns for 2-D array:");
		int c=sc.nextInt();
		
		int mat[][]=new int[r][c];
		//taking input for a 2-D array
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		//printing a 2-D array
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println(mat);//prints the hashcode
	}

}
