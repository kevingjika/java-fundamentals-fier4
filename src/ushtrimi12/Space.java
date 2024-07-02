package ushtrimi12;
import java.util.Scanner;
public class Space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String text = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        System.out.println("Number of spaces = " + count);
    }
}