package ushtrimi4;

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jep nje numer te plote pozitiv : ");
        int numer = scanner.nextInt();
        if (numer > 0) {
            for (int i = 1; i <= numer; i++) {
                if (i % 3 == 0 && i % 7 == 0) { // Ky kusht duhet gjithmone i pari ne renditje.
                    System.out.println("Fizz buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 7 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Vlera qe vendose nuk eshte e sakte.");
        }
    }
}
