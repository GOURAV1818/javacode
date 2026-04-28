package basics;

import java.util.*;

public class DisplayPosition {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Elements with Positions:");

        for (int p = 0; p < list.size(); p++) {
            System.out.println("Position " + p + " = " + list.get(p));
        }
    }
}