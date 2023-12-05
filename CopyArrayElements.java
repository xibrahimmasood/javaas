package ifelse;

public class CopyArrayElements {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80};
		int b[] = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		
		System.out.println("A array elements: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\nB array elements: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]+" ");
		}
	}

}
