package week9.mooving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int capasity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.capasity = maximumCapacity;
        things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing){
        if(thing.getVolume() <= this.capasity) {
            this.things.add(thing);
            this.capasity -= thing.getVolume();
            return true;
        }
        return false;
    }

    public int getVolume(){
        int thingsCapasity = 0;
        for (Thing thing:this.things) {
            thingsCapasity += thing.getVolume();
        }
        return thingsCapasity;
    }

    @Override
    public String toString() {
        String content = "";
        for (Thing thing:this.things) {
            content += "\t" + thing.toString() + "\n";
        }
        return content;
    }
}