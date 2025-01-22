import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
         Locale usLocale = Locale.US;
        String us = NumberFormat.getCurrencyInstance(usLocale).format(payment);

       
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

       
        Locale chinaLocale = Locale.CHINA;
        String china = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);

       
        Locale franceLocale = Locale.FRANCE;
        String france = NumberFormat.getCurrencyInstance(franceLocale).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}