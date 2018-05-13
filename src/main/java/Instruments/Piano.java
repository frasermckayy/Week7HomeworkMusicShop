package Instruments;

public class Piano extends Instrument {

    private int keys;
    private int pedals;


    public Piano( String material, String colour, Type type, int age, String model, double buyPrice, double sellPrice, int keys, int pedals) {
        super(material, colour, type, age,model, buyPrice, sellPrice);
        this.keys = keys;
        this.pedals = pedals;

    }

        public int getKeys () {
            return keys;
        }

        public int getPedals () {
            return pedals;
        }


        public String Play() {
            return "Chime Chime Chime";
    }

}





