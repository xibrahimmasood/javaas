package ifelse;

public class ZeroOneTriangle {

	public static void main(String[] args) {
/*
		0 
		0 1 
		0 1 0 
		0 1 0 1 
		0 1 0 1 0 
*/
		for(int r=1,t;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				if(c%2==0) {
					t=1;
				}else {
					t=0;
				}
				System.out.print(t+" ");
			}
			System.out.println();
		}
		

	}

}
