package ifelse;

public class Methods2 {


		static void design(char c1, char c2){
			for(int i=1;i<=10;i++) {
				System.out.print(c1);
			}
			for(int i=1;i<=10;i++) {
				System.out.print(c2);
			}
		}

		public static void main(String[] args) {
			
			design('.','!');
			System.out.println("\nHello");
			design(',','!');
			
			System.out.println("\nWelcome");
			design('@','%');
		}

	}
