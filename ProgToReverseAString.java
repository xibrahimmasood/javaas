package ifelse;
import java.util.*;
public class ProgToReverseAString {
	public static void main(String args[]) {
	System.out.print("Enter the string: ");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String newStr = "";
	
	
	for(int i = str.length() -1; i>=0; i-- ) {
		newStr += str.charAt(i);
	}
	
	System.out.print("\nAfter Reversing: "+newStr);

	
	

}
}