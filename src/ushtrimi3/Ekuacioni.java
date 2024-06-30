package ushtrimi3;
import java.util.Scanner;
public class Ekuacioni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Jep vleren e a : ");
        a = scanner.nextInt();
        System.out.print("Jep vleren e b : ");
        b = scanner.nextInt();
        System.out.print("Jep vleren e c : ");
        c = scanner.nextInt();
        double delta = Math.pow(b,2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("delta = " + delta);
            System.out.println("Delta negative");
            System.out.println("Ekuacioni nuk ka zgjidhje.");
        } else if (delta > 0) {
            double x1 = (-b-Math.sqrt(delta)) / (2 * a);
            double x2 = (-b+Math.sqrt(delta)) / (2 * a);
            System.out.println("delta = " + delta);
            System.out.println("Delta pozitive");
            System.out.println("Ekuacioni ka 2 rrenje.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else {
            double x1 = (-b-Math.sqrt(delta)) / (2 * a);
            System.out.println("delta = " + delta);
            System.out.println("Ekuacioni ka 1 rrenje.");
            System.out.println("x1 == x2 : " + x1);
        }
    }
}
