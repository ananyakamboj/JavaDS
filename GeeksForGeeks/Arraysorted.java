/*package whatever //do not write package name here */


import java.util.*;
import java.lang.*;
import java.io.*;

public class Arraysorted {

	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int c=0;
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int j=0;j<arr.length-1;j++)
		    {
		        if(arr[j]<=arr[j+1])
		        {
		            continue;
		        }
		        else
		        {
		            c=1;
		            break;
		        }
		    }
		    if(c==0)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		     System.out.println("0");   
		    }
		    t--;
		}
		
	}
}