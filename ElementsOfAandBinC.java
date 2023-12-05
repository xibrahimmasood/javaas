package ifelse;

public class ElementsOfAandBinC {

		public static void main(String[] args) {
			int a[] = {10,20,30,40,50,60};
			int b[] = {100,200,300,400,500,600};
			int c[] = new int[a.length + b.length];
			
			for(int i=0;i<a.length;i++) {
				c[i] = a[i];
			}
			for(int i=a.length;i<c.length;i++) {
				c[i] = b[i - a.length]; //As were starting from a.length which is 6,so i is 6
			}							//so on right we want to start from 1 so we minus a.length
										//ex. 6: 6-6 0 ; 7: 7-5 2.........
			System.out.println("A array elements: ");
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println("\nB array elements: ");
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
			System.out.println("\nC array elements: ");
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i]+" ");
			}
		}

	}


