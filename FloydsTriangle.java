package apnaCollege;
import java.util.*;
public class FloydsTriangle {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);	
	System.out.print("Enter N(Rows): ");
	int n = sc.nextInt();
	 
	for(int i=1,d=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(d +" ");
			d++;
		} System.out.println();
	}
		
		
		
		
		
		
	}

}
