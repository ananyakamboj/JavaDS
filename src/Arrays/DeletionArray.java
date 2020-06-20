package Arrays;
//deleting an element from array
public class DeletionArray {
	static void delete(int arr[], int e)
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==e)
			{
				j=i;
				break;
			}
		}
		for(int i=j;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=new int[5];
		int arr[]= {12,34,45,6,13};
		delete(arr,13);
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
