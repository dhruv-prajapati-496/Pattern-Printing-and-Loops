package Loops_AndPatternPrinting;

import java.util.Scanner;
// printing factors of a given number ( 1 is not included )
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=n-1; i+=1) {
            if (n%i==0) System.out.println(i);
        }
    }
}
