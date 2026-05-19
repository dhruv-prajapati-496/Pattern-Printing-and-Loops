package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Q36
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        for(int i = 65;i<=n+64;i++){
            for(int j = 65;j<=n-i+65+63;j++) {
                System.out.print("  ");

            } for ( int j=65; j<=i;j++){

                System.out.print((char)i+" ");

            }
            System.out.println();}
    }
}
