package Loops_AndPatternPrinting;

import java.util.Scanner;
//  printing square with alphabets
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n = sc.nextInt();

        for(int i = 97; i<=n+96;i++) {
            for(int j = 97; j<=n+96; j++){ System.out.print((char)j + " ");}
            System.out.println(" ");
        }

    }
}
