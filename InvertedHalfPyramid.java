package apnaCollege;
import java.util.*;
public class InvertedHalfPyramid {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter rows v: ");
			int r = sc.nextInt();
			System.out.print("Enter Columns >: ");
			int c = sc.nextInt();
			
			for(int i=r; i>=1; i--) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
					
				} System.out.println();
			}
		}

	}
