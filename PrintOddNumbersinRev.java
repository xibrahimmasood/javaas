package ifelse;
import java.util.*;
public class PrintOddNumbersinRev {
	
	static void printOddRev(int start, int end) {
		for(int i=end; i>=start; i--) {
			if(i%2 != 0) {
				System.out.print(i+ ", ");
			}
			
		}
		
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number: ");
		int start = sc.nextInt();
		System.out.println("Enter ending number: ");
		int end = sc.nextInt();
		printOddRev(start, end);
		
	}
	
	
}
