package basics;
import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Before Swapping:");
        System.out.println(list);

        Collections.swap(list, 0, 2);

        System.out.println("After Swapping:");
        System.out.println(list);
    }
}