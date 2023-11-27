package ifelse;
import java.util.*;
public class SwappingStringValWithoutTemp {

	
	
	
		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter first word(S1): ");
			String s1 = sc.next();
			System.out.print("Enter second word(S2): ");
			String s2 = sc.next();
			
			System.out.println("Before Swapping: ");
			System.out.println("S1--------->" + s1);
			System.out.println("S2--------->" +s2);
			
			s2 = s2+s1;
			s1= s2.substring(0,s2.length()-s1.length());
			s2 = s2.substring(s1.length());
			
			System.out.println("After Swapping: ");
			System.out.println("S1--------->" + s1);
			System.out.println("S2--------->" +s2);
			

	/*
	Here's a breakdown of the code:

	1. Accepts two strings (s1 and s2) as input from the user.
	2. Prints the values of s1 and s2 before swapping.
	3. Concatenates s1 and s2 and stores the result in s1.
	4. Uses the substring method to extract the original value of s2 and assigns it to s2.
	5. Uses the substring method again to extract the original value of s1 and assigns it to s1.
	6. Prints the values of s1 and s2 after swapping.


	*/
			
			
			
		}

	}
