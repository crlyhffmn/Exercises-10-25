package Oct25;

import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Loan Amount: ");
        long a = s.nextLong();
        System.out.println("Rate of Interest: ");
        double b = s.nextDouble();
        System.out.println("Tenure (in months): ");
        int c = s.nextInt();
        s.close();
        String emi = String.format("%.2f", (a * b * Math.pow((1 + b),c)/Math.pow((1 + b),(c - 1))));
        System.out.println("EMI: " + emi);
    }
}
