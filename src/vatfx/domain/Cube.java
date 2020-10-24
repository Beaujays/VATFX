package vatfx.domain;

public class Cube extends Shape {

    // region Constructor
    public Cube (String name, String shape, int volume, int length, int height, int depth){
        super(name, shape, volume, length, height, depth);
    }

    @Override
    public String toString() {
        return name + " (length: " + value1 + ", depth: " + value2+ ", height: "
                + value3 + ", volume: " + volume+ "m3)";
    }
}