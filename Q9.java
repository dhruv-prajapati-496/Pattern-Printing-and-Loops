package Loops_AndPatternPrinting;

import java.util.Scanner;
//Print sum of all digits of a number:
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int n = sc.nextInt();
        int sum = 0;
        int Rem;
        while (n!=0){
            Rem = n%10;
            n/=10;
          sum+=Rem;
        } System.out.println((sum>0) ? sum:-sum);
    }
}
// Works b/w -2147483648 to 2147483647