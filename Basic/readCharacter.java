import java.util.Scanner;

public class readCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        // chatAt use to read string value;
        char ch = sc.next().charAt(0);
        System.out.println("The entered character is: " + ch);

    }
    
}
