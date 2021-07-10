package pl.devcezz.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaClass {

    public static void main(String[] args) {
        PlnCurrencyCalculator anonymous = new PlnCurrencyCalculator() {

            @Override
            public double exchangeForeignToPln(Currency currency, double amount) {
                return currency.getExchangeRateToPln() * amount;
            }
        };

        PlnCurrencyCalculator lambda = (Currency currency, double amount) -> currency.getExchangeRateToPln() * amount;

        Predicate<String> predicate = (name) -> name.contains("g");
        boolean ghf = predicate.test("ghf");
        System.out.println(ghf);

        Consumer<String> consumer = (name) -> System.out.println(name);
        consumer.accept("John");

        Supplier<String> supplier = () -> "123";
        String s = supplier.get();
        System.out.println(s);

        Function<String, Integer> function = (name) -> name.length();
        Integer length = function.apply("Jane");
        System.out.println(length);

        double result = method(
                (currency -> currency.equals(Currency.GBP)),
                ((currency, amount) -> currency.getExchangeRateToPln() * amount),
                Currency.GBP
        );
        System.out.println(result);

        double result2 = method(
                (currency -> currency.equals(Currency.GBP)),
                ((currency, amount) -> currency.getExchangeRateToPln() * amount),
                Currency.CHF
        );
    }

    public static double method(Predicate<Currency> predicate, PlnCurrencyCalculator plnCurrencyCalculator, Currency currency) {
        if (predicate.test(currency)) {
            return plnCurrencyCalculator.exchangeForeignToPln(currency, 100);
        } else {
            throw new RuntimeException("Exception");
        }
    }
}
