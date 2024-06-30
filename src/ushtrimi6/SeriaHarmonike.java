package ushtrimi6;
import java.util.Scanner;
public class SeriaHarmonike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jepni nje numer te plote pozitiv : ");
        int numer = scanner.nextInt();
        double shuma = 0.0;
        if (numer > 0) {
            for (int i = 1; i <= numer; i++) {
                // System.out.println("Shuma = " + shuma + " iteracioni : " + i);
                shuma = shuma + (double) 1 / i; // Formula e serise harmonike
            }
            System.out.println("Shuma = " + shuma);
        } else {
            System.out.println("Vlera qe vendose nuk eshte e sakte.");
        }
    }
}
