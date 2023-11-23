package ifelse;

public class CurrencyConvertMethods {

    static float convertToRupees(String country, float currency) {

        if (country.equalsIgnoreCase("US")) {
            return currency * 83.5f;
        } else if (country.equalsIgnoreCase("UK")) {
            return currency * 120f;
        } else if (country.equalsIgnoreCase("UAE")) {
            return currency * 220f;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {

        float rupees = convertToRupees("US", 100);
        System.out.println("US Dollar --->" + rupees);

        rupees = convertToRupees("UK", 100);
        System.out.println("UK pounds --->" + rupees);

        rupees = convertToRupees("UAE", 100);
        System.out.println("UAE Dinar --->" + rupees);
    }
}
