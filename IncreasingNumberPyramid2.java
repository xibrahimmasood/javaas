package ifelse;

public class IncreasingNumberPyramid2 {
		public static void main(String[] args) {
			/*
			 * 1
			 * 12
			 * 123
			 * 1234
			 * 12345
			 * 
			 */
			for(int v=1,r=10;r<=15;r++,v++) {
				for (int c=1;c<v;c++) {
					System.out.print(c +" ");
				}
				System.out.println();
			}
			
		}

	}



