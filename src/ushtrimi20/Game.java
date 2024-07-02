package ushtrimi20;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number from 0 to 100 : ");
        int userNumber = scanner.nextInt();
        if (userNumber >= 0 && userNumber <= 100) {
            Random random = new Random();
            int start = 0;
            int end = 100;
            int randomNumber = random.nextInt(end-start+1)+start;
            System.out.println("Your number = " + userNumber);
            System.out.println("Random number = " + randomNumber);
            if (userNumber > randomNumber) {
                System.out.println("Too much!");
            } else if (userNumber < randomNumber) {
                System.out.println("Not enough!");
            } else {
                System.out.println("Congratulations!");
            }
        } else {
            System.out.println("Wrong number!");
        }
    }
}
