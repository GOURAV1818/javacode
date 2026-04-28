package basics;

import java.util.*;

public class InsertEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        list.offerLast("Pink");

        System.out.println("After inserting at end:");
        System.out.println(list);
    }
}