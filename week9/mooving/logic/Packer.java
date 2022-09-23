package week9.mooving.logic;

import week9.mooving.domain.Box;
import week9.mooving.domain.Thing;

import java.util.List;

public class Packer {

    Packer packer = new Packer(10);

    private List<Thing> things;
    // we ask our packer to pack things into boxes
    List<Box> boxes = packer.packThings( things );

    public Packer(int i) {
    }


    public List<Box> packThings(List<Thing> things) {
        return null;
    }
}
