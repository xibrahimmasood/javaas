package ifelse;

public class AlphabetOrNot {

public static void main(String[] args) {
		
		char ch;
		ch = 'R';
		
		if ( ((ch >= 97) && (ch <= 122)) || ((ch >= 65) && (ch <= 90))) {
			System.out.println("It is an Alphabet");
		}
		else  {
			System.out.println("It is not an alphabet");
		}
	}
	

}

