package snippet;

import java.util.*;

public class NumericCheckDemo {

    static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isNumeric(str))
            System.out.println("String contains only numbers");
        else
            System.out.println("String is not numeric");
    }
}