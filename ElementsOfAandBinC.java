package ifelse;

public class ElementsOfAandBinC {

		public static void main(String[] args) {
			int a[] = {10,20,30,40,50,60,70,80};
			int b[] = {1,2,3,4,5,6,7,8};
			int c[] = new int[a.length + b.length];
			
			for(int i=0;i<a.length;i++) {
				c[i] = a[i];
			}
			for(int i=a.length;i<c.length;i++) {
				c[i] = b[i - a.length];
			}
			
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


