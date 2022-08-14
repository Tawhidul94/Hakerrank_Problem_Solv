import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrenceyFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        Locale localein = new Locale("en", "in");
        NumberFormat localeinFormatter = NumberFormat.getCurrencyInstance(localein);

        Locale localeChina = new Locale("zh", "cn");
        NumberFormat localeChinaFormatter = NumberFormat.getCurrencyInstance(localeChina);

        Locale localeFrance = new Locale("fr", "FR");
        NumberFormat localeFranceFormatter = NumberFormat.getCurrencyInstance(localeFrance);


        // Write your code here.

        System.out.println("US: " + currencyFormatter.format(payment));
       System.out.println("India: " + localeinFormatter.format(payment));
        System.out.println("China: " + localeChinaFormatter.format(payment));
        System.out.println("France: " + localeFranceFormatter.format(payment));
    }
}
