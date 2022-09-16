package week7;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int weightLimit;

    public Suitcase(int weightLimit) {
        this.weightLimit = weightLimit;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing){
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        if(weightCurrent + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        return this.things.size() + " things (" + weightCurrent + " kg)";
    }
}