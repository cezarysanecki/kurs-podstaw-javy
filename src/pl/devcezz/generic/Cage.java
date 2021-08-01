package pl.devcezz.generic;

public class Cage<T extends Animal> {

    private final T content;

    public Cage(T content) {
        this.content = content;
    }

    public void print() {
        System.out.println("In cage is " + content.getClass());
    }
}
