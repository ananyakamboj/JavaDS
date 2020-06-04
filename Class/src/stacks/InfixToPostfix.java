package stacks;
import java.util.*;
public class InfixToPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input infix exp");
		String s=sc.nextLine();
		
		System.out.println(infixtoPostfixUtil(s));
	}
	static String infixtoPostfixUtil(String s)
	{
		String res="";
		Stack<Character> st= new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			
			//operand case
			if(Character.isDigit(c))
			{
				res=res+c;
			}
			//operator
			else
			{
				while(!st.isEmpty()&&Prec(st.peek())>=Prec(c))
				{
					res=res+st.pop();
				}
				st.push(c);
			}
		}
		while(!st.isEmpty())
		{
			res=res+st.pop();
		}
		return res;
	}
	static int Prec(char c)
	{
		if(c=='+'||c=='-') return 1;
		if(c=='*'||c=='/') return 2;
		return 0;
	}
}
