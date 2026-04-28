package basics;
import java.util.*;

public class DeleteNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        Scanner sc = new Scanner(System.in);

        System.out.println("Original List: " + colors);
        System.out.print("Enter index to delete: ");
        int n = sc.nextInt();

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After Deletion: " + colors);
        } else {
            System.out.println("Invalid Index");
        }
    }
}