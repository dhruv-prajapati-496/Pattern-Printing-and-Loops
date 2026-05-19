package Loops_AndPatternPrinting;

import java.util.Scanner;
// printing square by using numbers
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++) {
            for(int j = 1; j<=n; j++){ System.out.print(j + " ");}
            System.out.println(" ");
        }

    }
}
