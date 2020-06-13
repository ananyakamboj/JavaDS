package Arrays;

public class jaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][];
		//a[0]= {1,2,3,4}; nahi chalta, will not work in jagged array
		a[0]= new int[]{1,2,3,4};//anonymous array
		a[1]=new int[2];
		a[2]=new int [3];
		a[3]=new int [5];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b[]= {1,2,3,4};
		//b= {4,5,6,7};//can be used while declaration ONLY
		b= new int[]{4,5,6,7};//heap mein naya object create kar raha hai, and new values being assinged
		//anonymous arrays
	}

}
