package summarizer;

public class Car {

    private int horsePower;
    private String brand;
    private Engine engine;

    public enum Engine {
        V4,
        V6,
        V8
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
