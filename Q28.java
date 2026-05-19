package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int m = sc.nextInt();
        System.out.println("Enter Number of columns: ");
        int n = sc.nextInt();
        for(int i = 1; i<=m;i++) {
            for ( int j =1; j<=n;j++) {
                if(i==1 || i==m || j==1 || j==n) System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
