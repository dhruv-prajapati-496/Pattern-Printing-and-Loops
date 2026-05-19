package Loops_AndPatternPrinting;

import java.util.Scanner;
// count digits of a given integer
public class Q8 {
    // count digits of a number:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int n = sc.nextInt();
        int c = 0;
        while (n!=0){
            n/=10;
            c++;
        } System.out.println(c);
    }


}
