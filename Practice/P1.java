// package Practice;
import java.util.*;
/**
 * P1
 */
public class P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = sc.nextInt();
        // if (value % 2 == 0 && value % 3 == 0) {
        if (value % 5 == 0 || value % 3 == 0) {
        System.out.println("Yes= : " +value);
    }else{
        System.out.println("no");
    }
    }
}