
package lab9;
import java.util.Stack;
import java.util.Scanner;

	    public class DelimiterChecker {
		private char[] stackArray;
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
		
		public boolean check(String str)
		{   
			boolean valid = false;
			int size = str.length();
			
			// push the opening delimiter into the stack
			for( int i = 0; i< size; i++)
			{
				if(str.charAt(i)== '(' || str.charAt(i) == '{' || str.charAt(i) =='[')
					 DelimiterChecker.push(str.charAt(i));
			}
			// the stack is empty 
			if (stackArray== null)
				System.out.println(" missing left delimiter");
			else 
			{
				// check the closing delimiter
				for(int j = 0; j < size; j++)
				{
					if(str.charAt(j) == ')' || str.charAt(j) == '}' || str.charAt(j) ==']')
					{
						DelimiterChecker.pop();
						
				
					}
					
				}
				
			
		}

		
		}
	}


