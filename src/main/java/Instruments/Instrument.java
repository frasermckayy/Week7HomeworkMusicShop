package Instruments;
import behaviours.ISell;
import behaviours.IPlay;


public abstract class Instrument implements IPlay, ISell {

   private String material;
   private String colour;
   private Type type;
   private int age;
   private String model;
   private double buyPrice;
   private double sellPrice;


    public Instrument(String material, String colour, Type type, int age, String model, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.age = age;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public Type getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public double getBuyPrice(){
        return buyPrice;
    }

    public double getSellPrice(){
        return sellPrice;
    }


}
