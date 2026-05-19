package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Q11 {
    // Factorial of a number:
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){

            fac*=i;
        }
        System.out.println(fac);
    }
}
