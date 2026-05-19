package Loops_AndPatternPrinting;

public class Q7 {
    // Example of Continue statement
    // continue statement is used to skip the iteration:
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            if(i==15) continue; // iteration is skipped so 15 is not printed:
            System.out.println(i + " Good Morning");
        }
    }
}
