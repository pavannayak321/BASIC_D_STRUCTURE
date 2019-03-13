import java.util.*;

public class InfixImpl {
	
	
	
	public static  void infixToPrefix(String infix)
	{
		//reversing the string
		String[] sp = infix.split("",infix.length());
		char[] expression =  new char[infix.length()];
		Stack<Character> stack  = new Stack<Character>();
		String prefix = "";
		
		
		int i12 = 0;
		for(int i=(sp.length-1);i>=0;i--)
		{
			expression[i12] = sp[i].charAt(0);
			i12=i12+1;
		}
		//
		for(char a:expression) {System.out.print(a);}
		
		
		for(int j=0;j<expression.length;j++)
		{
			char tmp = expression[j];
			
			//if it a character or letter [1,,a,S,f,F]
			if(Character.isLetterOrDigit(tmp))
			{
				prefix = prefix+tmp;
			
			
			}
			
			//
			else if(tmp=='(')
				{
					stack.push(tmp);
				}
				
				//
			else if(tmp==')')
				{
					while(!stack.isEmpty()&&stack.peek()!='(')
					{
						prefix =prefix+Character.toString(stack.pop());
					}
					
				
			
				//is stack empty
				if(stack.isEmpty())
				{
					System.out.println("NOt a valid expression");
				}
				else
				{
					stack.pop();
				}
			}
			//when operator is encountered
				else
				{
					while(!stack.isEmpty() && precedence(tmp)<=precedence(stack.peek()))
					{
						prefix = prefix+stack.pop();
					}
					stack.push(tmp);
				}
			
			
		}	
		
		System.out.println(prefix);
		
	}

	
	public  static int precedence(Character pre) {
		
		switch(pre)
		{
		case '+':
		case '-':
			return 1;
			
		case '*':
		case '/':
			return 2;
			
		case '^':
			return 3;
		}
		
		return -1;
	}


	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter infix:");
		
		String s = sc.nextLine();
		infixToPrefix(s);
		
		
		//
		InfixImpl impl = new InfixImpl();
		
	}
}
