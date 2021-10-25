package Oct25;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter second number: ");
        int b = s.nextInt();
        System.out.println("Select Option: \n 1 - Add \n 2 - Subtract \n 3 - Multiply\n 4 - Divide");
        int opt = s.nextInt();
        s.close();
        switch (opt) {
            case 1 -> System.out.println("Result: " + (a + b));
            case 2 -> System.out.println("Result: " + (a - b));
            case 3 -> System.out.println("Result: " + (a * b));
            case 4 -> System.out.println("Result: " + (a / b));
        }
    }
}
