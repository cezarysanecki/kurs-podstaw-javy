package pl.devcezz.collection;

import java.util.*;

public class CollectionClass {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("efg");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        String element = "123";

        list.add(element);

        System.out.println(list);

        list.remove(element);

        System.out.println(list);

        System.out.println("=== FOREACH ===");
        for (String string : list) {
            System.out.println(string);
        }

        list.add("ghf");
        list.add("ghf");

        Set<String> set = new HashSet<>(list);

        System.out.println("======");
        System.out.println(set);

        set.add("123");
        System.out.println(set.size());

        System.out.println("==== LIST ====");
        printCollectionElements(list);

        System.out.println("==== SET ====");
        printCollectionElements(set);
    }

    public static void printCollectionElements(Collection<String> collection) {
        for (String string : collection) {
            System.out.println(string);
        }
    }
}
