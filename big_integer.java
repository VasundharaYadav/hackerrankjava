import java.math.BigInteger;
import java.util.Scanner;

public class big_integer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());
        
        
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        
        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }
}

    

