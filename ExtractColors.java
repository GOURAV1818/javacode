package basics;

import java.util.*;

public class ExtractColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original List: " + colors);

        List<String> sub = colors.subList(0, 2);

        System.out.println("Extracted Elements: " + sub);
    }
}