package ifelse;

public class Arrays_4 {

	public static void main(String[] args) {
		// short byte int float double char String
		
		char ch[];
		ch = new char[10];  //same as char[] ch = new char[10]
		ch[0] = '0';
		ch[1] = '1';
		ch[2] = '2';
		ch[3] = '3';
		ch[4] = '4';
		ch[5] = 'a';
		ch[6] = 'b';
		ch[7] = 'c';
		ch[8] = 'd';
		ch[9] = 'e';
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
		
	}
}
		