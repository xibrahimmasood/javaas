package ifelse;

public class CharecterLowerOrUpper {
	public static void main(String[] args) {
	
	char ch;
	ch = 'R';
	
	if ( (ch >= 97) && (ch <= 122)) {
		System.out.println("Character is Lower Case");
	}
	else if ( (ch >= 65) && (ch <= 90)) {
		System.out.println("character is Upper Case");
	}
}
}
