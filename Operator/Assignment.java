package Operator;

public class Assignment {
    public static void main(String[] args) {
         // Simple assignment operator
         int a = 10;
         System.out.println("Initial value of a: " + a);
 
         // Compound assignment operators
         a += 5; // a = a + 5
         System.out.println("After a += 5: " + a);
 
         a -= 3; // a = a - 3
         System.out.println("After a -= 3: " + a);
 
         a *= 2; // a = a * 2
         System.out.println("After a *= 2: " + a);
 
         a /= 4; // a = a / 4
         System.out.println("After a /= 4: " + a);
 
         a %= 3; // a = a % 3
         System.out.println("After a %= 3: " + a);
 
         // Example with another variable type
         String name = "John";
         System.out.println("Initial value of name: " + name);
 
         name += " Doe"; // name = name + " Doe"
         System.out.println("After name += \" Doe\": " + name);
 
    }
    
}
