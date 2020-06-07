abstract class A
{
	int age=10;
	void sayHello()
	{
		System.out.println("Hello!");
	}
	abstract void tellAge(int age);
	
}
class B extends A
{
	int age=20;
	void tellAge(int age)
	{
		this.age=age;
		System.out.println("I am "+age+" years old. ");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.sayHello();
		b.tellAge(30);
	}

}
