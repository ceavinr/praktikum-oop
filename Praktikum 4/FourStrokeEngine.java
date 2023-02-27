public class FourStrokeEngine implements Engine {
    private int engineCapacity;

    public FourStrokeEngine(int engineCapacity) {
        // Konstruktor
        this.engineCapacity = engineCapacity;
    }

    @Override
    public int getEngineCapacity() {
        // Kembalikan kapasitas mesin
        return engineCapacity;
    }

    @Override
    public String sound() {
        // Kembalikan "brumbrum"
        return "brumbrum";
    }
}
