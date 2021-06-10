package pl.devcezz.things;

public abstract class Thing {

    abstract void doSomething();

    final public String interactWith() {
        doSomething();
        return "Interaction completed";
    }

    public static void main(String[] args) {

    }
}
