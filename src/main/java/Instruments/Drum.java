package Instruments;

import behaviours.IPlay;

public class Drum extends Instrument{

    private int sticks;


        public Drum(String material, String colour, Type type, int age, String model, double buyPrice, double sellPrice, int sticks) {
            super(material, colour, type, age, model, buyPrice, sellPrice);
            this.sticks = sticks;


    }

    public int getSticks() {
        return sticks;
    }

    public String Play(){
        return "Bodum Tiss";
    }


}
