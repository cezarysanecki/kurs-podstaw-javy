package pl.devcezz.lambda;

@FunctionalInterface
public interface PlnCurrencyCalculator {

    double exchangeForeignToPln(Currency currency, double amount);
}
