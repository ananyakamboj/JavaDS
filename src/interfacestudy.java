interface AB
{
	int x=5;
	void fun();
}
interface CD{
	int x=6;
	void fun();
	void hello();
}
interface XY extends AB,CD
{
	void fun2();
	
}
class X implements AB,CD{
	public void fun()
	{
		System.out.println("I have been overridden and my x is "+CD.x);//ambiguity
		//usin fully qualified name to remove ambiguity
	}
	public void hello()
	{
		System.out.println("Hi, Good Evening!");
	}
}
class Y implements XY{
	public void fun2()
	{
		System.out.println("fun2 overridden");
	}
	public void fun()
	{
		System.out.println("Fun overriden");
	}
	public void hello()
	{
		System.out.println("Hello overridden");
	}
	
}
public class interfacestudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x1= new X();
		x1.fun();
		System.out.println("Accessing interface obj, my x is AB.x :  "+AB.x);
		System.out.println("Accessing interface obj, my x is CD.x :  "+CD.x);
		Y y1=new Y();
		y1.fun2();
		y1.fun();
		y1.hello();
		
	}

}
