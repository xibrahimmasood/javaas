package ifelse;

public class NumPrimeOrNot {
		static boolean toFindNumPrimeOrNot(int n){
			boolean isPrime = true;
			
			for(int i=2;i<n/2;i++) {
				if( n % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}
		public static void main(String[] args) {
		
			int num =11;
			System.out.println("Result----->"+toFindNumPrimeOrNot(num));
			
		
		
		
		
		}

		
		
	}
