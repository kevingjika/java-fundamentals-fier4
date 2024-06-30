package ushtrimi1;
import java.util.Scanner;
public class Rrethi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jep diametrin e rrethit ne njesi : ");
        float diametri = scanner.nextFloat();
        float rrezja = diametri / 2;
        float perimetri = (float) (2 * Math.PI * rrezja);
        double perimetri2 = 2 * Math.PI * rrezja;
        System.out.println("Perimetri ne float = " + perimetri + " njesi");
        System.out.println("Perimetri ne double = " + perimetri2 + " njesi");
    }
}

// Kur te bejme run programin, nese do te japim vlere dhjetore ne terminal, duhet te perdorim presje dhe jo pike.
// Per shembull : 5,7. Jo 5.7.
