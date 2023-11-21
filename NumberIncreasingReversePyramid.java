package ifelse;

public class NumberIncreasingReversePyramid {
			public static void main(String[] args) {
				/*
				 * 12345
				 * 1234
				 * 123
				 * 12
				 * 1
				 * 
				 */
				for(int r=5;r>=1;r--) {
					for (int c=1;c<=r;c++) {
						System.out.print(c +" ");
					}
					System.out.println();
				}
				
			}

		}


