package ushtrimi7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vendosni nje numer te plote pozitiv ose 0 : ");
        int index = scanner.nextInt();
        if (index >= 0) {
            int fibonaci = Fibonaci.llogaritjaEFibonacit(index);
            System.out.print("Fibonaci ne indeksin " + index + " eshte " + fibonaci + ".");
        } else {
            System.out.println("Numri qe vendoset nuk eshte i sakte.");
        }
    }
}
