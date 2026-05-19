package Loops_AndPatternPrinting;

import java.util.Scanner;
// to print factors of n number
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n-1; i++) {
            if (n%i==0) System.out.println(i);

        }
    }
}
