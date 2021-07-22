package pl.devcezz.resources;

public class Chest implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Chest has been closed!");
    }
}
