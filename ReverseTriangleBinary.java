package ifelse;
import java.util.*;
public class ReverseTriangleBinary {
	
	public static void main(String args[] ) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter N: ");
	int n = sc.nextInt();
	
	for(int i=n;i>=1;i--) {
		for(int j=n-i;j>=1;j--) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if((i+j) % 2 == 0) System.out.print("1 ");
			else System.out.print("0 ");
			
			
		} System.out.println();
		}
	}
	
	
	
}

