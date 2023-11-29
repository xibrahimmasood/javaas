package apnaCollege;
import java.util.*;
public class Triangle {


	///Same code as 180 Inverted pyramid with just reduce one space in first loop
	 

				public static void main(String args[]) {
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter N(R&C): ");
					int n = sc.nextInt();
					
					for(int i = 1;i<=n;i++) {
						for(int j = 1;j<=n-i;j++) {
						System.out.print(" ");
						}
						for(int j =1;j<=i;j++) {
							System.out.print("* ");
						}
						
						System.out.println();
						} 
					}
				}
				
			