package apnaCollege;

import java.util.Scanner;

public class MirrorImageTrianglePattern {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
		} for(int j=i; j<=n;j++) {
			System.out.print(j+" ");
		}System.out.println();
			} 
		
for(int i=n-1;i>=1;i--) {    //use n-1 to reduce n
			
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
		} for(int j=i; j<=n;j++) {
			System.out.print(j+" ");
		}System.out.println();
			} 
		
	}	
		
		

	}



