package ifelse;

public class minValue {

			
			static int findMin(int n) {
				int digit;
				int min = 9;
				
				while(n>0) {
					digit = n % 10;
					n /= 10;
					if (digit< min) min = digit;
				} 
				return min;
			}
			
			

			public static void main(String[] args) {
				int number = 24175795;
				System.out.println("Min Value is " + findMin(number));

			}

		}

