package basics;

import java.util.*;

public class ReverseIterate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        Iterator<String> itr = list.descendingIterator();

        System.out.println("Reverse Order:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}