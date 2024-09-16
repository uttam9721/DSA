import java.util.*;
public class simpleInterested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle");
        float p = sc.nextFloat();

        System.out.println("Enter interested");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        float t = sc.nextFloat();

        float ans = p*r*t/100;
        System.out.println(ans);


    }
    
}
