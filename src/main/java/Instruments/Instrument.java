package Instruments;


import behaviours.IPlay;

public abstract class Instrument implements IPlay {

   private String material;
   private String colour;
   private String type;
   private int age;


    public Instrument(String material, String colour, String type, int age) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.age = age;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }
}
