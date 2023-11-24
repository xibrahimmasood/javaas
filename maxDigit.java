package ifelse;

public class maxDigit {


		
		static int findMax(int n) {
			int digit;
			int max = 0;
			
			while(n>0) {
				digit = n % 10;
				n /= 10;
				if (digit> max) max = digit;
			} 
			return max;
		}
		
		

		public static void main(String[] args) {
			int number = 24375795;
			System.out.println("Max Value is " + findMax(number));

		}

	}


