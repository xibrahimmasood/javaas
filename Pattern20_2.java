package ifelse;

public class Pattern20_2 {

		public static void main(String[] args) {
			
			/*
			1 2 3 4 5 6 7 8 9 
			2 3 4 5 6 7 8 9 1 
			3 4 5 6 7 8 9 1 2 
			4 5 6 7 8 9 1 2 3 
			5 6 7 8 9 1 2 3 4 
			6 7 8 9 1 2 3 4 5 
			7 8 9 1 2 3 4 5 6 
			8 9 1 2 3 4 5 6 7 
			9 1 2 3 4 5 6 7 8 
			
			*/
			
			for(int r=1;r<=9;r++) {
				for(int c=1,v=r;c<=9;c++,v++) {
					System.out.print(v % 10 < r? (v % 10)+1:(v % 10));
					System.out.print(" ");
				}
				System.out.println();
			}
			
		
		}

	}