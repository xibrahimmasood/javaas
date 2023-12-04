package ifelse;
import java.util.*;
public class StringLenthwithoutLenFunc {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str = sc.next();
	int count = 0;
	for (char c : str.toCharArray()) {
	    count++;
	}
	System.out.println("String length: " + count);
	
	
}
}
