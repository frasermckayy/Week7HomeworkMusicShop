package Instruments;

import behaviours.IPlay;

public class Drum extends Instrument{

    private int sticks;
    private int pedals;
    private int silencers;
    private int tuner;

        public Drum(String description, double purchasePrice, double sellPrice, String material, String colour, String make, String model, Type type, int sticks,
        int pedals, int silencers, int tuner) {
            super(description, purchasePrice, sellPrice, material, colour, make, model, type);
            this.sticks = sticks;
            this.pedals = pedals;
            this.silencers = silencers;
            this.tuner = tuner;

    }

    public int getSticks() {
        return sticks;
    }

    public int getPedals() {
        return pedals;
    }

    public int getSilencers() {
        return silencers;
    }

    public int getTuner(){
        return tuner;
    }

    public String getPlay(){
        return "Bodum Tiss";
    }


}
