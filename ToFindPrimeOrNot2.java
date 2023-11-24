package ifelse;

public class ToFindPrimeOrNot2 {


		static boolean toFindNumPrimeOrNot(int n){
			int i=2;
			for(;i<n/2;i++) {
				if( n % i == 0) {
					return false;
				}
			}
			return true;
			
		}
		public static void main(String[] args) {
		
			int num =199;
			System.out.println("Result----->"+toFindNumPrimeOrNot(num));
			
		
		
		
		
		}

		
		
	}
