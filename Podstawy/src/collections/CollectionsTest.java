package collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Darek");
        names.add("Daga");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void arrayList() {
        List<String> names = new ArrayList<>();
        names.add("Jan");
        names.add("Jan1");
        names.add("Jan2");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (String value: names) {
            System.out.println(value);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
