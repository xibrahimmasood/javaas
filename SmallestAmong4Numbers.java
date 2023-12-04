package ifelse;
import java.util.*;

public class SmallestAmong4Numbers {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter four numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        
        int min = Math.min(Math.min(Math.min(a, b), c), d);
        System.out.println("Minimum number: " + min);

    }
}
