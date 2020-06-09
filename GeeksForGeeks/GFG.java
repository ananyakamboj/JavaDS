/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n= sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<arr.length;j++)
		    {
		        arr[j]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    if(n%2!=0)
		    {
		        System.out.println(arr[n/2]);
		    }
		    else
		    {
		        System.out.println(arr[n/2-1]);
		    }
		}
	}
}