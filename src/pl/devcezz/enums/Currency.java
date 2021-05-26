package pl.devcezz.enums;

public enum Currency {
    PLN(1.0000),
    EUR(4.5298),
    USD(3.7288),
    THB(0.1186);

    private final double exchangeRateToPln;

    Currency(double exchangeRateToPln) {
        this.exchangeRateToPln = exchangeRateToPln;
    }

    public double calculateExchangeRate(Currency currency) {
        return currency.exchangeRateToPln / this.exchangeRateToPln;
    }

    public static Currency findCurrencyByString(String literal) {
        for (Currency currency : values()) {
            if (currency.name().equalsIgnoreCase(literal)) {
                return currency;
            }
        }

        throw new IllegalArgumentException("Unknown currency: " + literal);
    }
}
