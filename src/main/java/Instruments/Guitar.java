package Instruments;

public class Guitar {

    private int strings;
    private int music;
    private int tuner;


    public Guitar(int strings, int music, int tuner) {
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
