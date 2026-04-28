package basics;

import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        Iterator<String> iteratorObj = list.listIterator(1);

        System.out.println("Elements from 2nd position:");

        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }
}