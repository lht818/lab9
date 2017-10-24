
package lab9;
import java.util.Stack;
import java.util.Scanner;

	public class DelimiterChecker {
		
		/**
		 * 
		 * @param a is the opening delimiter
		 * @param b is the closing delimiter
		 * @return
		 */
		public boolean DelimiterCheck( char a, char b)
		{   
			boolean isValid = false; 
			if (a=='(' && b ==')')
				return  isValid = true;
			if ( a=='{' && b =='}')
				return isValid = true;
			if (a=='[' && b==']')
				return isValid = true;
			
			return isValid;
		}
		/**
		 * 
		 * @param str is a string
		 * @return
		 */
		
		public boolean Check(String str)
		{   
			boolean valid = false;
			int size = str.length();
			Stack test = new Stack();
			
			// the stack is empty 
			if (test== null)
				System.out.println(" missing left delimiter");
			else
			{
				// push the opening delimiter into the stack
				for( int i = 0; i< size; i++)
				{
					if(str.charAt(i)== '(' || str.charAt(i) == '{' || str.charAt(i) =='[')
						 test.push(str.charAt(i));
				}
			}
			// check if the closing delimiter match opening delimiter 
        	while(test!=null){
	        	for( int i = 0; i< size; i++)
				{
					if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) ==']')
					{
						char x = (char) test.pop();
						if(DelimiterCheck(x,str.charAt(i))== true){
							System.out.println("the delimiters are match");
							return valid= true;
						}
						else{
							System.out.println("the delimiters are unmatch");
							return valid = false;
						}
					}
	        	}
				return valid;
			}
            return valid;
        }
        
		public static void main(String[]args)
		{
			Scanner console = new Scanner(System.in);
			System.out.println("Please enter the statement:");
			String input = console.next();
				
			DelimiterChecker object =new DelimiterChecker();
			object.Check(input);
		}
		
		
	}


