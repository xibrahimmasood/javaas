package ifelse;

public class AUB {

	public static void main(String[] args) {
		  int a[] = {10, 20, 30, 40, 50, 60};
	        int b[] = {12, 10, 20, 303, 405, 500};
	        int res[] = new int[a.length + b.length];
///A U B
	   int resIndex = 0;
	   for(int i=0;i<a.length;i++,resIndex++) {
		   res[resIndex] = a[i];
	   }
	   
	   
	   
	   for(int i=0;i<b.length;i++) {
		   boolean found = false;
		   for(int j=0;j<a.length;j++) {
			   if(a[j] == b[i]) {
				   found = true;
			   }  
		   }if(found == false) res[resIndex++] = b[i];  
	   }  
	        
	        for(int i=0;i<resIndex;i++) {
	        	System.out.print(res[i]+" ");
	        }
}
}
//10 20 30 40 50 60 12 303 405 500 
//10 20 30 40 50 60 12 303 405 500 