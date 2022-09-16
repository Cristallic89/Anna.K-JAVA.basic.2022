package week7;

import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int weightLimit;

    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase){
        int weightCurrent = this.totalWeight();
        if(weightCurrent + suitcase.totalWeight() <= this.weightLimit) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    public int totalWeight(){
        int weightCurrent = 0;
        for (Suitcase currentSuitcase :this.suitcases) {
            weightCurrent += currentSuitcase.totalWeight();
        }
        return weightCurrent;
    }


}