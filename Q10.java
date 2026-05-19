package Loops_AndPatternPrinting;

import java.util.Scanner;
// Reverse Of a Number
public class Q10 {

        // Reverse of a number
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an Integer: ");
            int n = sc.nextInt();
            int rev = 0 ;

            while (n!=0){ rev*=10;
                rev +=(n%10);
                n/=10;

            } System.out.println(rev);
        }
    }

