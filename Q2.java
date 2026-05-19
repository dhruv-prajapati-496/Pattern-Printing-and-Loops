package Loops_AndPatternPrinting;

import java.util.Scanner;
// printing numbers which are divisible by 3 till n;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++) {
            if(i%3==0) System.out.println(i);
        }
    }
}
