package ifelse;

public class EvenOddSum {

		public static void main(String[] args) {
		
			
		// 1+2+3+4+5+6+7+8+9+10;
			// eSum = 2+4+6+8+10
			// oSum = 1+3+5+7+9
			int eSum =0, oSum=0;
			for (int e=2,o=1;  e<=10||o<=10  ;e=e+2,o=o+2 ) {
				eSum = eSum + e;
				oSum = oSum+e;
			}
			System.out.println("Total Even Sum--->"+eSum);
			System.out.println("Total Odd Sum--->"+oSum);
			
			
		
		
		}

	}

