package pl.devcezz.methodreference;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceClass {

    public static void main(String[] args) {
        Function<String, Integer> anonymous = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> lambda = s -> s.length();

        Function<String, Integer> methodReference = String::length;

        Consumer<String> consumer = MethodReferenceClass::print;
        Consumer<String> consumer2 = MethodReferenceClass::print;
        consumer.accept("Peter");

        MethodReferenceClass object = new MethodReferenceClass();
        Consumer<String> objectConsumer = object::printClass;

        ShopCalculator calculator = new ShopCalculator(10, 87.99);
        double result = calculator.calculate(MethodReferenceClass::calculateUsing70PercentDiscount);
        System.out.println(result);
    }

    public static double calculateUsing70PercentDiscount(int quantity, double prize) {
        double discount = 0.7;
        return quantity * prize * discount;
    }

    public static void print(String name) {
        System.out.println("Name");
        System.out.println("Exception");
        System.out.println(name);
    }

    public void printClass(String name) {
        System.out.println(name);
    }

    public void calculateUsing70PercentDiscount() {
        Consumer<String> consumer = this::printClass;
    }
}
