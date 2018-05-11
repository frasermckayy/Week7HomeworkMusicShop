package Instruments;

public class Piano {

    private int keys;
    private int pedals;
    private int music;
    private int tuner;

    public Piano(int keys, int pedals, int music, int tuner) {
        this.keys = keys;
        this.pedals = pedals;
        this.music = music;
        this.tuner = tuner;
    }


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



