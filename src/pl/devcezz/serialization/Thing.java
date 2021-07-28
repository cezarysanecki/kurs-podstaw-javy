package pl.devcezz.serialization;

import java.io.Serializable;

public class Thing implements Serializable {

    private final String name;

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
