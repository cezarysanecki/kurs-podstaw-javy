package pl.devcezz.interfaces;

public interface QuackAbility {

    default void quack() {
        System.out.println("Quack, quack");
    }
}
