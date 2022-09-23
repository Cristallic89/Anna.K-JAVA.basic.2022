package week9;

import week9.mooving.domain.Item;
import week9.mooving.domain.Thing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
    }
}