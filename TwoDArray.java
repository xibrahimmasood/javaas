package apnaCollege;
import java.util.*;
public class TwoDArray {
  //2D Arrays
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
		 System.out.println("Matrix with "+r+"x"+c+" is: ");
		 for(int i=0;i<r;i++) {
			 for(int j=0;j<c;j++) {
				System.out.print(num[i][j]+" ");
				 
			 }System.out.println();
		 }
			
			
		}
		

	}
