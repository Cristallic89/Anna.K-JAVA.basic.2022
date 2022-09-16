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
        int weightCurrent = this.totalWeight();
        if(weightCurrent + thing.getWeight() <= this.weightLimit) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        int weightCurrent = this.totalWeight();
        if(weightCurrent == 0) {
            return "empty (" + weightCurrent + " kg)";
        }
        return this.things.size() + " things (" + weightCurrent + " kg)";
    }

    public void printThings(){
        for (Thing thing :this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        int weightCurrent = 0;
        for (Thing currentThing :this.things) {
            weightCurrent += currentThing.getWeight();
        }
        return weightCurrent;
    }
}