class Papa
{
	void fun()
	{
		System.out.println("Hi, I am papa");
	}
}
class Beta extends Papa
{
	void fun()
	{
		System.out.println("Hi, I am beta.");
	}
	void papafun()
	{
		super.fun();
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta b=new Beta();
		b.fun();
		b.papafun();//to call parents function
	}

}
