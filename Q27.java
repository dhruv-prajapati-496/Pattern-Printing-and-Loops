package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int i = 97; i<=n+96;i++) {
            for ( int j =n+96; j>=i;j--) {System.out.print((char)j+ " ");  }
            System.out.println("");
        }

    }
}
