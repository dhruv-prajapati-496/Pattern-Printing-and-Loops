package Loops_AndPatternPrinting;

import java.util.Scanner;
// to print a rectangle
public class Q13 {
    // PATTERN PRINTING
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NO. of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter No. of Columns: ");
        int col = sc.nextInt();
        for(int i = 1; i<=row;i++) {
            for(int j = 1; j<=col; j++){ System.out.print("* ");}
            System.out.println();
        }

    }
}
