package ifelse;

public class lastPrimeNum2 {


		
		static boolean isPrime(int num) {
		
			for(int i=2;i< num;i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		}

		static int findLastPrime(int start, int end) {
			int lastPrime= -1;
			for(int i=start;i<=end;i++) {
				if(isPrime(i) == true) {
					lastPrime=i;
				}
				
			} 
			return lastPrime ; 
		}
		
		public static void main(String[] args) {
			System.out.println(findLastPrime(1,100));

		
			
		}

	}
