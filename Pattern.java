package ifelse;
import java.util.*;
public class Pattern {

	/*
8
8 7
8 7 6
8 7 6 5
8 7 6 5 4
8 7 6 5 4 3
8 7 6 5 4 3 2
8 7 6 5 4 3 2 1
	 */
	
		  public static void main(String args[]) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter number of rows you want to print: ");
		        int n = sc.nextInt();

		        for (int i = n; i >= 1; i--) {
		            for (int j = n; j >= i; j--) {
		                System.out.print(j + " ");
		            }
		            System.out.println();
		        }
		    }
		}



