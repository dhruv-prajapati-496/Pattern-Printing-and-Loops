package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--) System.out.println(i);
    }
}
