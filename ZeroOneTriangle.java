package apnaCollege;
import java.util.*;
public class ZeroOneTriangle {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i;j++) {
				if((i+j)%2 ==0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
				
			}
		} System.out.println();
	}
	
	}
	
}

/*
1,1 
2,1 2,2 
3,1 3,2 3,3 
4,1 4,2 4,3 4,4 
5,1 5,2 5,3 5,4 5,5 
*/