package Instruments;

public class Piano extends Instrument{

    private int keys;
    private int pedals;
    private int music;
    private int tuner;

    public Piano(String description, double purchasePrice, double sellPrice, String material, String colour, String make, String model, Type type, int keys, int
                 pedals, int music, int tuner) {
        super(description, purchasePrice, sellPrice, material, colour, make, model, type);
        this.keys = keys;
        this.pedals = pedals;
        this.music = music;
        this.tuner = tuner;

    public int getKeys() {
        return keys;
    }

    public int getPedals() {
        return pedals;
    }

    public int getMusic() {
        return music;
    }

    public int getTuner() {
        return tuner;
    }

    public String getPlay(){
        return "Chime Chime Chime";
    }
}



