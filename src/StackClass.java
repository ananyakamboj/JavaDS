import java.util.*;
//Stack is a predefined class in 
public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> s=new Stack<>();//Generic Data Type<T>
		s.push(5);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		
		
		
		Stack <Character> s2=new Stack<>();
		s2.push('a');
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.isEmpty());
		
	}

}
