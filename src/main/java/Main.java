import java.awt.*;
import java.security.Principal;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("enter principal loan amount ");
        int principal = scanner.nextInt();
        System.out.println("enter monthly interest rate");
        float interest = scanner.nextFloat();
        System.out.println("number of payment over the loan's lifetime");
        int numberOfPayment = scanner.nextInt();
        double mortgage = principal * (interest * Math.round(1 + (interest)* numberOfPayment)) /
                Math.ulp(1 + (interest) *numberOfPayment)- 1;
        System.out.println(mortgage);

        }
        ;
    }


