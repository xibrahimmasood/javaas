package apnaCollege;
import java.util.*;
public class PalindromeTrianglePattern {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("  ");
			}for(int j=i;j>=1;j--) {
				System.out.print(j+ " ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+ " ");
			}System.out.println();
			
		}
		
		
		
	}

}
