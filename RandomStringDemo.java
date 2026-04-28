package snippet;
import java.util.*;

public class RandomStringDemo {

    static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars.charAt(rand.nextInt(chars.length()));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int len = sc.nextInt();

        System.out.println("Random String: " + generateRandomString(len));
    }
}