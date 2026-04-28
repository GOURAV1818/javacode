package lab3b;
import java.util.*;

public class NullOrEmptyCheck {

    static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isNullOrEmpty(str))
            System.out.println("String is null or empty");
        else
            System.out.println("String is not empty");
    }
}