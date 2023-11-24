package ifelse;

public class Recursionfactorial {
	
	static int factorialIteration(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			int value = 1;
			for (int i=1;i<=n;i++) {
				value *= i;
				
			} 
			return value;
			
		}
	} 
				
			
	static int factorialRecursion(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return n* factorialRecursion(n-1);
				
			}
		}
		
	
	
	public static void main(String args[]) {
	
		int num=6;
		System.out.println("Recursion --->"+factorialRecursion(num));
		System.out.println("Iteration --->"+factorialIteration(num));
		
	}
	
	
	
	
	

}
