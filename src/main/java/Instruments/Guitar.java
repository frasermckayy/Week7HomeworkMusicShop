package Instruments;

public class Guitar extends Instrument{

    private int strings;




    public Guitar(String material, String colour, Type type, int age, String model, double buyPrice, double sellPrice, int strings ) {
        super(material, colour, type, age, model, buyPrice, sellPrice);
        this.strings = strings;

    }

    public int getStrings() {
        return strings;
    }

    public String Play(){
        return "Strum Strum";
    }
}
