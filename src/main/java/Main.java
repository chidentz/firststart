import java.awt.*;
import java.security.Principal;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       final byte MONTHS_IN_YEAR = 12;
       final byte Percent = 100;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / Percent / MONTHS_IN_YEAR;
        System.out.println("Period(years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = principal
                   * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments));
         String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
         System.out.println("Mortgage: " + mortgageFormatted);
    }
}
