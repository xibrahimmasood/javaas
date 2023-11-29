package apnaCollege;
import java.util.*;
public class ReverseNumberTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=2;j<=i;j++) {  //j=2 starts printing from left   
				System.out.print(" ");
		} for(int j=i; j<=n;j++) {
			System.out.print(j+" ");
		}System.out.println();
			} 
		
	}	
		
		

	}


