package ifelse;

public class SumOfDigitsMethods {
	
	static int sumOfDigits(int n) {
		int digit;
		int sum = 0;
		
		while(n>0) {
			digit = n % 10;
			sum  += digit;
			n /= 10;
		} 
		return sum;
	}
	
	

	public static void main(String[] args) {
		int number = 25;
		System.out.println("The sum is:" +sumOfDigits(number));

	}

}


