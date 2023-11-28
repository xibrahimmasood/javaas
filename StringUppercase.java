package ifelse;
import java.util.*;
public class StringUppercase {
	
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String: ");
	String str = sc.next();
	
	String newStr = str.toUpperCase();
	System.out.println(newStr);
	
	}
}
