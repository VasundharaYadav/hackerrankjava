import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        String A = sc.next();
        String B = sc.next();
        
        
        System.out.println(A.length() + B.length());

       
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        sc.close();
    }
}
