package ifelse;

public class PrimeNosInRangePlusSum {
	
		/*
		write a java program to print prime number 
		in between 50 to 105 ,then sum of the prime numbers?	
		
		*/
		
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

		static void printPrimeNos(int start, int end) {
			int sum = 0;
			for(int i=start;i<=end;i++) {
				
				if(isPrime(i) == true) {
					System.out.print(i+", ");
					sum += i;
					
				}
			} System.out.println("\nThe sum is: "+sum);
		}
		
		public static void main(String[] args) {
			printPrimeNos(50,105);	
		}
        
		
		
		
	

		
	}


