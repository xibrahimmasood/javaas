package ifelse;

public class AMinusB {
	public static void main(String[] args) {
		  int a[] = {10, 20, 30, 40, 50, 60};
	        int b[] = {12, 10, 20, 303, 405, 500};
	        int res[] = new int[a.length + b.length];
///A Minus  B
	   int resIndex = 0;
	   
	   
	   for(int i=0;i<a.length;i++) {
		   boolean found = false;
		   for(int j=0;j<b.length;j++) {
			   if(a[i] == b[j]) {
				   found = true;
				   
			   }  
		   }if(found == false) res[resIndex++] = a[i];  
	   }  
	        
	        for(int i=0;i<resIndex;i++) {
	        	System.out.print(res[i]+" ");
	        }
}
}