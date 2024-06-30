package ushtrimi2;
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jep peshen ne kg : ");
        float peshaNeKilogram = scanner.nextFloat();
        System.out.print("Jep gjatesine ne centimeter : ");
        int gjatesiaNeCentimeter = scanner.nextInt();
        double gjatesiaNeMeter = ((double) gjatesiaNeCentimeter) / 100;
        System.out.println("Gjatesia = " + gjatesiaNeMeter);
        gjatesiaNeMeter = Math.pow(gjatesiaNeMeter, 2);
        System.out.println("Gjatesia ne katror = " + gjatesiaNeMeter);
        double bmi = ((double) peshaNeKilogram) / (gjatesiaNeMeter);
        System.out.println("BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("Nenpeshe");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else {
            System.out.println("Mbipeshe");
        }
    }
}
