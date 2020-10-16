package moneycalculator_v0;

import java.util.Scanner;

/**
 *
 * @author FernandoSanfielReyes
 */
public class MoneyCalculator_v0 {

    public static void main(String[] args) {
        System.out.println("Introduce una cantidad en dolares: ");
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.next());
        double exchangeRate = getExchangeRate("USD", "EUR");
        System.out.println(amount + " USD equivalen a " + amount * exchangeRate + " EUR");
    }
    
    private static  Double getExchangeRate (String from, String to){
        String line = "{'USD_EUR':{'val':0.860155}}";
        String processed_line = line.substring(line.indexOf(to) + 12, line.indexOf("}"));
        return Double.parseDouble(processed_line);
    }
    
}
