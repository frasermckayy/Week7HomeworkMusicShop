package Instruments;


import behaviours.IPlay;
import itmes.Item;

public abstract class Instrument extends Item implements IPlay {

   private String material;
   private String colour;
   private String type;
   private int age;
   private String model;


    public Instrument(String material, String colour, String type, int age, String model) {
        super(description, purchasePrice, sellPrice)
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.age = age;
        this.model = model;
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

    public String getModel() {
        return model;
    }
}
