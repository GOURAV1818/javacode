package snippet;

import java.util.*;

public class TruncateStringDemo {

    static String truncate(String str, int length) {
        if (str.length() <= length)
            return str;
        else
            return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter max length: ");
        int len = sc.nextInt();

        System.out.println("Output: " + truncate(str, len));
    }
}