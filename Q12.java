package Loops_AndPatternPrinting;

import java.util.Scanner;
// for value of  n's power
public class Q12 {
    public static void main(String[] args) {
        System.out.println("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter its power:");
int ans = 1;
        int pr= sc.nextInt();
        for(int i=1;i<=pr;i++){

           ans*=n;
        }
        System.out.println(ans);
    }
}
