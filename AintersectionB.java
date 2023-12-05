package ifelse;

public class AintersectionB {

		public static void main(String[] args) {
			  int a[] = {10, 20, 30, 40, 50, 60};
		        int b[] = {12, 10, 20, 303, 405, 500};
		        int res[] = new int[a.length + b.length];
	///A intersection  B
		   int resIndex = 0;
		   
		   for(int i=0;i<b.length;i++) {
			   boolean found = false;
			   for(int j=0;j<a.length;j++) {
				   if(a[j] == b[i]) {
					   found = true;
				   }  
			   }if(found == true) res[resIndex++] = b[i];  
		   }  
		        
		        for(int i=0;i<resIndex;i++) {
		        	System.out.print(res[i]+" ");
		        }
	}
	}
