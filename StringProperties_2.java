package ifelse;
import java.util.*;
public class StringProperties_2 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first word(S1): ");
		String s1 = sc.next();
		System.out.print("Enter second word(S2): ");
		String s2 = sc.next();
		
		System.out.println("Before Swapping: ");
		System.out.println("S1--------->" + s1);
		System.out.println("S2--------->" +s2);
		
		s1 = s1+s2;
		s2= s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After Swapping: ");
		System.out.println("S1--------->" + s1);
		System.out.println("S2--------->" +s2);
		
		
	}

}
