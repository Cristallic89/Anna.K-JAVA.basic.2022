package week9;

import week9.mooving.domain.Box;
import week9.mooving.domain.Item;
import week9.mooving.domain.Thing;
import week9.mooving.logic.Packer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        // the things we want to pack
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));
        things.add(new Item("passport", 2));

        // we create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: "+box.getVolume()+" dm^3");
            System.out.println(box);
        }
    }
}