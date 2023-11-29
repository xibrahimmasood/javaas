package apnaCollege;
import java.util.*;
public class HollowRectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows v : ");
		int r = sc.nextInt();
		System.out.print("Enter columns > : ");
		int c = sc.nextInt();
		
		//Nested loop; Outer for rows; Inner for Columns
		/*for(int i=1;i<=r;i++) {
			if(i==1||i==r) {
			for(int j=1;j<=c;j++) {
			System.out.print("* ");
			}
			}
			else{
				for(int j=1;j<=c;j++) {
					if(j==1||j==c) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
		}
			
		} System.out.println();
	}
	*/
		
		for(int i =1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(i == 1||j==1 || i == r || j ==c) {
					System.out.print("* ");
				}  else {
					System.out.print("  ");
				}
			} System.out.println();
		}
		
	
	}
	}
