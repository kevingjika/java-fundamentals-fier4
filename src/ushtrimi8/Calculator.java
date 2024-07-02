package ushtrimi8;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        float vlera = Calculator.calculate();
        System.out.println("Vlera = " + vlera); // Nese veprimi eshte pjestim dhe numri i dyte eshte 0, vlera del nje numer shume i madh (MAX_VALUE).
    }
    public static float calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Enter the operator : ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the second number : ");
        float secondNumber = scanner.nextFloat();
        switch (operator) {
            case '+' :
                return firstNumber + secondNumber;
            case '-' :
                return firstNumber - secondNumber;
            case '*' :
                return firstNumber * secondNumber;
            case '/' :
                if (secondNumber == 0) {
                    System.out.println("Can not divide by zero.");
                    return Integer.MIN_VALUE; // return Integer.MIN_VALUE; Mund te behet secila prej tyre.
                } else {
                    return firstNumber / secondNumber;
                }
            default: System.out.println("Invalid operator.");
        }
        return Integer.MIN_VALUE;
    }
}
