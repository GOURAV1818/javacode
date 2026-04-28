package basics;

import java.util.*;

public class RemoveColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        colors.remove(1); // Remove 2nd element
        colors.remove("Blue"); // Remove Blue if present

        System.out.println("After Removal: " + colors);
    }
}