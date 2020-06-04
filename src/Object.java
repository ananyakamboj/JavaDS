class Student
{
	int roll_no;
	String name;
	//constructor
	//default constructor
//	Student()
//	{
//		System.out.println("Hello there.");
//	}
	
	//parametrized constructor
	Student(int rno,String name)
	{
		this.name=name;
		this.roll_no=rno;
	}
}
public class Object {

	public static void main(String[] args)
	{
		Student s1= new Student(1,"Ark");//default wasn't called
		//Student s2=new Student();
	}
}


