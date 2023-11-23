package ifelse;

public class Sumofdigits {
	
	public static void main(String args[]) { 
		int number,digit,sum =0;
		number = 25;
		while(number>0) {
		digit = number % 10;
		sum += digit;
		number = number / 10;
	}
		System.out.println("The sum of digits is : "+sum);
		
	}
	
}

