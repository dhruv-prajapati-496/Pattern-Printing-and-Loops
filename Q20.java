package Loops_AndPatternPrinting;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int n = sc.nextInt();
        for(int i = 97; i<=n+96;i++) {
            if(i%2!=0)
            { for(int j = 97; j<=n+96; j++){ System.out.print((char)i + " ");}}



            else {for(int k = 65; k<=n+64;k++) {
                if(k%2==0)
                { for(int j = 97; j<=n+96; j++){ System.out.print((char)k + " ");}}


                System.out.println(" ");
                break;
            }}
        }



    }
}
