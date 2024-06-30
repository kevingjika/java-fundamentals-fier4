package ushtrimi5;
import java.util.Scanner;
public class NumratPrime {
    public static boolean isPrime(int numer) {
        for (int i = 2; i < numer; i++) {
            if (numer % i == 0) { // Ky eshte kushti per numrat prime, dmth numrat qe plotepjestohen vetem me veten dhe 1.
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jepni nje numer te plote pozitiv : ");
        int numer = scanner.nextInt();
        if (numer > 0) {
            for (int i = 2; i < numer; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }

        } else {
            System.out.println("Vlera qe vendose nuk eshte e sakte.");
        }
    }
}
