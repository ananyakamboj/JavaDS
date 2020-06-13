import java.util.Scanner;

//program to print fibonacci numbers
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("ENter n:");
		int n=sc.nextInt();
		long n1=0;
		long n2=1;
		long sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(n1+", ");
		}
	

	}

}
