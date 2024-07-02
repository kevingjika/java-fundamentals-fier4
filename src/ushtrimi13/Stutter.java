package ushtrimi13;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Stutter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String [] text = new String [] {scanner.nextLine()};
        Pattern pattern = Pattern.compile("(\\S+)");
        for (String str : text) {
            String result = pattern.matcher(str).replaceAll("$1 $1");
            System.out.println(result);
        }
    }
}
