import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String result=NumberFormat.getCurrencyInstance().format(1234567.891);
        System.out.println(result);
    }
}
