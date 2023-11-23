package ifelse;

public class FindMaxOf3Nos {

	static int findMax(int x, int y, int z) {
		
		if ((x>y) && (x>z)) {
			return x;
	} 
		else if(y>z) {
			return y;
		}
		else {
			return z;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(findMax(4,5,6));
		
		
			
		}

	}


