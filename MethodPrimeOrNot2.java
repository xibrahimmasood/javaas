package ifelse;

public class MethodPrimeOrNot2 {

	static boolean toFindNumPrimeOrNot(int n){
		int i=2;
		boolean res = true;
		
		for(;(i<n/2) && (n % i != 0);i++);
		
		if(i < n/2) res = false;
		return res;
	}
	public static void main(String[] args) {
	
		
		// last digit should be 7 which is prime number
		
		for(int i=200,m=0;i>=100;i--) {
			if ( (toFindNumPrimeOrNot(i) == true) && ((i % 10 == 7))) {
				m = (i / 10) % 10;
				if(m < 8)
				System.out.print(i+" ");
				
				
			}
		}
	
	
	
	}

	
	
}
