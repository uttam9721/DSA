package Operator;

public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Logical AND (&&)
        System.out.println((a > b) && (b > 0)); // true && true => true

        // Logical OR (||)
        System.out.println((a > b) || (b < 0)); // true || false => true

        // Logical NOT (!)
        System.out.println(!(a == b)); // !(false) => true
    }
}
