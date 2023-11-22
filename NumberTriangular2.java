package ifelse;

public class NumberTriangular2 {
	public static void main(String[] args) {
		/*
		 * 		1
		 * 	  2  2
		 *   3  3  3
		 *  4  4  4  4
		 *5  5   5  5  5
		 */
		for(int r=1,gap=14;r<=5;r++) {// 3
			for(int y=1;y<=gap;y++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {// 3
				System.out.print(r+"   ");
			}
			System.out.println();
			gap = gap -2;
			}
		
		
	}

}
