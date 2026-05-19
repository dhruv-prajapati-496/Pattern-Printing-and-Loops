package Loops_AndPatternPrinting;

import java.util.Scanner;
// printing A to Z with their ASCII value
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 65;i<=90;i++) {
            char ch = (char)i;
            System.out.println(ch+" "+i); }
    }
}
