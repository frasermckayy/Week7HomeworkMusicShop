package Instruments;

import behaviours.IPlay;

public class Drum{

    private int sticks;
    private int pedals;
    private int silencers;
    private int tuner;
    private String play;

    public Drum(int sticks, int pedals, int silencers, int tuner) {
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
