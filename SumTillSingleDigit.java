package ifelse;

import java.util.*;

public class SumTillSingleDigit {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit,sum=0;
		
		while(true) {
			
			digit = num % 10;
			num /= 10;
			sum += digit;
			
			
			if(num == 0){
				if (sum > 9) {
				num = sum;
				sum = 0;
					}
			 else {
				break;
			}
		}

	}
System.out.println("The final sum upto last digit is: "+sum);
	}
	
}
