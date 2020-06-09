package AccessModifiers2;
import AccessModifiers.first;

public class third extends first {
	void fun()
	{
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first f=new first();
//		System.out.println(f.a);//private field
		//System.out.println(f.b);//alag package mein nahi chal raha
		//System.out.println(c);//protected
		System.out.println(f.d);//public
		third a3=new third();
		a3.fun();
	}

}
