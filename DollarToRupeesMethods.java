package ifelse;

public class DollarToRupeesMethods {
	static float dollarInRupees(){
		return 83.5f;
	}
		
		static String indiaCapital(){
			return "Delhi";
		}
		
		public static void main(String args[]) {
			float dollar = 100f;
			float rupees = dollar * dollarInRupees();
			
			System.out.println("Indian Rupees ------> " +rupees);
			System.out.println("Indian Capital ------> " + indiaCapital());
			
		
	}

}
