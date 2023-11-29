package apnaCollege;
import java.util.*;
public class ButterflyPatternPractice {
public static void main(String args[]) {
	System.out.print("Enter N: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i =1;i<=n;i++) {
		for(int j=1;j<= i;j++) { 
			System.out.print("* ");
		}for(int j=1;j<=(2*(n- i));j++) { 
			System.out.print("  ");
		}for(int j=1;j<= i;j++) { 
			System.out.print("* ");
		}System.out.println();
		}

	for(int i =n;i>=1;i--) {
		for(int j=1;j<= i;j++) { 
			System.out.print("* ");
		}for(int j=1;j<=(2*(n- i));j++) { 
			System.out.print("  ");
		}for(int j=1;j<= i;j++) { 
			System.out.print("* ");
		}System.out.println();
	}
}	

}



/*
          1 2 3 4|5 6 7 8           1st part to write left stars
		* - - - -|- - - - *  i=i	2nd print spaces
		* * 1 2 3|4 5 6 * *  i=2	3rd to print remaining stars			
		* * * 1 2|3 4 * * *  3		4st step is to invert the code
		* * * * 1|2 * * * *  4
		* * * * *|* * * * *  5      
		-------------------
		* * * * * * * * * * 
		* * * *     * * * * 
		* * *         * * * 
		* *             * * 
		*                 * 
		for(int j=n;j>=i;j--) {

for(int i=n;i>=1;i--) {
for(int j=1;j<=i;j++) {
		System.out.print("*");
	} 
for(int j=1;j<=(2*(n-i));j++) {
	System.out.print(" ");
}for(int j=1;j<=i;j++) {
	System.out.print("*");
} 

System.out.println();
}
*/