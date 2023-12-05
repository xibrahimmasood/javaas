package apnaCollege;
import java.util.Scanner;
public class FindXinMatrix {
		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter R: ");
			int r = sc.nextInt();
			System.out.print("\nEnter C: ");
			int c = sc.nextInt();
			
			 int num[][] = new int[r][c];
			System.out.println("\nEnter elements of matrix: ");
			 for(int i=0;i<r;i++) {
				 for(int j=0;j<c;j++) {
					num[i][j] = sc.nextInt();
					 
				 }
			 }
			 System.out.println("\nEnter X: ");
			 int x = sc.nextInt();
			 
			 for(int i=0;i<r;i++) {
				 for(int j=0;j<c;j++) {
					if(num[i][j] ==x) {
						System.out.println(x+" is at ["+i+"]["+j+"]");
					}
					 
				 }
			 }
				
				
			}
			

		}

