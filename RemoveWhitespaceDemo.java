package lab3b;

import java.util.*;

public class RemoveWhitespaceDemo {

    static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("After removing spaces: " + removeWhitespace(str));
    }
}