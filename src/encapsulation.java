class Impl{
	private String name=null;
	private int age=100;
	
	public String getName(){
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impl a=new Impl();
		a.setAge(200);
		a.setName("Ark");
		a.getAge();
		a.getName();
	}

}
