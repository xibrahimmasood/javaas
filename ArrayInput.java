package ifelse;
import java.util.*;
public class ArrayInput {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the array: ");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			num[i] = sc.nextInt();
		}
		
		int max = num[0];
		int min = num[0];
				for(int i=0;i<num.length;i++) {
					if(num[i]> max) {
						max = num[i];
					}
				}
		for(int i=0;i<num.length;i++) {
						if(num[i]< min) {
							min = num[i];
						}
				} System.out.println("Max value: "+ max);
				System.out.println("Min value: "+ min);
				
	}

}
