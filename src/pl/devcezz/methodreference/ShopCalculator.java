package pl.devcezz.methodreference;

import java.util.function.BiFunction;

public class ShopCalculator {

    private final int quantity;
    private final double prize;

    public ShopCalculator(int quantity, double prize) {
        this.quantity = quantity;
        this.prize = prize;
    }

    public double calculate(BiFunction<Integer, Double, Double> function) {
        return function.apply(quantity, prize);
    }
}
