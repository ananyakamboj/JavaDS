class Car{
	String name;
	int manYear;
	String color;
	
	
	Car()
	{
		System.out.println("I am the default constructor of the class Car.");
	}
	Car(String name,String color, int manYear)//constructor one
	{
		this.name=name;
		this.color=color;
		this.manYear=manYear;
	}
	Car(String name,String color)//second constructor
	{
		this.name=name;
		this.color=color;
	}
	
	void print()
	{
		System.out.println("Name: "+name+"\nColor: "+color+"\nYear: "+manYear);
	}
	
}
class Audi extends Car{
	int topSpeed;
	
	Audi()
	{
		System.out.println("This is the default constructor of Audi.");
	}
	
	
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ford=new Car("Figo","Black");
		ford.print();

	}

}
