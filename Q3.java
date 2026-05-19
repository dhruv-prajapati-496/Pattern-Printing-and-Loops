package Loops_AndPatternPrinting;

import java.util.Scanner;
/* printing a sequence like:
1
n
2
n-1
3
n-2
_________________
1
where n is input given by user;
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int m=1,d;
        int n = sc.nextInt();
        d=n;
        for(int i=1;i<=n*2;i++){
            if(i%2==0) {
                System.out.println(d);
            d=d-1;
             }
            else {
                System.out.println(m);
                m=m+1;}}
        }
        }


