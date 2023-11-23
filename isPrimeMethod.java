package ifelse;

public class isPrimeMethod {
	
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
		for(int i=start;i<=end;i++) {
			if(isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		printPrimeNos(1,100);

	
		
	}

}
