package ifelse;

public class lastprimeMethod {

		
		static boolean isPrime(int num) {
			int count = 0;
			for(int i=1;i<=num;i++) {
				if(num % i == 0) {
					count++;
				}
			}
			if(count == 2) return true;
			else return false;
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
