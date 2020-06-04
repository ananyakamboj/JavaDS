class Papa
{
	int age=45;
	void fun()//Same signature
	{
		System.out.println("Hi, I am papa");
	}
	Papa()
	{
		System.out.println("Default constructor of Papa: My dad's age is"+this.age);
	}
}
class Beta extends Papa
{
	int age=20;
	void fun()//same signature
	{
		System.out.println("Hi, I am beta.");
	}
	void papafun()
	{
		super.fun();
	}
	Beta()
	{
		System.out.println("My age is "+this.age);
		System.out.println("My papa's age is "+super.age);//referring to instance variable of parent class
		
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
