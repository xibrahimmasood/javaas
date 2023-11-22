package ifelse;

public class NumberTriangular {
	public static void main(String[] args) {
		/*
		 * 		1
		 * 	  2  2
		 *   3  3  3
		 *  4  4  4  4
		 *5  5   5  5  5
		 */
		
		 for (int i = 1; i <= 5; i++) { 
	            // inner loop to print space 
	            for (int j = 1; j <= 5 - i; j++) { 
	                System.out.print(" "); 
	            } 
	            // inner loop to print star 
	            for (int j = 1; j <= i; j++) { 
	                System.out.print(i + " "); 
	            } 
	            // print new line for each row 
	            System.out.println(); 
	        } 
	    } 
		
	}


