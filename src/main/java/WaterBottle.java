public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void drink() {
        this.volume -= 10;
    }

    public void empty() {
        this.volume -= 100;
    }

    public void fill() {
        empty();
        this.volume += 100;
    }

};