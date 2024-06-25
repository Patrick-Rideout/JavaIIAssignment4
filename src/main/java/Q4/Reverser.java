package Q4;

import java.util.LinkedList;
import java.util.ListIterator;

public class Reverser {

    public static void main(String[] args) {
        LinkedList<String> normal = new LinkedList<String>();
        normal.add("A");
        normal.add("B");
        normal.add("C");
        normal.add("D");
        normal.add("E");
        normal.add("F");
        normal.add("G");
        normal.add("H");
        normal.add("I");
        normal.add("J");

        LinkedList<String> reversed = new LinkedList<>();

        ListIterator<String> iterator = normal.listIterator(normal.size());

        while (iterator.hasPrevious()) {
            reversed.add(iterator.previous());
        }

        System.out.println("Original: " + normal);


        System.out.println("Reversed: " + reversed);
    }
}
