package pl.devcezz.serialization;

import java.io.Serializable;

public class Box implements Serializable {

    private transient final int length;
    private final int width;
    private final int height;
    private transient final Thing thing;

    public Box(int length, int width, int height, Thing thing) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.thing = thing;
    }

    public void checkWhatsInside() {
        System.out.println("In box is " + thing.getName());
    }

    public int calculateVolume() {
        return length * width * height;
    }

    public void print() {
        System.out.println("Length: " + length + ", width: " + width + ", height:" + height);
    }
}
