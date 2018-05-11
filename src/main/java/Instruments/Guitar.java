package Instruments;

public class Guitar extends Instrument{

    private int strings;
    private int music;
    private int tuner;



    public Guitar(String description, double purchasePrice, double sellPrice, String material, String colour, String make, String model, Type type, int sticks,
                int pedals, int silencers, int tuner) {
        super(description, purchasePrice, sellPrice, material, colour, make, model, type);
        this.strings = strings;
        this.music = music;
        this.tuner = tuner;
    }

    public int getStrings() {
        return strings;
    }

    public int getMusic() {
        return music;
    }

    public int getTuner() {
        return tuner;
    }

    public String getPlay(){
        return "Strum Strum";
    }
}
