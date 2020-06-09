package AccessModifiers;

public class first {
	private int a=5;
	int b=10;
	protected int c=15;
	public int d=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first f=new first();
		System.out.println(f.a);//private
		System.out.println(f.b);//default or package private
		System.out.println(f.c);//protected
		System.out.println(f.d);//public
	}

}
