package Loops_AndPatternPrinting;

import java.util.Scanner;
//Bridge
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        int nsp = 1;
        for(int l =1; l<=2*n+1;l++) System.out.print("* ");
        System.out.println();
        for(int i = 1;i<=n;i++){
            for(int j = i;j<=n;j++) {
                System.out.print("* ");

            }
            for (int k=1;k<=nsp;k++){
                System.out.print("  ");
            }
            for(int j = i;j<=n;j++) {
                System.out.print("* ");

            } nsp+=2;

            System.out.println();
            }
            }
    }

