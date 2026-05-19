package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n = sc.nextInt();

        for(int i = 65; i<=n+64;i++) {
            for(int j = 65; j<=n+64; j++){ System.out.print((char)j + " ");}
            System.out.println(" ");
        }

    }
}
