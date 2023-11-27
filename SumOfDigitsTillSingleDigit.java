package ifelse;

public class SumOfDigitsTillSingleDigit {

	static int sumOfDigits(int n) {
		int digit;
		int sum = 0;
		
		while(n>0 || sum > 9) {
			
			if (n == 0) {
                n = sum;
                sum = 0;
            }else {
			digit = n % 10;
			sum  += digit;
			n /= 10;
            }
		} 
		return sum;
	}
	
	

	public static void main(String[] args) {
		int number = 12345;
		System.out.println("The sum is:" +sumOfDigits(number));

	}

}


