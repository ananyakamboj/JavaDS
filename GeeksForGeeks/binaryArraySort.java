import java.util.*;
import java.lang.*;
import java.io.*;

public class binaryArraySort {

	public static void main (String[] args) {
	     Scanner s=new Scanner(System.in);
         int T=s.nextInt();
         while(T!=0)
         {
             int n=s.nextInt();
             int arr[]=new int[n];
             for(int i=0;i<n;i++)
             {
                 arr[i]=s.nextInt();
             }
             Arrays.sort(arr);
             for(int i=0;i<n;i++)
            {
            System.out.print(arr[i]+" ");
            }
            System.out.println();
            T--;
         }
	}
}