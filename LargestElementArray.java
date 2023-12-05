package ifelse;

public class LargestElementArray {

	public static void main(String[] args) {
		int[] num = {10,2,3,45,643,3,2,1,99,123};
		
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
