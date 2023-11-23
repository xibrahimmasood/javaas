package ifelse;

public class EvenOrOrddMethods {
	
	static boolean evenOrOdd(int a) {
		if(a% 2 ==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		int num = 20;
		System.out.println("Result --->" + evenOrOdd(num));
		

	}

}
